package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.CsvDataProvider;

public class LoginTests extends BaseTest {
  @Test(dataProvider="userData", dataProviderClass=CsvDataProvider.class)
  public void loginFlows(String user, String pass, String expected) {
    LoginPage lp = new LoginPage(driver);
    lp.open();
    lp.loginAs(user+"@mail.com", pass);
    if (expected.equals("success")) {
      Assert.assertFalse(lp.hasError(), "No debió haber error");
    } else {
      Assert.assertTrue(lp.hasError(), "Se esperaba mensaje de error");
    }
  }
}
