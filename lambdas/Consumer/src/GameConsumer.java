import java.util.function.Consumer;

public class GameConsumer implements Consumer<Game> {

    @Override
    public void accept(Game game) {
        game.increasePrice();
    }
}
