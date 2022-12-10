import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name="Weapons")
public class Weapons {
    List<Weapon> weaponsDatas = new ArrayList<>();

    public List<Weapon> getWeaponsDatas() {
        return weaponsDatas;
    }

    @XmlElement(name="Weapon")
    public void setWeaponsDatas(List<Weapon> weaponsDatas) {
        this.weaponsDatas = weaponsDatas;
    }

    public void addWeaponsDatas(Weapon xmldata){
        this.weaponsDatas.add(xmldata);
    }
}
