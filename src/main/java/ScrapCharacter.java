
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScrapCharacter {

    String[] links;

    List<Character> characters = new ArrayList<>();

    public void start(){


            System.out.println("Elige el contenido que quieres scrapear (1- Personajes 2- Armas 3- Artefactos 4- Enemigos 0- Salir)");

            Scanner scanner = new Scanner(System.in);
            int opt = scanner.nextInt();

        if (opt == 1) {
            getLinkCharacters();
            procesarLinks(links);
            generateCSVyXML(characters);


        }
    }

    //Pilla los links
    public String[] getLinkCharacters(){
        System.out.println(System.getenv("PATH"));
        System.out.println(System.getenv("HOME"));
        //  System.out.println(System.getenv(""));

        //System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver");
        // File pathBinary = new File("src/main/resources/firefox");
        //  FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);
        // DesiredCapabilities desired = new DesiredCapabilities();
        FirefoxOptions options = new FirefoxOptions();
        // desired.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options.setBinary(firefoxBinary));
        WebDriver driver = new FirefoxDriver(options);

        WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(30));

        driver.get("https://genshin-impact.fandom.com/wiki/Character/List");

        driverWait.until(ExpectedConditions.elementToBeClickable(new By.ByClassName("NN0_TB_DIsNmMHgJWgT7U"))); //NN0_TB_DIsNmMHgJWgT7U XHcr6qf5Sub2F2zBJ53S_"
        driver.findElement(new By.ByClassName("NN0_TB_DIsNmMHgJWgT7U")).click();

        int num = 0;
        List<WebElement> liCharacter = driver.findElements(new By.ByXPath("//*[contains(@class, 'article-table') and position() = 1]/tbody//tr/td[position() = 1]/a"));

        links = new String[liCharacter.size()];
        System.out.println("Getting urls");
        for (WebElement webElement: liCharacter) {
            links[num] = webElement.getAttribute("href");
            System.out.println(links[num]);
            num++;
        }
        return links;
    }

    public void procesarLinks(String[] urls) {
        //System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver");
        // File pathBinary = new File("src/main/resources/firefox");
        //  FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);
        // DesiredCapabilities desired = new DesiredCapabilities();
        FirefoxOptions options = new FirefoxOptions();
        // desired.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options.setBinary(firefoxBinary));
        options.setHeadless(true);
        WebDriver driver = new FirefoxDriver(options);

        for (String li :
                urls) {
            getCharacterInfo(li, driver);
        }
        characters.forEach(System.out::println);


    }

    public List<Character> getCharacterInfo(String url, WebDriver driver) {
        String nombre, image, elemento, region, arma, rareza, descripcion;
        WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get(url);
        try{

            driverWait.until(ExpectedConditions.elementToBeClickable(new By.ByClassName("NN0_TB_DIsNmMHgJWgT7U"))).click();

        }
        catch (Exception e){
        }
            WebElement weDescription = driver.findElement(new By.ByClassName("mw-parser-output"));
            descripcion = weDescription.findElement(new By.ByXPath("//p[4]")).getText();

            WebElement we = driver.findElement(new By.ByClassName("portable-infobox"));
            nombre = we.findElement(new By.ByTagName("h2")).getText();
            image = we.findElement(new By.ByClassName("image")).getAttribute("href");
            try{
                elemento = we.findElement(new By.ByXPath("//section[1]//table/tbody/tr/td[3]/span/a[2]")).getText();
            }catch(Exception e){
                elemento = "NONE";
            }

            arma = we.findElement(new By.ByXPath("//section[1]//table/tbody/tr/td[2]/span/a[2]")).getText();
            rareza = we.findElement(new By.ByXPath("//section[1]//table/tbody/tr/td[1]/img")).getAttribute("alt");
            try{
                region = we.findElement(new By.ByXPath("//section[2]//div[2]//div[@data-source='region']/div/a")).getText();
            }catch(Exception e){
                try{
                    region = we.findElement(new By.ByXPath("//section[2]//div[2]//div[@data-source='region']/div/ul/li[1]/a")).getText();
                }catch(Exception e2){
                    region = "NONE";
                }
            }
            characters.add(new Character(nombre, rareza, image, descripcion, elemento, region, arma));

            System.out.println("Nombre: " + nombre);
            System.out.println("Rareza: " + rareza);
            System.out.println("Image: " + image);
            System.out.println("Descripcion: " + descripcion);
            System.out.println("Eemento: " + elemento);
            System.out.println("Region: " + region);
            System.out.println("Arma: " + arma);

            return characters;
    }

    public static void generateCSVyXML(List<Character> characters) {
        CSV csv = new CSV(characters);
        JAXB jaxb = new JAXB(characters);
    }

}
