package src.entities;

import java.util.Comparator;

public class GameComparator implements Comparator <Game> {
    @Override
    public int compare(Game o1, Game o2) {
        return o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());
    }
}
