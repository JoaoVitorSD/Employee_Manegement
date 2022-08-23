import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Game> games = new ArrayList<>();
        games.add(new Game("God of War 4", 210.31));
        games.add(new Game("Amoung Us", 10.59));
        games.add(new Game("Naruto ninja storm", 90.32));
        games.add(new Game("GTA V", 130.99));
        List<String> names = games.stream().map(new UpperCaseName()).collect(Collectors.toList());
        names.forEach(System.out::println);
    }
}