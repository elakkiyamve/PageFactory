package org.example;

import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;

public class BaseTest {
    WebDriver driver;

    @BeforeMethod
    public void spreeWebsite() throws IOException {

        System.setProperty("webdriver.chrome.driver","src/Driver/chromedriver");
        driver = new ChromeDriver();
        driver.navigate().to("https://spree-vapasi-prod.herokuapp.com/");
        driver.manage().window().maximize();

    }

    @AfterMethod
    public void takeSnapShot(ITestResult result) throws Exception {

        if (result.getStatus() == ITestResult.FAILURE) {
            TakesScreenshot scrShot = ((TakesScreenshot) driver);
            File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
            File DestFile = new File("./Screenshots/screenshot/test.png");
            try {
                Files.copy(srcFile, DestFile);
            } catch (IOException e) {

            }
        }
    }



//        // @BeforeTest
//        public void inputDATA () throws IOException {
//
//            File src = new File("Objects.properties");
//            FileInputStream objFile = new FileInputStream(src);
//            properties = new Properties();
//            properties.load(objFile);
//            System.out.println("property class loaded");
//        }

//         @DataProvider(name="data")
//         public Object[][] TestDataFeed () {
//
//           Object[][] loginUserInfo = new Object[2][2];
//
//          loginUserInfo[0][0] = "adhi@gmail.com";
//           loginUserInfo[0][1] = "gmailcom";
//
//            loginUserInfo[1][0] = "venkat@gmail.com";
//            loginUserInfo[1][1] = "venkat";
//
//           loginUserInfo[1][1] = "user@gmail.com";
//           loginUserInfo[1][0] = "Password";
//
//            return loginUserInfo;                    //iteration
//       }


}