package com.agile.spirit.wxp.application;

import java.util.List;

import com.agile.spirit.wxp.domain.User;

public interface UserService {

  List<User> find(UserSearchCriteria criteria);

  User getById(Integer id);

  User saveOrUpdate(User user);

  boolean delete(Integer id);
  
  User authenticate(String email, String password);

  User getByEmail(String email);

}
