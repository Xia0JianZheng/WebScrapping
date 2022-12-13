import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;
/**
 * Esta clase contiene una lista de la clase armas
 */
@XmlRootElement(name="Weapons")
public class Weapons {
    List<Weapon> weaponsDatas = new ArrayList<>();
    /**
     * Aqui cogemos la lista de armas.
     * @return devuelve la lista.
     */
    public List<Weapon> getWeaponsDatas() {
        return weaponsDatas;
    }
    /**
     * Aqui asignamos una lista de la clase armas
     * @param weaponsDatas recibe el que asignaremos a la lista
     */
    @XmlElement(name="Weapon")
    public void setWeaponsDatas(List<Weapon> weaponsDatas) {
        this.weaponsDatas = weaponsDatas;
    }
    /**
     * Añade los datos en la lista armas
     * @param xmldata recibe los datos de armas
     */
    public void addWeaponsDatas(Weapon xmldata){
        this.weaponsDatas.add(xmldata);
    }
}
