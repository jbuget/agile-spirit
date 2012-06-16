package com.agile.spirit.wxp;

import org.apache.wicket.util.tester.WicketTester;
import org.junit.Before;
import org.junit.Test;

import com.agile.spirit.wxp.WicketApplication;
import com.agile.spirit.wxp.presentation.pages.user.list.UserListPage;

/**
 * Simple test using the WicketTester
 */
public class TestHomePage
{
  private WicketTester tester;

  @Before
  public void setUp()
  {
    tester = new WicketTester(new WicketApplication());
  }

  @Test
  public void homepageRendersSuccessfully()
  {
    //start and render the test page
    tester.startPage(UserListPage.class);

    //assert rendered page class
    tester.assertRenderedPage(UserListPage.class);
  }
}
