package com.agile.spirit.wxp;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

import com.agile.spirit.wxp.presentation.pages.MenuPage;
import com.agile.spirit.wxp.presentation.pages.user.form.UserFormPage;
import com.agile.spirit.wxp.presentation.pages.user.list.UserListPage;

public class Application extends WebApplication {

  @Override
  public void init() {
    mountPage("/users/list", UserListPage.class);
    mountPage("/users/form", UserFormPage.class);
  }

  @Override
  public Class<? extends Page> getHomePage() {
    return MenuPage.class;
  }

}
