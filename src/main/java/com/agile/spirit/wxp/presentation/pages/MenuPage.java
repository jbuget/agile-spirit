package com.agile.spirit.wxp.presentation.pages;


import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;

import com.agile.spirit.wxp.presentation.pages.user.form.UserFormPage;
import com.agile.spirit.wxp.presentation.pages.user.list.UserListPage;

public class MenuPage extends WebPage {

  public MenuPage() {
    super();
    add(new BookmarkablePageLink("userListPage", UserListPage.class));
    add(new BookmarkablePageLink("userFormPage", UserFormPage.class));
  }

}
