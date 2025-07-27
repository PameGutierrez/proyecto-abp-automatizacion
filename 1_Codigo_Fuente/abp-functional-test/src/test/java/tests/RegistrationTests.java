package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RegisterPage;
import utils.CsvDataProvider;

public class RegistrationTests extends BaseTest {
  @Test(dataProvider="userData", dataProviderClass=CsvDataProvider.class)
  public void registrationFlows(String user, String pass, String expected) {
    RegisterPage rp = new RegisterPage(driver);
    rp.open();
    rp.register("Test"+user, user+"@mail.com", pass);
    if (expected.equals("success")) {
      Assert.assertTrue(rp.isSuccess(), "Se esperaba registro exitoso");
    } else {
      Assert.assertFalse(rp.isSuccess(), "Se esperaba fallo de registro");
    }
  }
}
