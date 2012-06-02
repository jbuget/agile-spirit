package com.agile.spirit.wxp.application;

import java.util.List;

import com.agile.spirit.wxp.domain.User;

public interface UserService {

  List<User> find(String filter);

  User getById(Integer id);

  User saveOrUpdate(User user);

  boolean delete(Integer id);

}
