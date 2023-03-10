package Training.Selenium;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println( "Hello World!" );
        String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator;//Tomando path driver en el sistema
        System.setProperty("webdriver.chrome.driver",  exePath + "chromedriver.exe");//Establecer la propiedad del .exe
        WebDriver driver = new ChromeDriver();//Inicializando el driver
        driver.get("https://opensource-demo.orangehrmlive.com/");//Abrir url
    }
}
