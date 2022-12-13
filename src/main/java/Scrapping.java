
import net.bytebuddy.description.method.ParameterList;
import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
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
import java.util.concurrent.TimeUnit;

/**
 * Esta es la clase App, es la clase que se va a ejecutar los metodos.
 */
public class Scrapping {

    String[] linksCharacters;
    String[] linksWeapons;
    String[] linksArtifacts;

    List<Character> characters = new ArrayList<>();

    List<Weapon> weapons = new ArrayList<>();

    List<Artifact> artifacts = new ArrayList<>();

    /**
     * Este metodo ejecuta todo los metodo necessarios para conseguir el scrap
     * @throws InterruptedException
     */

    public void start() throws InterruptedException {

            getLinkCharacters();
            TimeUnit.SECONDS.sleep(1);
            getLinkWeapons();
            TimeUnit.SECONDS.sleep(1);
            getLinkArtifact();
            TimeUnit.SECONDS.sleep(1);
            procesarLinks(linksCharacters,linksWeapons,linksArtifacts);

            generateCSVyXML(characters,weapons,artifacts);

    }


    /**
     * Entra la pagina que contiene los characters y coge todo los links
     * @return links de cada character
     */
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

        try{
            driverWait.until(ExpectedConditions.elementToBeClickable(new By.ByClassName("NN0_TB_DIsNmMHgJWgT7U"))); //NN0_TB_DIsNmMHgJWgT7U XHcr6qf5Sub2F2zBJ53S_"
            driver.findElement(new By.ByClassName("NN0_TB_DIsNmMHgJWgT7U")).click();
            TimeUnit.SECONDS.sleep(5);
        }catch(Exception e){

        }


        int num = 0;
        List<WebElement> liCharacter = driver.findElements(new By.ByXPath("//*[contains(@class, 'article-table') and position() = 1]/tbody//tr/td[position() = 1]/a"));

