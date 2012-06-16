package com.agile.spirit.wxp.presentation.pages.user.login;

import com.agile.spirit.wxp.WicketPage;
import com.agile.spirit.wxp.presentation.components.user.login.LoginForm;

public class LoginPage extends WicketPage {

  
  public LoginPage() {
    super();
    buildLoginForm();
  }

  private void buildLoginForm() {
    add(new LoginForm("loginForm"));
  }

}
