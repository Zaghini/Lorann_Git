package showboard;

import java.io.IOException;

/**
 * IPawnBuilder.java created for lorann
 *
 * @author Antoine
 * @version 1.0
 * @since 04/06/2018
 */
public interface IPawnBuilder<T extends IPawn> {

    IPawnBuilder setPosition(int x, int y);

    T build() throws IOException;
}