        linksCharacters = new String[liCharacter.size()];
        System.out.println("Getting Characters urls");
        for (WebElement webElement: liCharacter) {
            linksCharacters[num] = webElement.getAttribute("href");
            System.out.println(linksCharacters[num]);
            num++;
        }
        System.out.println("------------------------------");
        System.out.println("Total " + num  + " Links pillado");
        System.out.println("------------------------------");
        return linksCharacters;
    }

    /**
     * Entra la pagina que contiene los armas y coge todo los links
     * @return links de cada arma
     */
    public String[] getLinkWeapons(){
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

        driver.get("https://genshin-impact.fandom.com/wiki/Weapon/List");

        try{
            driverWait.until(ExpectedConditions.elementToBeClickable(new By.ByClassName("NN0_TB_DIsNmMHgJWgT7U"))); //NN0_TB_DIsNmMHgJWgT7U XHcr6qf5Sub2F2zBJ53S_"
            driver.findElement(new By.ByClassName("NN0_TB_DIsNmMHgJWgT7U")).click();
            TimeUnit.SECONDS.sleep(5);
        } catch(Exception e){
        }


        int num = 0;
        List<WebElement> liWeapons = driver.findElements(new By.ByXPath("/html/body/div[4]/div[3]/div[2]/main/div[3]/div[2]/div[1]/table[3]/tbody//tr/td[1]/a"));

        linksWeapons = new String[liWeapons.size()];
        System.out.println("Getting Weapons urls");
        for (WebElement webElement: liWeapons) {
            linksWeapons[num] = webElement.getAttribute("href");
            System.out.println(linksWeapons[num]);
            num++;
        }
        System.out.println("------------------------------");
        System.out.println("Total " + num  + " Links pillado");
        System.out.println("------------------------------");
        return linksWeapons;
    }

    /**
     * Entra la pagina que contiene los artifactos y coge todo los links
     * @return links de cada artifacto
     */

    public String[] getLinkArtifact(){
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

        driver.get("https://genshin-impact.fandom.com/wiki/Artifact/Sets");

        try{
            driverWait.until(ExpectedConditions.elementToBeClickable(new By.ByClassName("NN0_TB_DIsNmMHgJWgT7U"))); //NN0_TB_DIsNmMHgJWgT7U XHcr6qf5Sub2F2zBJ53S_"
            driver.findElement(new By.ByClassName("NN0_TB_DIsNmMHgJWgT7U")).click();
            TimeUnit.SECONDS.sleep(5);
        } catch(Exception e){
        }

        int num = 0;
        List<WebElement> liArtifacts = driver.findElements(new By.ByXPath("/html/body/div[4]/div[3]/div[2]/main/div[3]/div[2]/div[1]/table[2]/tbody//tr/td[1]/a"));


        linksArtifacts = new String[liArtifacts.size()];
        System.out.println("Getting Artifacts urls");
        for (WebElement webElement: liArtifacts) {
            linksArtifacts[num] = webElement.getAttribute("href");
            System.out.println(linksArtifacts[num]);
            num++;
        }
        System.out.println("------------------------------");
        System.out.println("Total " + num  + " Links pillado");
        System.out.println("------------------------------");
        return linksArtifacts;

    }

    /**
     * Coge los links y los procesa
     * @param urlsCharacters array que contiene los links de character
     * @param urlsWeapons array que contiene los links de weapon
     * @param urlsArtifacts array que contiene los links de artifact
     */

    public void procesarLinks(String[]urlsCharacters, String[]urlsWeapons, String[]urlsArtifacts) {
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
                urlsCharacters) {
            getCharacterInfo(li, driver);
        }

        for (String li2 :
                urlsWeapons) {
            getWeaponInfo(li2, driver);
        }

            for (String li3 :
                    urlsArtifacts) {
                getArtifactInfo(li3, driver);
            }


            characters.forEach(System.out::println);
            System.out.println("----------------------------------------");
            System.out.println("----------------------------------------");
            weapons.forEach(System.out::println);
            System.out.println("----------------------------------------");
            System.out.println("----------------------------------------");
            artifacts.forEach(System.out::println);

    }

    /**
     * entra a los links de characters y coge los infos que queremos.
     * @param url links de character
     * @param driver el driver para seguir navegando
     * @return retorna info de character
     */
        public List<Character> getCharacterInfo (String url, WebDriver driver){
            String name, image, element, region, weapon, rarity, description;
            WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(10));

            driver.get(url);

            try {
                driverWait.until(ExpectedConditions.elementToBeClickable(new By.ByClassName("NN0_TB_DIsNmMHgJWgT7U"))).click();
                TimeUnit.SECONDS.sleep(5);
            } catch (Exception e) {
            }
            WebElement weDescription = driver.findElement(new By.ByClassName("mw-parser-output"));
            description = weDescription.findElement(new By.ByXPath("//p[4]")).getText();

            WebElement we = driver.findElement(new By.ByClassName("portable-infobox"));
            name = we.findElement(new By.ByTagName("h2")).getText();

            image = we.findElement(new By.ByCssSelector(".pi-image-collection > div:nth-child(2) > figure:nth-child(1) > a:nth-child(1) > img:nth-child(1)")).getAttribute("src");
            try {
                element = we.findElement(new By.ByXPath("//section[1]//table/tbody/tr/td[3]/span/a[2]")).getText();
            } catch (Exception e) {
                element = "NONE";
            }

            weapon = we.findElement(new By.ByXPath("//section[1]//table/tbody/tr/td[2]/span/a[2]")).getText();
            rarity = we.findElement(new By.ByXPath("//section[1]//table/tbody/tr/td[1]/img")).getAttribute("alt");
            try {
                region = we.findElement(new By.ByXPath("//section[2]//div[2]//div[@data-source='region']/div/a")).getText();
            } catch (Exception e) {
                try {
                    region = we.findElement(new By.ByXPath("//section[2]//div[2]//div[@data-source='region']/div/ul/li[1]/a")).getText();
                } catch (Exception e2) {
                    region = "NONE";
                }
            }
            characters.add(new Character(name, rarity, image, description, element, region, weapon));

            System.out.println("Nombre: " + name);
            System.out.println("Rareza: " + rarity);
            System.out.println("Image: " + image);
            System.out.println("Descripcion: " + description);
            System.out.println("Eemento: " + element);
            System.out.println("Region: " + region);
            System.out.println("Arma: " + weapon);

            return characters;
        }

    /**
     * entra a los links de armas y coge los infos que queremos.
     * @param url links de armas
     * @param driver el driver para seguir navegando
     * @return retorna info de armas
     */
        public List<Weapon> getWeaponInfo (String url, WebDriver driver){
            String name, type, rarity, description, baseATK;
            String image = "";
            WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(10));

            driver.get(url);
            try {
                driverWait.until(ExpectedConditions.elementToBeClickable(new By.ByClassName("NN0_TB_DIsNmMHgJWgT7U"))).click();
            } catch (Exception e) {
            }

            WebElement weDescription = driver.findElement(new By.ByClassName("mw-parser-output"));
            description = weDescription.findElement(new By.ByCssSelector(".description > div:nth-child(1)")).getText();

            WebElement we = driver.findElement(new By.ByClassName("portable-infobox"));
            name = we.findElement(new By.ByTagName("h2")).getText();
            try {
                image = we.findElement(new By.ByCssSelector(".pi-image-collection > div:nth-child(2) > figure:nth-child(1) > a:nth-child(1) > img:nth-child(1)")).getAttribute("src");
            } catch (Exception e) {

            }
            type = we.findElement(new By.ByCssSelector("div.pi-item:nth-child(1) > div:nth-child(2) > span:nth-child(1) > a:nth-child(2)")).getText();

            baseATK = we.findElement(new By.ByCssSelector("div.pi-smart-data-value:nth-child(1)")).getText();
            rarity = we.findElement(new By.ByCssSelector("section.pi-panel:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > img:nth-child(1)")).getAttribute("alt");

            weapons.add(new Weapon(name, rarity, image, description, type, baseATK));

            System.out.println("Nombre: " + name);
            System.out.println("Rareza: " + rarity);
            System.out.println("Image: " + image);
            System.out.println("Descripcion: " + description);
            System.out.println("Tipo: " + type);
            System.out.println("BasicATK(base lV 1-90): " + baseATK);

            return weapons;
        }

    /**
     * entra a los links de artifactos y coge los infos que queremos.
     * @param url links de artifactos
     * @param driver el driver para seguir navegando
     * @return retorna info de artifactos
     */
        public List<Artifact> getArtifactInfo (String url, WebDriver driver){
            String setName, flowerOfLife, imgFlowerOfLife, plumeOfDeath, imgPlumeOfDeath, sandsOfEon, imgSandsOfEon, gobletOfEonothem, imgGobletOfEonothem, circletOfLogos, imgCircletOfLogos, x2Bonus, x4Bonus;
            WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(10));

            driver.get(url);
            try {
                driverWait.until(ExpectedConditions.elementToBeClickable(new By.ByClassName("NN0_TB_DIsNmMHgJWgT7U"))).click();
            } catch (Exception e) {
            }

            WebElement we = driver.findElement(new By.ByClassName("portable-infobox"));
            setName = we.findElement(new By.ByTagName("h2")).getText();
            try {
                flowerOfLife = we.findElement(new By.ByCssSelector(".portable-infobox > div:nth-child(2) > div:nth-child(2) > a:nth-child(3)")).getText();
            } catch (Exception e) {
                flowerOfLife = "NULL";
            }
            try {
                imgFlowerOfLife = we.findElement(new By.ByCssSelector(".portable-infobox > div:nth-child(2) > h3:nth-child(1) > center:nth-child(1) > a:nth-child(1) > img:nth-child(1)")).getAttribute("src");
            } catch (Exception e) {
                imgFlowerOfLife = "NULL";
            }
            try {
                plumeOfDeath = we.findElement(new By.ByCssSelector(".portable-infobox > div:nth-child(3) > div:nth-child(2) > a:nth-child(3)")).getText();
            } catch (Exception e) {
                plumeOfDeath = "NULL";
            }
            try {
                imgPlumeOfDeath = we.findElement(new By.ByCssSelector(".portable-infobox > div:nth-child(3) > h3:nth-child(1) > center:nth-child(1) > a:nth-child(1) > img:nth-child(1)")).getAttribute("src");
            } catch (Exception e) {
                imgPlumeOfDeath = "NULL";
            }
            try {
                sandsOfEon = we.findElement(new By.ByCssSelector(".portable-infobox > div:nth-child(4) > div:nth-child(2) > a:nth-child(3)")).getText();
            } catch (Exception e) {
                sandsOfEon = "NULL";
            }
            try {
                imgSandsOfEon = we.findElement(new By.ByCssSelector(".portable-infobox > div:nth-child(4) > h3:nth-child(1) > center:nth-child(1) > a:nth-child(1) > img:nth-child(1)")).getAttribute("src");
            } catch (Exception e) {
                imgSandsOfEon = "NULL";
            }
            try {
                gobletOfEonothem = we.findElement(new By.ByCssSelector(".portable-infobox > div:nth-child(5) > div:nth-child(2) > a:nth-child(3)")).getText();
            } catch (Exception e) {
                gobletOfEonothem = "NULL";
            }
            try {
                imgGobletOfEonothem = we.findElement(new By.ByCssSelector(".portable-infobox > div:nth-child(5) > h3:nth-child(1) > center:nth-child(1) > a:nth-child(1) > img:nth-child(1)")).getAttribute("src");
            } catch (Exception e) {
                imgGobletOfEonothem = "NULL";
            }
            try {
                circletOfLogos = we.findElement(new By.ByCssSelector("div.pi-item:nth-child(6) > div:nth-child(2) > a:nth-child(3)")).getText();
            } catch (Exception e) {
                circletOfLogos = "NULL";
            }
            try {
                imgCircletOfLogos = we.findElement(new By.ByCssSelector("div.pi-item:nth-child(6) > h3:nth-child(1) > center:nth-child(1) > a:nth-child(1) > img:nth-child(1)")).getAttribute("src");
            } catch (Exception e) {
                imgCircletOfLogos = "NULL";
            }
            try {
                x2Bonus = we.findElement(new By.ByCssSelector("section.pi-item:nth-child(7) > div:nth-child(2) > div:nth-child(1)")).getText();
            } catch (Exception e) {
                x2Bonus = "NULL";
            }
            try {
                x4Bonus = we.findElement(new By.ByCssSelector("section.pi-item:nth-child(7) > div:nth-child(3) > div:nth-child(1)")).getText();
            } catch (Exception e) {
                x4Bonus = "NULL";
            }

            artifacts.add(new Artifact(setName, flowerOfLife, imgFlowerOfLife, plumeOfDeath, imgPlumeOfDeath, sandsOfEon, imgSandsOfEon, gobletOfEonothem, imgGobletOfEonothem, circletOfLogos, imgCircletOfLogos, x2Bonus, x4Bonus));

            System.out.println("SetName: " + setName);
            System.out.println("FlowerOfLife: " + flowerOfLife);
            System.out.println("ImgFlowerOfLife: " + imgFlowerOfLife);
            System.out.println("plumeOfDeath: " + plumeOfDeath);
            System.out.println("imgPlumeOfDeath: " + imgPlumeOfDeath);
            System.out.println("sandsOfEon: " + sandsOfEon);
            System.out.println("imgSandsOfEon: " + imgSandsOfEon);
            System.out.println("gobletOfEonothem: " + gobletOfEonothem);
            System.out.println("imgGobletOfEonothem: " + imgGobletOfEonothem);
            System.out.println("circletOfLogos: " + circletOfLogos);
            System.out.println("imgCircletOfLogos: " + imgSandsOfEon);
            System.out.println("x2Bonus: " + x2Bonus);
            System.out.println("x4Bonus: " + x4Bonus);

            return artifacts;
        }

    /**
     * Recibe los infos de las listas de objetos y genera los documentos CSV y XML
     * @param characters lista de datos de characters
     * @param weapons lista de datos de armas
     * @param artifacts lista de datos de artifactos
     */
        public static void generateCSVyXML(List <Character> characters, List <Weapon> weapons, List <Artifact> artifacts){
            CSV csv = new CSV(characters,weapons,artifacts);
            JAXB jaxb = new JAXB(characters,weapons,artifacts);
        }
    
}
