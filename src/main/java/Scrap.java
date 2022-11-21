
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
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

            while(true){
                switch (opt){
                    case 1 :
                        driver.get("https://genshin-impact.fandom.com/wiki/Character#Playable_Characters");
                        WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
                        aceptarCoockies(driver, driverWait);

                        driver.close();
                        continue;
                    case 2 :
                        driver.get("https://genshin-impact.fandom.com/wiki/Weapon/List");
                        driver.close();
                        continue;
                    case 3 :
                        driver.get("https://genshin-impact.fandom.com/wiki/Artifact/Sets");
                        driver.close();
                        continue;
                    case 4 :
                        driver.get("https://genshin-impact.fandom.com/wiki/Enemy/List");
                        driver.close();
                        continue;
                    case 0 :
                        return;
                    default :
                        System.out.println("No existe este opcion, Intenta de nuevo");
                }
            }
    }

    public static void aceptarCoockies(WebDriver driver, WebDriverWait driverWait){
        driverWait.until(ExpectedConditions.elementToBeClickable(new By.ByClassName("NN0_TB_DIsNmMHgJWgT7U")));
        driver.findElement(new By.ByClassName("NN0_TB_DIsNmMHgJWgT7U")).click();
    }




}
