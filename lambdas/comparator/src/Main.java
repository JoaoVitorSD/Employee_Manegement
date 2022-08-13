package src;

import src.entities.Game;
import src.entities.GameComparator;

import java.io.File;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Game> games = new ArrayList<>();
        File file = new File("src/in.txt");
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String name = line.split("-")[0].trim();
                Double value = Double.parseDouble(line.split("-")[1].trim());
                games.add(new Game(name, value));
            }
            games.sort(Comparator.comparing(o -> o.getName().toUpperCase()));
            //games.sort(new GameComparator());
            for (Game game : games) {
                System.out.println(game);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
