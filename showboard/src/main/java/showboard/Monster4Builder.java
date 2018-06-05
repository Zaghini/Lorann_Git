package showboard;

import java.io.IOException;

/**
 * Monster1Builder.java created for lorann
 *
 * @author Antoine
 * @version 1.0
 * @since 05/06/2018
 */
public class Monster4Builder extends APawnBuilder<Monster4> {

    protected Monster4Builder(BoardPanel boardPanel) throws IOException {
        super(boardPanel);
    }

    @Override
    protected Monster4 instantiate(BoardPanel boardPanel) throws IOException {
        return new Monster4(boardPanel);
    }
}