package player;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class SaveFiles {
    private Map<Integer, Player> saves = new HashMap<>();
    private Integer id = 1;

    public SaveFiles(){
        loadSaves();
    }

    //TESTING PURPOSES ONLY
    public SaveFiles(String TestingOnly){
        loadSavesTest();
    }

    public void loadSaves() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            saves = objectMapper.readValue(new File("saves.json"), new TypeReference<HashMap<Integer, Player>>() {
            });
        } catch (MismatchedInputException e) {
            System.out.println("No Load files found.\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //TESTING PURPOSES ONLY
    public void loadSavesTest() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            saves = objectMapper.readValue(new File("savesTest.json"), new TypeReference<HashMap<Integer, Player>>() {
            });
        } catch (MismatchedInputException e) {
            System.out.println("No Load files found.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void save(){
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writerWithType(new TypeReference<HashMap<Integer, Player>>() {}).writeValue(new File("saves.json"), saves);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //TESTING PURPOSES ONLY
    public void saveTest(){
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writerWithType(new TypeReference<HashMap<Integer, Player>>() {}).writeValue(new File("savesTest.json"), saves);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void add(Player player){
        saves.put(id++, player);
    }

    public boolean contains(Integer id){
        return saves.containsKey(id);
    }

    public Player get(Integer id){
        return saves.get(id);
    }

    public boolean isEmpty(){
        return saves.isEmpty();
    }

    @Override
    public String toString(){
        String output = "";
        for(Map.Entry<Integer, Player> entry : saves.entrySet()){
            output += entry.getKey() + ".  Name: " + entry.getValue().getName() + "  Level: " + entry.getValue().getLevel() + "\n";
        }
        return output;
    }
}
