package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static ObjectsPath.GithubPaths.*;

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
    public void clickOnsigupButton(){
        WebElement signupButton = driver.findElement(Signup);
        signupButton.click();
    }
    public void clickOntermbutton(){
        WebElement termbutton = driver.findElement(terms);
        termbutton.click();
    }
    public void clickOnprivcyButton(){
        WebElement privcyButton = driver.findElement(privcy);
        privcyButton.click();
    }
    public void clickOnpricingbtn(){
        WebElement pricingbtn = driver.findElement(pricing);
        pricingbtn.click();
    }
    public void clickOnjoinfreebtn(){
        WebElement joinfreebt = driver.findElement(joinfree);
        joinfreebt.click();
    }
}
