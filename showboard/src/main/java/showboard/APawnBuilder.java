package showboard;

import java.io.IOException;

/**
 * APawnBuilder.java created for lorann
 *
 * @author Julien
 * @version 1.0
 * @since 05/06/2018
 */
public abstract class APawnBuilder<T extends Pawn> implements IPawnBuilder<T> {

    private T pawn;

    private final BoardPanel boardPanel;

    /**
     * 
     * @param boardPanel
     * @throws IOException
     */
    protected APawnBuilder(BoardPanel boardPanel) throws IOException {
        this.boardPanel = boardPanel;
        reset();
    }
/**
 * 
 * @param boardPanelS
 * @return
 * @throws IOException
 */
    protected abstract T instantiate(BoardPanel boardPanel) throws IOException;

    /**
     * Reset boardPanel
     * @throws IOException
     */
    private void reset() throws IOException {
        pawn = instantiate(boardPanel);
    }

    /**
     * SetPosition of Pawns
     */
    @Override
    public IPawnBuilder setPosition(int x, int y) {
        pawn.setPosition(x, y);
        return this;
    }

    /**
     * build Pawns
     */
    @Override
    public T build() throws IOException {
        T ret = pawn;
        reset();
        return ret;
    }
}
