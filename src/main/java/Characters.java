
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;
/**
 * Esta clase contiene una lista de la clase Character
 */

@XmlRootElement(name="Characters")
public class Characters {
        List<Character> charactersDatas = new ArrayList<>();

    /**
     * Aqui cogemos la lista de character.
     * @return devuelve la lista.
     */
    public List<Character> getCharactersDatas() {
        return charactersDatas;
    }

    /**
     * Aqui asignamos una lista de la clase Character
     * @param charactersDatas recibe el que asignaremos a la lista
     */
    @XmlElement(name="Character")
    public void setCharactersDatas(List<Character> charactersDatas) {
        this.charactersDatas = charactersDatas;
    }

    /**
     * Añade los datos en la lista Characters
     * @param xmldata recibe los datos de character
     */
    public void addCharactersDatas(Character xmldata){
        this.charactersDatas.add(xmldata);
    }
}
