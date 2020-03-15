import io.GameIO;
import io.PlayerIO;
import locations.towns.*;
import player.Player;
import player.SaveFiles;

public class MainApplication {
    private Cintra cintra = new Cintra();
    private Kaedwen kaedwen = new Kaedwen();
    private Novigrad novigrad = new Novigrad();
    private Oxenfurt oxenfurt = new Oxenfurt();
    private Redania redania = new Redania();
    private Rivia rivia = new Rivia();
    private RuinsOfNilfgaard ruinsOfNilfgaard = new RuinsOfNilfgaard();
    private Temeria temeria = new Temeria();
    private Toussaint toussaint = new Toussaint();
    private static PlayerIO playerIO = new PlayerIO(System.in, System.out);
    private static SaveFiles saveFiles = new SaveFiles();
    private static Player player;

    public static void intro(){
        Integer newOrLoad = playerIO.getIntegerInput("Press 1 for New Game.\nPress 2 to Load Game.");
        if (newOrLoad == 1)
            createPlayer();
        else if (newOrLoad == 2)
            if (!saveFiles.isEmpty())
                choosePlayer();
            else {
                System.out.println("No save files found.\nYou will not be redirected to New Game.\n");
                createPlayer(); }
        else
            System.out.println("\nPlease Enter 1 or 2.\n");
            intro();
    }

    private static void choosePlayer() {
        System.out.println(saveFiles.toString());
        Integer choice = playerIO.getIntegerInput("Enter your save file number.");
        if (saveFiles.contains(choice)) {
            player = saveFiles.get(choice);
            beginning();
        }
        else
            System.out.println("That save file number does not exist.");
        intro();
    }

    private static void createPlayer() {
        String name = playerIO.getStringInput("What is the name of our hero?");
        player = new Player(name);
        saveFiles.add(player);
        saveFiles.save();
        beginning();
    }

    private static void beginning() {
        System.out.println("We did it!");
        System.exit(0);
    }

    public static void main(String[] args){
        GameIO.welcome();
        intro();
    }
}
