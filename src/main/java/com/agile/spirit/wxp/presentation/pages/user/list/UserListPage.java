package com.agile.spirit.wxp.presentation.pages.user.list;


import org.apache.wicket.markup.html.WebPage;

import com.agile.spirit.wxp.application.UserServiceImpl;
import com.agile.spirit.wxp.presentation.components.user.list.UserList;
import com.agile.spirit.wxp.util.DataGenerator;

public class UserListPage extends WebPage {

  UserList userList;

  public UserListPage() {
    if (UserServiceImpl.getInstance().find(null).size() == 0) {
      DataGenerator.generateData();
    }
    buildUserList();
  }

  private void buildUserList() {
    userList = new UserList("userList");
    add(userList);
  }

}
