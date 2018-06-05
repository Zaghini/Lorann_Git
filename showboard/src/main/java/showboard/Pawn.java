package showboard;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * Pawn.java created for lorann
 *
 * @author Julien
 * @version 1.0
 * @since 04/06/2018
 */
public class Pawn implements IPawn {

    private       int        x;
    private       int        y;
    private       boolean    killsOnTouch;
    private final Image      image;
    private final boolean    solid;
    private final BoardPanel boardPanel;

    /**
     * 
     * @param image
     * @param solid
     * @param boardPanel
     */
    public Pawn(Image image, boolean solid, BoardPanel boardPanel) {
        this.image = image;
        this.solid = solid;
        this.boardPanel = boardPanel;
        killsOnTouch = false;
    }

    /**
     * 
     * @param imagePath
     * @param boardPanel
     * @throws IOException
     */
    public Pawn(String imagePath, BoardPanel boardPanel) throws IOException {
        this(ImageIO.read(new File(imagePath)), false, boardPanel);
    }

    /**
     * 
     * @param image
     * @param boardPanel
     */
    public Pawn(Image image, BoardPanel boardPanel) {
        this(image, false, boardPanel);
    }

    /**
     * Return a killsOnTouch
     */
    public boolean isKillsOnTouch() {
        return killsOnTouch;
    }

    public void setKillsOnTouch(boolean killsOnTouch) {
        this.killsOnTouch = killsOnTouch;
    }

    /**
     * setX for isSolidAt
     * @param x
     */
    protected void setX(int x) {
        if (boardPanel.isSolidAt(x, y))
            return;
        this.x = x;
    }

    /**
     * setY for isSolidAt
     * @param y
     */
    protected void setY(int y) {
        if (boardPanel.isSolidAt(x, y))
            return;
        this.y = y;
    }

    /**
     * setPosition
     * @param x
     * @param y
     */
    protected void setPosition(int x, int y) {
        if (boardPanel.isSolidAt(x, y))
            return;
        this.x = x;
        this.y = y;
    }

    protected BoardPanel getBoardPanel() {
        return boardPanel;
    }

    protected ISquare getCurrentSquare() {
        return boardPanel.getSquareAt(x, y);
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public Point getPosition() {
        return new Point(x, y);
    }

    @Override
    public Image getImage() {
        return image;
    }

    @Override
    public boolean isSolid() {
        return solid;
    }

    @Override
    public char getId() {
        return 0;
    }

    @Override
    public void update(float delta) {

    }
}