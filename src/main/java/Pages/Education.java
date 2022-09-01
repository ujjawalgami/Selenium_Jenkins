package Pages;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Education {
    private  WebDriver driver;

    public Education(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="//p[text()=\"My Education\"]")
    @CacheLookup
    WebElement education;
    @FindBy(xpath="//span[text()=\"Add\"]")
    @CacheLookup
    WebElement add_button;
    @FindBy(xpath="/html/body/ngb-modal-window/div/div/addeducation/div[2]/form/div/div[1]/div/div/input")
    @CacheLookup
    WebElement degree;
    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/addeducation/div[2]/form/div/div[2]/div/div/div/input")
    @CacheLookup
    WebElement university;
    @FindBy(xpath = "//button[@class=\"btn btn-primary\"]")
    @CacheLookup
    WebElement Add_Button_Edu;
    @FindBy(xpath = "//p[@class=\"ng-star-inserted\"]")
    @CacheLookup
    WebElement Text;
    public  void setEducation(){
        education.click();
    }
    public void setAdd_button(){
        add_button.click();
    }
    public  void setDegree(String deg){
        degree.sendKeys(deg);
    }
    public void setUniversity(String univer){
        university.sendKeys(univer);
    }
    public  void setAdd_Button_Edu(){
        Add_Button_Edu.click();
    }
    public  void setText(){
        String v=Text.getText();
        System.out.println(v);
        
    }
}
