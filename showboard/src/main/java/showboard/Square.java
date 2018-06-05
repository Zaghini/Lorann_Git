package showboard;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * Square.java created for lorann
 *
 * @author Julien
 * @version 1.0
 * @since 03/06/2018
 */
public class Square implements ISquare {

    private Image image;
    private boolean solid;
    private final char id;

    public Square(String path, boolean solid, char id) throws IOException {
        this(ImageIO.read(new File(path)), solid, id);
    }

    private Square(Image image, boolean solid, char id) {
        this.image = image;
        this.solid = solid;
        this.id = id;
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
        return id;
    }
}