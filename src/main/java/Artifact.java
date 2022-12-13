import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

/**
 * Esta clase contiene las variables de objeto artifactos.
 */
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

    /**
     * Este constructor que recibira unos datos y los asignara
     * @param setName recibe un valor para nombre de la set
     * @param flowerOfLife recibe un valor de flowerOfLife
     * @param imgFlowerOfLife recibe un valor para imagen FlowerOfLife
     * @param plumeOfDeath recibe un valor de plumeOfDeath
     * @param imgPlumeOfDeath recibe un valor para imagen plumeOfDeath
     * @param sandsOfEon recibe un valor de sandsOfEon
     * @param imgSandsOfEon recibe un valor para imagen imgSandsOfEon
     * @param gobletOfEonothem recibe un valor de gobletOfEonothem
     * @param imgGobletOfEonothem recibe un valor para imagen gobletOfEonothem
     * @param circletOfLogos recibe un valor de circletOfLogos
     * @param imgCircletOfLogos recibe un valor para imagen circletOfLogos
     * @param x2Bonus recibe un valor para info x2bonus
     * @param x4Bonus recibe un valor para info x4bonus
     */
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

    /**
     * Constructor vacio
     */
    public Artifact() {
    }

    /**
     * Sirve para coger el valor de setName
     * @return nos devuelve el valor de setName
     */
    public String getSetName() {
        return setName;
    }
    /**
     * Asignar el valor de nombre de set de artifacto
     * @param setName el valor que queremos asignar
     */
    @XmlElement(name="SET_NAME")
    public void setSetName(String setName) {
        this.setName = setName;
    }
    /**
     * Sirve para coger el valor de flowerOfLife
     * @return nos devuelve el valor de flowerOfLife
     */
    public String getFlowerOfLife() {
        return flowerOfLife;
    }
    /**
     * Asignar el valor de FLOWEROFLIFE de artifacto
     * @param flowerOfLife el valor que queremos asignar
     */
    @XmlElement(name="FLOWEROFLIFE")
    public void setFlowerOfLife(String flowerOfLife) {
        flowerOfLife = flowerOfLife;
    }
    /**
     * Sirve para coger el imagen de flowerOfLife
     * @return nos devuelve el imagen de flowerOfLife
     */
    public String getImgFlowerOfLife() {
        return imgFlowerOfLife;
    }
    /**
     * Asignar el valor de imagen de FLOWEROFLIFE
     * @param imgFlowerOfLife el valor que queremos asignar
     */
    @XmlElement(name="IMGFLOWEROFLIFE")
    public void setImgFlowerOfLife(String imgFlowerOfLife) {
        this.imgFlowerOfLife = imgFlowerOfLife;
    }
    /**
     * Sirve para coger el valor de plumeOfDeath
     * @return nos devuelve el valor de plumeOfDeath
     */
    public String getPlumeOfDeath() {
        return plumeOfDeath;
    }
    /**
     * Asignar el valor de PLUMEOFDEATH de artifacto
     * @param plumeOfDeath el valor que queremos asignar
     */
    @XmlElement(name="PLUMEOFDEATH")
    public void setPlumeOfDeath(String plumeOfDeath) {
        plumeOfDeath = plumeOfDeath;
    }
    /**
     * Sirve para coger el imagen de imgPlumeOfDeath
     * @return nos devuelve el imagen de imgPlumeOfDeath
     */
    public String getImgPlumeOfDeath() {
        return imgPlumeOfDeath;
    }
    /**
     * Asignar el valor de imagen de PLUMEOFDEATH
     * @param imgPlumeOfDeath el valor que queremos asignar
     */
    @XmlElement(name="IMGPLUMEOFDEATH")
    public void setImgPlumeOfDeath(String imgPlumeOfDeath) {
        this.imgPlumeOfDeath = imgPlumeOfDeath;
    }
    /**
     * Sirve para coger el valor de sandsOfEon
     * @return nos devuelve el valor de sandsOfEon
     */
    public String getSandsOfEon() {
        return sandsOfEon;
    }
    /**
     * Asignar el valor de SANDSOFEON de artifacto
     * @param sandsOfEon el valor que queremos asignar
     */
    @XmlElement(name="SANDSOFEON")
    public void setSandsOfEon(String sandsOfEon) {
        sandsOfEon = sandsOfEon;
    }
    /**
     * Sirve para coger el imagen de sandsOfEon
     * @return nos devuelve el imagen de sandsOfEon
     */
    public String getImgSandsOfEon() {
        return imgSandsOfEon;
    }
    /**
     * Asignar el valor de imagen de SANDSOFEON
     * @param imgSandsOfEon el valor que queremos asignar
     */
    @XmlElement(name="IMGSANDSOFEON")
    public void setImgSandsOfEon(String imgSandsOfEon) {
        this.imgSandsOfEon = imgSandsOfEon;
    }
    /**
     * Sirve para coger el valor de gobletOfEonothem
     * @return nos devuelve el valor de gobletOfEonothem
     */
    public String getGobletOfEonothem() {
        return gobletOfEonothem;
    }
    /**
     * Asignar el valor de GOBLETOFEONOTHEM de artifacto
     * @param gobletOfEonothem el valor que queremos asignar
     */
    @XmlElement(name="GOBLETOFEONOTHEM")
    public void setGobletOfEonothem(String gobletOfEonothem) {
        gobletOfEonothem = gobletOfEonothem;
    }
    /**
     * Sirve para coger el imagen de gobletOfEonothem
     * @return nos devuelve el imagen de gobletOfEonothem
     */
    public String getImgGobletOfEonothem() {
        return imgGobletOfEonothem;
    }
    /**
     * Asignar el valor de imagen de GOBLETOFEONOTHEM
     * @param imgGobletOfEonothem el valor que queremos asignar
     */
    @XmlElement(name="IMGGOBLETOFEONOTHEM")
    public void setImgGobletOfEonothem(String imgGobletOfEonothem) {
        this.imgGobletOfEonothem = imgGobletOfEonothem;
    }
    /**
     * Sirve para coger el valor de circletOfLogos
     * @return nos devuelve el valor de circletOfLogos
     */
    public String getCircletOfLogos() {
        return circletOfLogos;
    }
    /**
     * Asignar el valor de CIRCLETOFLOGOS de artifacto
     * @param circletOfLogos el valor que queremos asignar
     */
    @XmlElement(name="CIRCLETOFLOGOS")
    public void setCircletOfLogos(String circletOfLogos) {
        circletOfLogos = circletOfLogos;
    }
    /**
     * Sirve para coger el imagen de circletOfLogos
     * @return nos devuelve el imagen de circletOfLogos
     */
    public String getImgCircletOfLogos() {
        return imgCircletOfLogos;
    }
    /**
     * Asignar el valor de imagen de CIRCLETOFLOGOS
     * @param imgCircletOfLogos el valor que queremos asignar
     */
    @XmlElement(name="IMGCIRCLETOFLOGOS")
    public void setImgCircletOfLogos(String imgCircletOfLogos) {
        this.imgCircletOfLogos = imgCircletOfLogos;
    }
    /**
     * Sirve para coger el valor de x2bonus
     * @return nos devuelve el valor de x2bonus
     */
    public String getX2Bonus() {
        return x2Bonus;
    }
    /**
     * Asignar el valor de X2Bonus de artifacto
     * @param x2Bonus el valor que queremos asignar
     */
    @XmlElement(name="X2Bonus")
    public void setX2Bonus(String x2Bonus) {
        this.x2Bonus = x2Bonus;
    }
    /**
     * Sirve para coger el valor de x4bonus
     * @return nos devuelve el valor de x4bonus
     */
    public String getX4Bonus() {
        return x4Bonus;
    }
    /**
     * Asignar el valor de x4Bonus de artifacto
     * @param x4Bonus el valor que queremos asignar
     */
    @XmlElement(name="X4Bonus")
    public void setX4Bonus(String x4Bonus) {
        this.x4Bonus = x4Bonus;
    }
    /**Retorna un string con los datos de artifact
     * @return String con el artifact
     */
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


