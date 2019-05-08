package com.haruspring.sample.h2.repository;

import com.haruspring.sample.h2.repository.dao.User;
import java.util.List;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends CrudRepository<User, Integer> {

  List<User> findAll();

  @Query(
      "SELECT id, first_name, last_name, email, birthday FROM user"
          + " WHERE first_name LIKE CONCAT('%',:keyword,'%') OR last_name LIKE CONCAT('%',:keyword,'%') ORDER BY id")
  List<User> findByFirstNameOrLastName(@Param("keyword") String keyword);
}
