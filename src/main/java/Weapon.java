import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

/**
 * Esta clase contiene las variables de objeto armas.
 */
@XmlRootElement(name="Weapon")
public class Weapon {
    String name;
    String rarity;
    String image;
    String description;
    String type;
    String baseATK;

    /**
     * Este constructor que recibira unos datos y los asignara
     * @param name recibe un valor para nombre de la arma
     * @param rarity recibe un valor para rareza de la arma
     * @param image recibe un valor para imagen de la arma
     * @param description recibe un valor para descripcion de la arma
     * @param type recibe un valor para tipo de la arma
     * @param baseATK recibe un valor para daño de la arma
     */
    public Weapon(String name, String rarity, String image, String description, String type, String baseATK) {
        this.name = name;
        this.rarity = rarity;
        this.image = image;
        this.description = description;
        this.type = type;
        this.baseATK = baseATK;
    }
    /**
     * Constructor vacio
     */
    public Weapon(){

    }
    /**
     * Asignar el valor de nombre de la arma
     * @param name el valor que queremos asignar
     */
    @XmlElement(name="WEAPON_NAME")
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Sirve para coger el valor de nombre de la arma
     * @return nos devuelve el valor de nombre de la arma
     */
    public String getName() {
        return name;
    }
    /**
     * Asignar el valor de rareza de la arma
     * @param rarity el valor que queremos asignar
     */
    @XmlElement(name="WEAPON_RARITY")
    public void setRarity(String rarity) {
        this.rarity = rarity;
    }
    /**
     * Sirve para coger el valor de rareza de la arma
     * @return nos devuelve el valor de rareza de la arma
     */
    public String getRarity() {
        return rarity;
    }
    /**
     * Asignar el valor de imagen de la arma
     * @param image el valor que queremos asignar
     */
    @XmlElement(name="WEAPON_IMAGE")
    public void setImage(String image) {
        this.image = image;
    }
    /**
     * Sirve para coger el valor de imagen de la arma
     * @return nos devuelve el valor de imagen de la arma
     */
    public String getImage() {
        return image;
    }
    /**
     * Asignar el valor de descripcion de la arma
     * @param description el valor que queremos asignar
     */
    @XmlElement(name="WEAPON_DESCRIPTION")
    public void setDescription(String description) {
        this.description = description;
    }
    /**
     * Sirve para coger el valor de descripcion de la arma
     * @return nos devuelve el valor de descripcion de la arma
     */
    public String getDescription() {
        return description;
    }
    /**
     * Asignar el valor de tipo de la arma
     * @param type el valor que queremos asignar
     */
    @XmlElement(name="WEAPON_TYPE")
    public void setType(String type) {
        this.type = type;
    }
    /**
     * Sirve para coger el valor de tipo de la arma
     * @return nos devuelve el valor de tipo de la arma
     */
    public String getType() {
        return type;
    }
    /**
     * Asignar el valor de daño de la arma
     * @param baseATK el valor que queremos asignar
     */
    @XmlElement(name="WEAPON_BASEATK")
    public void setBaseATK(String baseATK) {
        this.baseATK = baseATK;
    }
    /**
     * Sirve para coger el valor de daño de la arma
     * @return nos devuelve el valor de daño de la arma
     */
    public String getBaseATK() {
        return baseATK;
    }

    /**Retorna un string con los datos de arma
     * @return String con el arma
     */
    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", rarity='" + rarity + '\'' +
                ", image='" + image + '\'' +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                ", baseATK='" + baseATK + '\'' +
                '}';
    }
}
