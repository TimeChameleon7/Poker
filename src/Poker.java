import io.github.algodiv.cards_engine.commons.tools.Game;

public class Poker implements Game {

    @Override
    public void init() {
        System.out.println("Poker init called");
    }

    @Override
    public String getName() {
        return "Poker";
    }
}
