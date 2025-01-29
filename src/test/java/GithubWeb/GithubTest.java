package GithubWeb;

import Base.BaseClass;
import Pages.Loginpages;
import org.testng.annotations.Test;

public class GithubTest extends BaseClass {

    @Test
    public void loginPageMethod() throws InterruptedException {
        Loginpages login = new Loginpages (driver);

        login.openGitUrl();
        login.clickOnSignInBtn();
        login.clickOnsigupButton();
        login.clickOntermbutton();
        login.clickOnprivcyButton();
        login.clickOnpricingbtn();
        login.clickOnjoinfreebtn();

    }
}

