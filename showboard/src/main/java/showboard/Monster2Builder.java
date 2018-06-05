package showboard;

import java.io.IOException;

/**
 * Monster1Builder.java created for lorann
 *
 * @author Julien
 * @version 1.0
 * @since 05/06/2018
 */
public class Monster2Builder extends APawnBuilder<Monster2> {

	/**
	 * 
	 * @param boardPanel
	 * @throws IOException
	 */
    protected Monster2Builder(BoardPanel boardPanel) throws IOException {
        super(boardPanel);
    }

    /**
     * Instantiate Monster2
     */
    @Override
    protected Monster2 instantiate(BoardPanel boardPanel) throws IOException {
        return new Monster2(boardPanel);
    }
}