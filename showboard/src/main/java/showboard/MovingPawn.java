package showboard;

import java.awt.*;
import java.io.IOException;

/**
 * MovingPawn.java created for lorann
 *
 * @author Julien
 * @version 1.0
 * @since 05/06/2018
 */
public abstract class MovingPawn extends Pawn {

    private float moveDelay = 1, moveTimer = 0;

    /**
     * 
     * @param image
     * @param solid
     * @param boardPanel
     */
    public MovingPawn(Image image, boolean solid, BoardPanel boardPanel) {
        super(image, solid, boardPanel);
    }

    /**
     * 
     * @param imagePath
     * @param boardPanel
     * @throws IOException
     */
    public MovingPawn(String imagePath, BoardPanel boardPanel) throws IOException {
        super(imagePath, boardPanel);
    }

    /**
     * 
     * @param image
     * @param boardPanel
     */
    public MovingPawn(Image image, BoardPanel boardPanel) {
        super(image, boardPanel);
    }

    public float getMoveDelay() {
        return moveDelay;
    }

    public void setMoveDelay(float moveDelay) {
        this.moveDelay = moveDelay;
    }

    protected abstract boolean onMove();

    /**
     * Update Timer
     */
    @Override
    public void update(float delta) {
        if (moveTimer >= moveDelay) {
            if (onMove())
                moveTimer = 0;
            return;
        }
        moveTimer += delta;
    }
}
