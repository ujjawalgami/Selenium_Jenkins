package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;


public class LoginPage {
    private WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id="username")
    @CacheLookup
    WebElement username ;
    @FindBy(id="KPI_Password")
    @CacheLookup
    WebElement password ;
    @FindBy(className="mt-5")
    @CacheLookup
    WebElement submit ;
    public void setUsername(String uname){
        username.sendKeys(uname);


}
public  void  setPassword(String pwd){
        password.sendKeys(pwd);
}
public void setSubmit(){
        submit.click();
}



}



