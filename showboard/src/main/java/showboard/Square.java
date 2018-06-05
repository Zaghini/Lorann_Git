package showboard;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * Square.java created for lorann
 *
 * @author Antoine
 * @version 1.0
 * @since 03/06/2018
 */
public class Square implements ISquare {

    private Image image;
    private int x;
    private int y;

    public Square(String path) throws IOException {
        this(ImageIO.read(new File(path)));
    }

    private Square(Image image) {
        this.image = image;
    }

    @Override
    public Image getImage() {
        return image;
    }

    @Override
    public boolean isSolid() {
        return false;
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
}
