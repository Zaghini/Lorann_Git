package showboard;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * Pawn.java created for lorann
 *
 * @author Antoine
 * @version 1.0
 * @since 04/06/2018
 */
public class Pawn implements IPawn {

    private       int     x;
    private       int     y;
    private final Image   image;
    private final boolean solid;
    protected static Boolean alive = true;

    public Pawn(Image image, boolean solid) {
        this.image = image;
        this.solid = solid;
    }

    public Pawn(String imagePath) throws IOException {
        this(ImageIO.read(new File(imagePath)), true);
    }

    public Pawn(Image image) {
        this(image, true);
    }

    protected void setX(int x) {
        this.x = x;
    }

    protected void setY(int y) {
        this.y = y;
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
    
    public Boolean isAlive() {
        return this.alive;
    }

    public void die() {
        this.alive = false;
    }
    
    
}
