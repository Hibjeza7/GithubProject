package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static ObjectsPath.GithubPaths.*;
import static ObjectsPath.Loginpaths.*;

public class Loginpages {
    WebDriver driver ;
    public Loginpages (WebDriver driver){
        this.driver = driver ;

    }

    public void openGitUrl(){
        driver.get("https://github.com/");
    }

    public void clickOnSignInBtn(){
        WebElement SignInBtn = driver.findElement(signIn);
        SignInBtn.click();
    }


    public void fillEmail(){
        WebElement Email = driver.findElement(email);
        Email.sendKeys("hibaalhamrin@gmail.com");
    }

    public void fillPassword(){
        WebElement Email = driver.findElement(password);
        Email.sendKeys("hiba1234567@1");
    }

    public void ClickOnLogin(){
        WebElement login = driver.findElement(loginbtn);
        login.click();
    }
}
