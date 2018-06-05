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

    protected APawnBuilder(BoardPanel boardPanel) throws IOException {
        this.boardPanel = boardPanel;
        reset();
    }

    protected abstract T instantiate(BoardPanel boardPanel) throws IOException;

    private void reset() throws IOException {
        pawn = instantiate(boardPanel);
    }

    @Override
    public IPawnBuilder setPosition(int x, int y) {
        pawn.setPosition(x, y);
        return this;
    }

    @Override
    public T build() throws IOException {
        T ret = pawn;
        reset();
        return ret;
    }
}
