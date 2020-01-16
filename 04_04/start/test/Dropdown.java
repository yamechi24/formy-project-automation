import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/QIS8/Tools/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropDownMenu = driver.findElement(By.id("dropdownMenuButton"));
        dropDownMenu.click();
        Thread.sleep(2000);

        WebElement autoCompleteItem = driver.findElement(By.id("autocomplete"));
        autoCompleteItem.click();
        Thread.sleep(2000);

        driver.navigate().back();
        Thread.sleep(2000);

        WebElement dropDownMenu2 = driver.findElement(By.id("dropdownMenuButton"));
        dropDownMenu2.click();
        Thread.sleep(2000);

        WebElement fileUpload = driver.findElement(By.linkText("File Upload"));
        fileUpload.click();
        Thread.sleep(2000);

        driver.quit();
    }
}
