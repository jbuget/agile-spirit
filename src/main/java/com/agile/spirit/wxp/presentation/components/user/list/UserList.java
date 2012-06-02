package com.agile.spirit.wxp.presentation.components.user.list;

import java.util.List;

import org.apache.wicket.markup.html.basic.EnumLabel;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import com.agile.spirit.wxp.application.UserServiceImpl;
import com.agile.spirit.wxp.domain.Country;
import com.agile.spirit.wxp.domain.Gender;
import com.agile.spirit.wxp.domain.Nationality;
import com.agile.spirit.wxp.domain.User;
import com.agile.spirit.wxp.presentation.pages.user.form.UserFormPage;

public class UserList extends Panel {

  private static final long serialVersionUID = 4907116541209734919L;

  /* Components */
  ListView<User> list;

  public UserList(String id) {
    super(id);
    buildList();
  }

  private void buildList() {
    IModel<List<User>> listModel = new LoadableDetachableModel<List<User>>() {

      private static final long serialVersionUID = -1767742978019334027L;

      @Override
      protected List<User> load() {
        return UserServiceImpl.getInstance().find(null);
      }
    };

    list = new ListView<User>("list", listModel) {

      private static final long serialVersionUID = 2317275167796337315L;

      @Override
      protected void populateItem(final ListItem<User> item) {
        final User user = item.getModelObject();
        item.add(new Label("id", user.getId().toString()));
        item.add(new Label("lastName", user.getLastName()));
        item.add(new Label("firstName", user.getFirstName()));
        item.add(new EnumLabel<Gender>("gender", user.getGender()));
        item.add(new EnumLabel<Nationality>("nationality", user.getNationality()));
        item.add(new EnumLabel<Country>("country", user.getCountry()));
        item.add(new Label("area", user.getArea()));
        item.add(new Label("email", user.getEmail()));

        final PageParameters params = new PageParameters();
        params.add("user", user.getId());
        item.add(new BookmarkablePageLink<UserFormPage>("edit", UserFormPage.class, params));
        item.add(new Link<Integer>("delete", new Model<Integer>(user.getId())) {
          @Override
          public void onClick() {
            UserServiceImpl.getInstance().delete(getModelObject());
          }
        });
      }
    };
    add(list);
  }

}
