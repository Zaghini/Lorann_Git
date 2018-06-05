package showboard;

import java.awt.*;
import java.io.IOException;

/**
 * MovingPawn.java created for lorann
 *
 * @author Antoine
 * @version 1.0
 * @since 05/06/2018
 */
public abstract class MovingPawn extends Pawn {

    private float moveDelay = 1, moveTimer = 0;

    public MovingPawn(Image image, boolean solid, BoardPanel boardPanel) {
        super(image, solid, boardPanel);
    }

    public MovingPawn(String imagePath, BoardPanel boardPanel) throws IOException {
        super(imagePath, boardPanel);
    }

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
