import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class CSV{

    File fileCharacters = new File("src/main/infos/csv/Characters.csv");
    File fileWeapons = new File("src/main/infos/csv/Weapons.csv");
    File fileArtifacts = new File("src/main/infos/csv/Artifacts.csv");


    public CSV(List<Character>characters,List<Weapon>weapons,List<Artifact> artifacts){

            CSVWriter csvWriter;
            String[] head = {"Nom","Rareza","Image","descripcion","elemento","region","arma"};
            List<String[]> dataCharacter = new ArrayList<>();
            for (Character character: characters){
                dataCharacter.add(new String[] {character.name,character.rarity,character.image,character.description,character.element,character.region,character.weapon});
            }
            try {
                csvWriter = new CSVWriter(new FileWriter(fileCharacters));
                csvWriter.writeNext(head);
                csvWriter.writeAll(dataCharacter);
                csvWriter.close();
            } catch (IOException e) {
            }

            head = new String[]{"Name", "Rarity", "Image", "Description", "Type", "BaseATK",};
        List<String[]> dataWeapon = new ArrayList<>();

        for (Weapon weapon: weapons){
            dataWeapon.add(new String[] {weapon.name,weapon.rarity,weapon.image,weapon.description,weapon.type,weapon.baseATK});
        }
        try{
            csvWriter = new CSVWriter(new FileWriter(fileWeapons));
            csvWriter.writeNext(head);
            csvWriter.writeAll(dataWeapon);
            csvWriter.close();
        }catch (Exception e){
        }

           head = new String[]{"setName", "flowerOfLife", "imgFlowerOfLife", "plumeOfDeath", "imgPlumeOfDeath", "sandsOfEon", "imgSandsOfEon", "gobletOfEonothem", "imgGobletOfEonothem", "circletOfLogos", "imgCircletOfLogos", "x2Bonus", "x4Bonus"};
            List<String[]> dataArtifact = new ArrayList<>();
            for (Artifact artifact: artifacts){
                dataArtifact.add(new String[] {artifact.setName,artifact.flowerOfLife,artifact.imgFlowerOfLife,artifact.plumeOfDeath,artifact.imgPlumeOfDeath,artifact.sandsOfEon,artifact.imgSandsOfEon,artifact.gobletOfEonothem,artifact.imgGobletOfEonothem,artifact.circletOfLogos,artifact.imgCircletOfLogos,artifact.x2Bonus,artifact.x4Bonus});
            }
            try {
                csvWriter = new CSVWriter(new FileWriter(fileArtifacts));
                csvWriter.writeNext(head);
                csvWriter.writeAll(dataArtifact);
                csvWriter.close();
            } catch (IOException e) {
            }

    }


}