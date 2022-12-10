import jakarta.xml.bind.*;

import java.io.File;
import java.util.List;

public class JAXB {
        File fileCharacters = new File("src/main/infos/xml/characters.xml");
        File fileWeapons = new File("src/main/infos/xml/weapons.xml");
        File fileArtifacts = new File("src/main/infos/xml/artifacts.xml");
        Characters charactersDatas = new Characters();
        Weapons weaponsDatas = new Weapons();
        Artifacts artifactsDatas = new Artifacts();
        Character characterData;
        Weapon weaponData;
        Artifact artifactData;
        JAXBContext jaxbContext;
        Marshaller jaxbMarshaller;

        JAXB(List<Character>characters,List<Weapon>weapons,List<Artifact>artifacts) {
            try {
                jaxbContext = JAXBContext.newInstance(Characters.class);

                for (Character character : characters) {
                    characterData = new Character(character.name,character.rarity,character.image,character.description,character.element,character.region,character.weapon);
                    charactersDatas.addCharactersDatas(characterData);
                }

                jaxbMarshaller = jaxbContext.createMarshaller();
                jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
                jaxbMarshaller.marshal(charactersDatas, fileCharacters);

            } catch (JAXBException e) {
                e.printStackTrace();
            }

            try {
                jaxbContext = JAXBContext.newInstance(Weapons.class);

                for (Weapon weapon : weapons) {
                    weaponData = new Weapon(weapon.name,weapon.rarity,weapon.image,weapon.description,weapon.type,weapon.baseATK);
                    weaponsDatas.addWeaponsDatas(weaponData);
                }

                jaxbMarshaller = jaxbContext.createMarshaller();
                jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
                jaxbMarshaller.marshal(weaponsDatas, fileWeapons);

            } catch (JAXBException e) {
                e.printStackTrace();
            }

            try {
                jaxbContext = JAXBContext.newInstance(Artifacts.class);

                for (Artifact artifact : artifacts) {
                    artifactData = new Artifact(artifact.setName,artifact.flowerOfLife,artifact.imgFlowerOfLife,artifact.plumeOfDeath,artifact.imgPlumeOfDeath,artifact.sandsOfEon,artifact.imgSandsOfEon,artifact.gobletOfEonothem,artifact.imgGobletOfEonothem,artifact.circletOfLogos,artifact.imgCircletOfLogos,artifact.x2Bonus,artifact.x4Bonus);
                    artifactsDatas.addArtifactsDatas(artifactData);
                }

                jaxbMarshaller = jaxbContext.createMarshaller();
                jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
                jaxbMarshaller.marshal(artifactsDatas, fileArtifacts);

            } catch (JAXBException e) {
                e.printStackTrace();
            }
        }
}
