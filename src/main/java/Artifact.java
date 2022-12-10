import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Artifact")
public class Artifact {
    String setName;
    String flowerOfLife;
    String imgFlowerOfLife;
    String plumeOfDeath;
    String imgPlumeOfDeath;
    String sandsOfEon;
    String imgSandsOfEon;
    String gobletOfEonothem;
    String imgGobletOfEonothem;
    String circletOfLogos;
    String imgCircletOfLogos;
    String x2Bonus;
    String x4Bonus;

    public Artifact(String setName, String flowerOfLife, String imgFlowerOfLife, String plumeOfDeath, String imgPlumeOfDeath, String sandsOfEon, String imgSandsOfEon, String gobletOfEonothem, String imgGobletOfEonothem, String circletOfLogos, String imgCircletOfLogos, String x2Bonus, String x4Bonus) {
        this.setName = setName;
        this.flowerOfLife = flowerOfLife;
        this.imgFlowerOfLife = imgFlowerOfLife;
        this.plumeOfDeath = plumeOfDeath;
        this.imgPlumeOfDeath = imgPlumeOfDeath;
        this.sandsOfEon = sandsOfEon;
        this.imgSandsOfEon = imgSandsOfEon;
        this.gobletOfEonothem = gobletOfEonothem;
        this.imgGobletOfEonothem = imgGobletOfEonothem;
        this.circletOfLogos = circletOfLogos;
        this.imgCircletOfLogos = imgCircletOfLogos;
        this.x2Bonus = x2Bonus;
        this.x4Bonus = x4Bonus;
    }

    public Artifact() {
    }

    public String getSetName() {
        return setName;
    }
    @XmlElement(name="SET_NAME")
    public void setSetName(String setName) {
        this.setName = setName;
    }

    public String getFlowerOfLife() {
        return flowerOfLife;
    }
    @XmlElement(name="HEADOFLIFE")
    public void setFlowerOfLife(String flowerOfLife) {
        flowerOfLife = flowerOfLife;
    }

    public String getImgFlowerOfLife() {
        return imgFlowerOfLife;
    }
    @XmlElement(name="IMGHEADOFLIFE")
    public void setImgFlowerOfLife(String imgFlowerOfLife) {
        this.imgFlowerOfLife = imgFlowerOfLife;
    }

    public String getPlumeOfDeath() {
        return plumeOfDeath;
    }
    @XmlElement(name="PLUMEOFDEATH")
    public void setPlumeOfDeath(String plumeOfDeath) {
        plumeOfDeath = plumeOfDeath;
    }

    public String getImgPlumeOfDeath() {
        return imgPlumeOfDeath;
    }
    @XmlElement(name="IMGPLUMEOFDEATH")
    public void setImgPlumeOfDeath(String imgPlumeOfDeath) {
        this.imgPlumeOfDeath = imgPlumeOfDeath;
    }

    public String getSandsOfEon() {
        return sandsOfEon;
    }
    @XmlElement(name="SANDSOFEON")
    public void setSandsOfEon(String sandsOfEon) {
        sandsOfEon = sandsOfEon;
    }

    public String getImgSandsOfEon() {
        return imgSandsOfEon;
    }
    @XmlElement(name="IMGSANDSOFEON")
    public void setImgSandsOfEon(String imgSandsOfEon) {
        this.imgSandsOfEon = imgSandsOfEon;
    }

    public String getGobletOfEonothem() {
        return gobletOfEonothem;
    }
    @XmlElement(name="GOBLETOFEONOTHEM")
    public void setGobletOfEonothem(String gobletOfEonothem) {
        gobletOfEonothem = gobletOfEonothem;
    }

    public String getImgGobletOfEonothem() {
        return imgGobletOfEonothem;
    }
    @XmlElement(name="IMGGOBLETOFEONOTHEM")
    public void setImgGobletOfEonothem(String imgGobletOfEonothem) {
        this.imgGobletOfEonothem = imgGobletOfEonothem;
    }

    public String getCircletOfLogos() {
        return circletOfLogos;
    }
    @XmlElement(name="CIRCLETOFLOGOS")
    public void setCircletOfLogos(String circletOfLogos) {
        circletOfLogos = circletOfLogos;
    }

    public String getImgCircletOfLogos() {
        return imgCircletOfLogos;
    }
    @XmlElement(name="IMGCIRCLETOFLOGOS")
    public void setImgCircletOfLogos(String imgCircletOfLogos) {
        this.imgCircletOfLogos = imgCircletOfLogos;
    }

    public String getX2Bonus() {
        return x2Bonus;
    }
    @XmlElement(name="X2Bonus")
    public void setX2Bonus(String x2Bonus) {
        this.x2Bonus = x2Bonus;
    }

    public String getX4Bonus() {
        return x4Bonus;
    }
    @XmlElement(name="X4Bonus")
    public void setX4Bonus(String x4Bonus) {
        this.x4Bonus = x4Bonus;
    }

    @Override
    public String toString() {
        return "Artifact{" +
                "setName='" + setName + '\'' +
                ", FlowerOfLife='" + flowerOfLife + '\'' +
                ", imgFlowerOfLife='" + imgFlowerOfLife + '\'' +
                ", PlumeOfDeath='" + plumeOfDeath + '\'' +
                ", imgPlumeOfDeath='" + imgPlumeOfDeath + '\'' +
                ", SandsOfEon='" + sandsOfEon + '\'' +
                ", imgSandsOfEon='" + imgSandsOfEon + '\'' +
                ", GobletOfEonothem='" + gobletOfEonothem + '\'' +
                ", imgGobletOfEonothem='" + imgGobletOfEonothem + '\'' +
                ", CircletOfLogos='" + circletOfLogos + '\'' +
                ", imgCircletOfLogos='" + imgCircletOfLogos + '\'' +
                ", x2Bonus='" + x2Bonus + '\'' +
                ", x4Bonus='" + x4Bonus + '\'' +
                '}';
    }
}


