package com.agile.spirit.wxp.presentation.pages.user.list;


import com.agile.spirit.wxp.WicketPage;
import com.agile.spirit.wxp.presentation.components.user.list.UserList;
import com.agile.spirit.wxp.presentation.components.user.search.UserSearchPanel;

public class UserListPage extends WicketPage {

  private static final long serialVersionUID = -3419842779210496187L;

  UserSearchPanel userSearchPanel;
  UserList userList;
  
  public UserListPage() {
    super();
    buildUserSearchPanel();
    buildUserList();
  }

  private void buildUserSearchPanel() {
    userSearchPanel = new UserSearchPanel("userSearchPanel");
    add(userSearchPanel);
  }
  
  private void buildUserList() {
    userList = new UserList("userList");
    add(userList);
  }

}
