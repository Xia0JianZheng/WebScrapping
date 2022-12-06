import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class CSV{
    File file = new File("src/main/infos/csv/Characters.csv");

    public CSV(List<Character> characters){

            CSVWriter csvWriter;
            String[] head = {"Nom","Rareza","Image","descripcion","elemento","region","arma"};
            List<String[]> data = new ArrayList<>();
            for (Character character: characters){
                data.add(new String[] {character.nombre,character.rareza,character.image,character.descripcion,character.elemento,character.region,character.arma});
            }
            try {
                csvWriter = new CSVWriter(new FileWriter(file));
                csvWriter.writeNext(head);
                csvWriter.writeAll(data);
                csvWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}