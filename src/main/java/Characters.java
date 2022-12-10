
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;
@XmlRootElement(name="Characters")
public class Characters {
        List<Character> charactersDatas = new ArrayList<>();

    public List<Character> getCharactersDatas() {
        return charactersDatas;
    }

    @XmlElement(name="Character")
    public void setCharactersDatas(List<Character> charactersDatas) {
        this.charactersDatas = charactersDatas;
    }

    public void addCharactersDatas(Character xmldata){
        this.charactersDatas.add(xmldata);
    }
}
