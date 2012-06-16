package com.agile.spirit.wxp;

import org.apache.wicket.Page;
import org.apache.wicket.Session;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.request.Request;
import org.apache.wicket.request.Response;

import com.agile.spirit.wxp.application.UserServiceImpl;
import com.agile.spirit.wxp.presentation.pages.user.form.UserFormPage;
import com.agile.spirit.wxp.presentation.pages.user.list.UserListPage;
import com.agile.spirit.wxp.presentation.pages.user.login.LoginPage;
import com.agile.spirit.wxp.util.DataGenerator;

public class WicketApplication extends WebApplication {

  public WicketApplication() {
    super();
    if (UserServiceImpl.getInstance().find(null).size() == 0) {
      DataGenerator.generateData(10);
    }
  }
  
  @Override
  public void init() {
    mountPage("/users/list", UserListPage.class);
    mountPage("/users/form", UserFormPage.class);
  }

  @Override
  public Class<? extends Page> getHomePage() {
    return LoginPage.class;
  }

  @Override
  public Session newSession(Request request, Response response) {
    return new WicketSession(request);
  }

}
