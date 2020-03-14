package player;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SaveFiles {
    List<Player> saves = new ArrayList<Player>();

    public SaveFiles(){
        loadSaves();
    }

    public void loadSaves() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            saves = objectMapper.readValue(new File("saves.json"), new TypeReference<ArrayList<Player>>() {
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void save(){
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writerWithType(new TypeReference<ArrayList<Player>>() {}).writeValue(new File("saves.json"), saves);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString(){
        String output = "";
        for (int i = 0; i < saves.size(); i++) {
            output += (i + 1) + ".  " + "Name: " + saves.get(i).getName() + "\n";
        }
        return output;
    }
}
