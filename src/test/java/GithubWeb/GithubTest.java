package GithubWeb;

import Base.BaseClass;
import Pages.GitpathPages;
import Pages.Homepages;
import Pages.Loginpages;
import org.testng.annotations.Test;

public class GithubTest extends BaseClass {


    @Test
    public void signUpMethod() throws InterruptedException {
        GitpathPages signUp = new GitpathPages(driver);
        signUp.clickOnSignUp();
        signUp.clickOnTermsLink();
        signUp.clickOnPrivacyLink();


    }
    @Test
    public void loginPageMethod() throws InterruptedException {
        Loginpages login = new Loginpages (driver);

        login.openGitUrl();
        login.clickOnSignInBtn();
        login.fillEmail();
        login.fillPassword();
        login.ClickOnLogin();

    }
    @Test
    public void createRepoMethod() throws InterruptedException {
        Homepages home = new Homepages(driver);

        loginPageMethod();
        home.clickOnNewRepo();
        home.fillRepoName();
        Thread.sleep(2000);
        home.scrollToPosition(0,700);
        home.clickOnCreateRepo();
        Thread.sleep(5000);
    }
}

