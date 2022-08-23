import java.util.function.Function;

public class UpperCaseName implements Function<Game, String> {
    @Override
    public String apply(Game game){
        return game.getName().toUpperCase();
    }
}
