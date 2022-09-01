package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class About {
    private WebDriver driver;
    public About(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="//em[@class=\"fonticon-menu\"]")
    @CacheLookup
    WebElement ninedot;

    @FindBy(xpath="//*[@id=\"moremenu\"]/div/div[2]/a[7]/div/img")
    @CacheLookup
    WebElement exploreCareer;

    public  void setNinedot()
    {
        ninedot.click();
    }
    public void setExploreCareer()
    {
        exploreCareer.click();
    }
}
