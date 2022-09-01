package StepDefinition;

import Pages.About;
import Pages.Education;
import Pages.LoginPage;
import Pages.PageObjectManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Hello extends PageObjectManager {
   public WebDriver driver;


    @Given("I visit the website")
    public void Setup() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://skylarkdevthree.entomo.co/home/#/signin");

        loginPage = new LoginPage(driver);
        loginPage.setUsername("suman.am@kpisoft.com");
        loginPage.setPassword("Test@123");
        loginPage.setSubmit();
    }
    @And("Click on Nine dot")
            public  void Click_On_Nine_dot() throws InterruptedException {
        about = new About(driver);
        Thread.sleep(5000);
        about.setNinedot();
    }
    @Given("I click on Explore Career")
            public  void I_click_on_Explore_Career() {
        about.setExploreCareer();
    }
    @And("Click on  My Education")
    public void Click_on_My_Education() throws InterruptedException {
        education = new Education(driver);
        education.setEducation();
        Thread.sleep(5000);
        education.setAdd_button();
    }
    @When("add education detail")
       public  void add_education_detail() throws InterruptedException {
        education.setDegree("BCA");
        education.setUniversity("MCA");
    }
    @And("submit education details")
    public  void submit_education_details() throws InterruptedException {
        education.setAdd_Button_Edu();
        Thread.sleep(5000);
        education.setText();
    }


    }

