package ObjectsPath;
import org.openqa.selenium.By;
public class GithubPaths {


    public static final By signIn = By.xpath("/html/body/div[1]/div[3]/header/div/div[2]/div/div/div/a");
    public static final By username = By.xpath("//input[@id='login_field']");
    public static final By password = By.xpath("//input[@id='password']");

    public static final By signInBtn = By.xpath("//input[@name='commit']");

    public static final By Signup = By.xpath("/html/body/div[1]/div[3]/header/div/div[2]/div/div/a");
    public static final By terms = By.xpath("//a[text()='Terms of Service']");
    public static final By privcy = By.xpath("//a[text()='GitHub Privacy Statement']");
    public static final By pricing = By.xpath("/html/body/div[1]/div[3]/header/div/div[2]/div/nav/ul/li[6]/a");
    public static final By joinfree = By.xpath("//a[text()='Join for free']");



}
