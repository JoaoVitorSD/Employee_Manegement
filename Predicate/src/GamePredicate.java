import java.util.function.Predicate;

public class GamePredicate implements Predicate<Game> {
    @Override
    public boolean test(Game game) {
        return game.getPrice()<=100;
    }
}
