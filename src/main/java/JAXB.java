import jakarta.xml.bind.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class JAXB {
        File file = new File("src/main/infos/xml/characters.xml");
        XmlDatas datas = new XmlDatas();
        XmlData data;
        JAXBContext jaxbContext;
        Marshaller jaxbMarshaller;

        JAXB(List<Character> characters) {
            try {
                jaxbContext = JAXBContext.newInstance(XmlDatas.class);

                for (Character character : characters) {
                    data = new XmlData(character.nombre,character.rareza,character.image,character.descripcion,character.elemento,character.region,character.arma);
                    datas.addXmlDatas(data);
                }

                jaxbMarshaller = jaxbContext.createMarshaller();
                jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
                jaxbMarshaller.marshal(datas, file);

            } catch (JAXBException e) {
                e.printStackTrace();
            }
        }
}
