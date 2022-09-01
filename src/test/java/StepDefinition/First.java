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

public class First extends PageObjectManager {
    public WebDriver driver;


    @Test
    public void Setup() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://skylarkdevthree.entomo.co/home/#/signin");

        loginPage = new LoginPage(driver);
        loginPage.setUsername("suman.am@kpisoft.com");
        loginPage.setPassword("Test@123");
        loginPage.setSubmit();


        about = new About(driver);
        Thread.sleep(5000);
        about.setNinedot();

        about.setExploreCareer();


        education = new Education(driver);
        education.setEducation();
        Thread.sleep(5000);
        education.setAdd_button();


        education.setDegree("BCA");
        education.setUniversity("MCA");



        education.setAdd_Button_Edu();
        Thread.sleep(5000);
        education.setText();
    }


}


