package showboard;

import java.io.IOException;

/**
 * Monster1Builder.java created for lorann
 *
 * @author Julien
 * @version 1.0
 * @since 05/06/2018
 */
public class Monster1Builder extends APawnBuilder<Monster1> {

	/**
	 * 
	 * @param boardPanel
	 * @throws IOException
	 */
    protected Monster1Builder(BoardPanel boardPanel) throws IOException {
        super(boardPanel);
    }

    /**
     * Instantiate Monster1
     */
    @Override
    protected Monster1 instantiate(BoardPanel boardPanel) throws IOException {
        return new Monster1(boardPanel);
    }
}
