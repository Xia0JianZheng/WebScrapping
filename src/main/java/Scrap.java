
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Scrap {

    public void start(){
            System.out.println(System.getenv("PATH"));
            System.out.println(System.getenv("HOME"));
            //  System.out.println(System.getenv(""));

            System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver");
            // File pathBinary = new File("src/main/resources/firefox");
            //  FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);
            // DesiredCapabilities desired = new DesiredCapabilities();
            FirefoxOptions options = new FirefoxOptions();
            // desired.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options.setBinary(firefoxBinary));
            WebDriver driver = new FirefoxDriver(options);

            System.out.println("Elige el contenido que quieres scrapear (1- Personajes 2- Armas 3- Artefactos 4- Enemigos 0- Salir)");

            Scanner scanner = new Scanner(System.in);
            int opt = scanner.nextInt();

                switch (opt){
                    case 1 :
                        driver.get("https://bbs.mihoyo.com/ys/obc/channel/map/189/25?bbs_presentation_style=no_header");
                        WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(60));

                        Login(driver, driverWait);

                        List<WebElement> personajes;
                        List<String> links = new ArrayList<>();

                        personajes = driver.findElements(new By.ByClassName("category-page__member"));


                        for (WebElement p: personajes) {
                            links.add(p.getAttribute("href"));
                        }
                        links.forEach(System.out::println);
                }
    }

    public static void Login(WebDriver driver, WebDriverWait driverWait){

        driver.findElement(new By.ByClassName("header-user")).click();
        driverWait.until(ExpectedConditions.elementToBeClickable(new By.ByClassName("tab-item")));
        driver.findElement(new By.ByClassName("tab-item")).click();
    }




}
