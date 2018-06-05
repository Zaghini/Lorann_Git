package showboard;

import java.io.IOException;

/**
 * PlayerBuilder.java created for lorann
 *
 * @author Julien
 * @version 1.0
 * @since 05/06/2018
 */
public class PlayerBuilder extends APawnBuilder<Player> {

    protected PlayerBuilder(BoardPanel boardPanel) throws IOException {
        super(boardPanel);
    }

    @Override
    protected Player instantiate(BoardPanel boardPanel) throws IOException {
        return new Player(boardPanel);
    }
}
