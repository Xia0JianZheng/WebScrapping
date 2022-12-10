import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Weapon")
public class Weapon {
    String name;
    String rarity;
    String image;
    String description;
    String type;
    String baseATK;


    public Weapon(String name, String rarity, String image, String description, String type, String baseATK) {
        this.name = name;
        this.rarity = rarity;
        this.image = image;
        this.description = description;
        this.type = type;
        this.baseATK = baseATK;
    }

    public Weapon(){

    }

    @XmlElement(name="WEAPON_NAME")
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    @XmlElement(name="WEAPON_RARITY")
    public void setRarity(String rarity) {
        this.rarity = rarity;
    }
    public String getRarity() {
        return rarity;
    }

    @XmlElement(name="WEAPON_IMAGE")
    public void setImage(String image) {
        this.image = image;
    }
    public String getImage() {
        return image;
    }

    @XmlElement(name="WEAPON_DESCRIPTION")
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }

    @XmlElement(name="WEAPON_TYPE")
    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }

    @XmlElement(name="WEAPON_BASEATK")
    public void setBaseATK(String baseATK) {
        this.baseATK = baseATK;
    }
    public String getBaseATK() {
        return baseATK;
    }


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
