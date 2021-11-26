package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class ReadFileData {
Properties properties;
WebDriver driver;

   public void inputDATA() throws IOException {

    File src = new File("Objects.properties");
    FileInputStream objFile = new FileInputStream(src);
    properties = new Properties();
    properties.load(objFile);
    System.out.println("property class loaded");
    driver = new ChromeDriver();
    driver.get("https://spree-vapasi-prod.herokuapp.com/");

   }
   /*
    @Test
    public By getLocator(String ElementName) throws Exception {
        // Read value using the logical name as Key
        String locator = properties.getProperty(ElementName);
        // Split the value which contains locator type and locator value
        String locatorType = locator.split(":")[0];
        String locatorValue = locator.split(":")[1];
        // Return a instance of By class based on type of locator
        switch (locatorType.toLowerCase()) {
            case "id":
                return By.id(locatorValue);
            case "name":
                return By.name(locatorValue);
            case "classname":
            case "class":
                return By.className(locatorValue);
            case "tagname":
            case "tag":
                return By.className(locatorValue);
            case "linktext":
            case "link":
                return By.linkText(locatorValue);
            case "partiallinktext":
                return By.partialLinkText(locatorValue);
            case "cssselector":
            case "css":
                return By.cssSelector(locatorValue);
            case "xpath":
                return By.xpath(locatorValue);
            default:
                throw new Exception("Locator type '" + locatorType
                        + "' not defined!!");
        }
    }

*/

}
