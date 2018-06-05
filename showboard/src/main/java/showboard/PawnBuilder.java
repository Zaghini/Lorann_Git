package showboard;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * PawnBuilder.java created for lorann
 *
 * @author Antoine
 * @version 1.0
 * @since 04/06/2018
 */
public class PawnBuilder implements IPawnBuilder<Pawn> {

    private final Image   image;
    private final boolean solid;
    private       Pawn    pawn;

    public PawnBuilder(String imagePath, boolean solid) throws IOException {
        image = ImageIO.read(new File(imagePath));
        this.solid = solid;
        reset();
    }

    private void reset() {
        pawn = new Pawn(image, solid);
    }

    @Override
    public IPawnBuilder setX(int x) {
        pawn.setX(x);
        return this;
    }

    @Override
    public IPawnBuilder setY(int y) {
        pawn.setY(y);
        return this;
    }
    
    
	@Override
    public Pawn build() {
        Pawn ret = pawn;
        reset();
        return ret;
    }
}
