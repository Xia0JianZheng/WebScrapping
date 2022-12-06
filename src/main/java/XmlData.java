import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="Character")
public class XmlData {
    String nombre;

    String image;
    String rareza;
    String descripcion;
    String elemento;
    String region;
    String arma;

    public XmlData(String nombre, String rareza, String image, String descripcion, String elemento, String region, String arma) {
        this.nombre = nombre;
        this.rareza = rareza;
        this.image = image;
        this.descripcion = descripcion;
        this.elemento = elemento;
        this.region = region;
        this.arma = arma;
    }

    public XmlData() {
    }

    @XmlElement(name="CHARACATER_NAME")
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    @XmlElement(name="CHARACTER_IMAGE")
    public void setImage(String image) {
        this.image = image;
    }
    public String getImage() {
        return image;
    }

    @XmlElement(name="CHARACTER_RAREZA")
    public void setRareza(String rareza) {
        this.rareza = rareza;
    }
    public String getRareza() {
        return rareza;
    }

    @XmlElement(name="CHARACTER_DESCRIPCION")
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getDescripcion() {
        return descripcion;
    }

    @XmlElement(name="CHARACTER_ELEMENTO")
    public void setElemento(String elemento) {
        this.elemento = elemento;
    }
    public String getElemento() {
        return elemento;
    }

    @XmlElement(name="CHARACTER_REGION")
    public void setRegion(String region) {
        this.region = region;
    }
    public String getRegion() {
        return region;
    }

    @XmlElement(name="CHARACTER_ARMA")
    public void setArma(String arma) {
        this.arma = arma;
    }
    public String getArma() {
        return arma;
    }


}
