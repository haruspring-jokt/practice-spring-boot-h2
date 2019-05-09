package com.haruspring.sample.h2.controller;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTest {

  @Autowired private MockMvc mockMvc;

  @Test
  public void testListUser() throws Exception {
    mockMvc
        .perform(get("/api/v1/user/list"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$[0].id").value(1))
        .andExpect(jsonPath("$[0].firstName").value("弘至"))
        .andExpect(jsonPath("$[1].lastName").value("天山"))
        .andExpect(jsonPath("$[2].email").value("ibushi@njpw.com"))
        .andExpect(jsonPath("$[3].birthday").value("1989-12-04"))
        .andExpect(jsonPath("$", hasSize(5)));
  }

  @Test
  public void testSearchUserByName() throws Exception {
    mockMvc
        .perform(get("/api/v1/user/search?keyword=棚"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$", hasSize(1)))
        .andExpect(jsonPath("[0].lastName").value("棚橋"));
  }

  @Test
  public void testSearchUserByName__emptyResult() throws Exception {
    mockMvc
        .perform(get("/api/v1/user/search?keyword=星"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$", hasSize(0)));
  }
}
