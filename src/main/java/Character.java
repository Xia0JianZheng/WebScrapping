import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

/**
 * Esta clase contiene las variables de objeto character.
 */
@XmlRootElement(name="Character")
public class Character {
    String name;
    String image;
    String rarity;
    String description;
    String element;
    String region;
    String weapon;

    /**
     * Este constructor que recibira unos datos y los asignara
     * @param name recibe un valor para nombre de character
     * @param rarity recibe un valor para rareza de character
     * @param image recibe un valor para imagen de character
     * @param description recibe un valor para descripcion de character
     * @param element recibe un valor para elemento de character
     * @param region recibe un valor para region de character
     * @param weapon recibe un valor para arma de character
     */
    public Character(String name, String rarity, String image, String description, String element, String region, String weapon) {
        this.name = name;
        this.rarity = rarity;
        this.image = image;
        this.description = description;
        this.element = element;
        this.region = region;
        this.weapon = weapon;
    }

    /**
     * Constructor vacio
     */
    Character(){

    }
    /**
     * Asignar el valor de nombre de character
     * @param name el valor que queremos asignar
     */
    @XmlElement(name="CHARACATER_NAME")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sirve para coger el valor de nombre de character
     * @return nos devuelve el valor de nombre
     */
    public String getName() {
        return name;
    }

    /**
     * Asignar el valor de image de character
     * @param image el valor que queremos asignar
     */
    @XmlElement(name="CHARACTER_IMAGE")
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * Sirve para coger el valor de image de character
     * @return nos devuelve el valor de image
     */
    public String getImage() {
        return image;
    }

    /**
     * Asignar el valor de rareza de character
     * @param rarity el valor que queremos asignar
     */
    @XmlElement(name="CHARACTER_RAREZA")
    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    /**
     * Sirve para coger el valor de rareza de character
     * @return nos devuelve el valor de rareza
     */
    public String getRarity() {
        return rarity;
    }

    /**
     * Asignar el valor de descripcion de character
     * @param description el valor que queremos asignar
     */
    @XmlElement(name="CHARACTER_DESCRIPCION")
    public void setDescription(String description) {
        this.description = description;
    }
    /**
     * Sirve para coger el valor de descripcion de character
     * @return nos devuelve el valor de descripcion
     */
    public String getDescription() {
        return description;
    }

    /**
     * Asignar el valor de elemento de character
     * @param element el valor que queremos asignar
     */
    @XmlElement(name="CHARACTER_ELEMENTO")
    public void setElement(String element) {
        this.element = element;
    }
    /**
     * Sirve para coger el valor de elemento de character
     * @return nos devuelve el valor de elemento
     */
    public String getElement() {
        return element;
    }

    /**
     * Asignar el valor de region de character
     * @param region el valor que queremos asignar
     */
    @XmlElement(name="CHARACTER_REGION")
    public void setRegion(String region) {
        this.region = region;
    }
    /**
     * Sirve para coger el valor de region de character
     * @return nos devuelve el valor de region
     */
    public String getRegion() {
        return region;
    }

    /**
     * Asignar el valor de arma de character
     * @param weapon el valor que queremos asignar
     */
    @XmlElement(name="CHARACTER_ARMA")
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
    /**
     * Sirve para coger el valor de arma de character
     * @return nos devuelve el valor de arma
     */
    public String getWeapon() {
        return weapon;
    }


    /**Retorna un string con los datos de character
     * @return String con el character
     */
    @Override
    public String toString() {
        return "Character{" +
                "nombre='" + name + '\'' +
                ", image='" + image + '\'' +
                ", rareza='" + rarity + '\'' +
                ", descripcion='" + description + '\'' +
                ", elemento='" + element + '\'' +
                ", region='" + region + '\'' +
                ", arma='" + weapon + '\'' +
                '}';
    }
}
