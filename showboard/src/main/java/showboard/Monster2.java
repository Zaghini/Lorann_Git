package showboard;

import java.io.IOException;

/**
 * Monster1.java created for lorann
 *
 * @author Antoine
 * @version 1.0
 * @since 05/06/2018
 */
public class Monster2 extends MovingPawn {

    private int timer = 0;

    public Monster2(BoardPanel boardPanel) throws IOException {
        super("res/monster_2.png", boardPanel);
    }

    @Override
    protected boolean onMove() {
        if (timer < 3) {
            setX(getX() + 1);
        } else {
            setX(getX() - 1);
        }
        timer = (timer + 1) % 6;
        return true;
    }
}