package showboard;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

/**
 * Player.java created for lorann
 *
 * @author Julien
 * @version 1.0
 * @since 05/06/2018
 */
public class Player extends MovingPawn implements KeyListener {

    private boolean left, right, up, down;

    public Player(BoardPanel boardPanel) throws IOException {
        super("res/lorann_u.png", boardPanel);
        boardPanel.addKeyListener(this);
        boardPanel.setFocusable(true);
        boardPanel.requestFocus();
        setMoveDelay(0.2f);
    }

    @Override
    protected boolean onMove() {
        if (left)
            setX(getX() - 1);
        else if (right)
            setX(getX() + 1);
        else if (up)
            setY(getY() - 1);
        else if (down)
            setY(getY() + 1);
        else
            return false;
        ISquare square = getCurrentSquare();
        if (square != null && square.getId() == 'O') {
            for (int x = 0; x < getBoardPanel().getDimension().getWidth(); x += 1) {
                for (int y = 0; y < getBoardPanel().getDimension().getHeight(); y += 1) {
                    square = getBoardPanel().getSquareAt(x, y);
                    if (square != null && square.getId() == 'F')
                        getBoardPanel().addSquare(SquareRegistry.getInstance().getSquare('G'), x, y);
                }
            }
            getBoardPanel().addSquare(null, getX(), getY());
        }
        if (square != null && square.getId() == 'G') {
            getBoardPanel().setFinished(true);
        }
        resetKeys();
        return true;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        resetKeys();
        updateState(e);
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    private void resetKeys() {
        left = false;
        up = false;
        right = false;
        down = false;
    }

    private void updateState(KeyEvent e) {
        switch (e.getKeyChar()) {
            case 'q':
                left = true;
                break;
            case 'z':
                up = true;
                break;
            case 'd':
                right = true;
                break;
            case 's':
                down = true;
                break;
        }
    }

}