package com.agile.spirit.wxp.application;

import java.util.ArrayList;
import java.util.List;

import com.agile.spirit.wxp.domain.User;

public class UserServiceImpl implements UserService {

  private static UserService instance;
  private final List<User> list = new ArrayList<User>();
  private Integer index = 1;

  private UserServiceImpl() {
  }

  public static UserService getInstance() {
    if (instance == null) {
      instance = new UserServiceImpl();
    }
    return instance;
  }

  @Override
  public List<User> find(String filter) {
    List<User> result = new ArrayList<User>();
    if (filter != null && !filter.isEmpty()) {
      for (User user : list) {
        if (filter.equalsIgnoreCase(user.getEmail()) || filter.equalsIgnoreCase(user.getFirstName()) || filter.equalsIgnoreCase(user.getLastName())) {
          result.add(user);
        }
      }
    }
    return list;
  }

  @Override
  public User getById(Integer id) {
    if (id != null) {
      for (User user : list) {
        if (user.getId().equals(id)) {
          return user;
        }
      }
    }
    return null;
  }

  @Override
  public User saveOrUpdate(User user) {
    if (user != null) {
      User persisted = getById(user.getId());
      // Save
      if (persisted == null) {
        user.setId(index);
        list.add(user);
        index++;
      } else { // Update
        persisted.setFirstName(user.getFirstName());
        persisted.setLastName(user.getLastName());
        persisted.setGender(user.getGender());
        persisted.setNationality(user.getNationality());
        persisted.setCountry(user.getCountry());
        persisted.setArea(user.getArea());
        persisted.setPassport(user.getPassport());
        persisted.setEmail(user.getEmail());
        persisted.setPassword(user.getPassword());
      }
      return persisted;
    }
    return null;
  }

  @Override
  public boolean delete(Integer id) {
    if (id != null) {
      for (User user : list) {
        if (user.getId().equals(id)) {
          list.remove(user);
          return true;
        }
      }
    }
    return false;
  }

}
