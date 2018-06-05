package showboard;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * PawnBuilder.java created for lorann
 *
 * @author Julien
 * @version 1.0
 * @since 04/06/2018
 */
public class PawnBuilder extends APawnBuilder<Pawn> {

    private final Image   image;
    private final boolean solid;

    public PawnBuilder(String imagePath, boolean solid, BoardPanel boardPanel) throws IOException {
        super(boardPanel);
        image = ImageIO.read(new File(imagePath));
        this.solid = solid;
    }

    @Override
    protected Pawn instantiate(BoardPanel boardPanel) {
        return new Pawn(image, solid, boardPanel);
    }
}
