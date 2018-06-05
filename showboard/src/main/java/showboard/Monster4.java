package showboard;

import java.io.IOException;

/**
 * Monster1.java created for lorann
 *
 * @author Julien
 * @version 1.0
 * @since 05/06/2018
 */
public class Monster4 extends MovingPawn {

    private int timer = 0;

    public Monster4(BoardPanel boardPanel) throws IOException {
        super("res/monster_4.png", boardPanel);
        setKillsOnTouch(true);
    }

    @Override
    protected boolean onMove() {
        if (timer < 3) {
            setX(getX() + 1);
        } else if (timer < 6) {
            setX(getX() - 1);
        } else if (timer < 9) {
            setY(getY() + 1);
        } else {
            setY(getY() - 1);
        }

        timer = (timer + 1) % 12;
        return true;
    }
}