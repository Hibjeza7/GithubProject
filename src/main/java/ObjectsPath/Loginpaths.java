package ObjectsPath;


import org.openqa.selenium.By;

public class Loginpaths {
    public static final By signIn = By.xpath("/html/body/div[1]/div[3]/header/div/div[2]/div/div/div/a");
    public static final By email = By.xpath("//*[@id=\"login_field\"]");
    public static final By password = By.xpath("//*[@id=\"password\"]");
    public static final By loginbtn = By.xpath("//*[@id=\"login\"]/div[4]/form/div/input[13]");

}
