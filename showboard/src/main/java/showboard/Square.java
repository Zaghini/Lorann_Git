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
    private boolean solid;

    public Square(String path, boolean solid) throws IOException {
        this(ImageIO.read(new File(path)), solid);
    }

    private Square(Image image, boolean solid) {
        this.image = image;
        this.solid = solid;
    }

    @Override
    public Image getImage() {
        return image;
    }

    @Override
    public boolean isSolid() {
        return solid;
    }
}
