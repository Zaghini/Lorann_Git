package showboard;

import java.io.IOException;

/**
 * Monster1Builder.java created for lorann
 *
 * @author Julien
 * @version 1.0
 * @since 05/06/2018
 */
public class Monster3Builder extends APawnBuilder<Monster3> {

	/**
	 * 
	 * @param boardPanel
	 * @throws IOException
	 */
    protected Monster3Builder(BoardPanel boardPanel) throws IOException {
        super(boardPanel);
    }

    /**
     * Instantiate Monster3
     */
    @Override
    protected Monster3 instantiate(BoardPanel boardPanel) throws IOException {
        return new Monster3(boardPanel);
    }
}