import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Character")
public class Character {
    String name;
    String image;
    String rarity;
    String description;
    String element;
    String region;
    String weapon;

    public Character(String name, String rarity, String image, String description, String element, String region, String weapon) {
        this.name = name;
        this.rarity = rarity;
        this.image = image;
        this.description = description;
        this.element = element;
        this.region = region;
        this.weapon = weapon;
    }

    Character(){

    }

    @XmlElement(name="CHARACATER_NAME")
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    @XmlElement(name="CHARACTER_IMAGE")
    public void setImage(String image) {
        this.image = image;
    }
    public String getImage() {
        return image;
    }

    @XmlElement(name="CHARACTER_RAREZA")
    public void setRarity(String rarity) {
        this.rarity = rarity;
    }
    public String getRarity() {
        return rarity;
    }

    @XmlElement(name="CHARACTER_DESCRIPCION")
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }

    @XmlElement(name="CHARACTER_ELEMENTO")
    public void setElement(String element) {
        this.element = element;
    }
    public String getElement() {
        return element;
    }

    @XmlElement(name="CHARACTER_REGION")
    public void setRegion(String region) {
        this.region = region;
    }
    public String getRegion() {
        return region;
    }

    @XmlElement(name="CHARACTER_ARMA")
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
    public String getWeapon() {
        return weapon;
    }

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
