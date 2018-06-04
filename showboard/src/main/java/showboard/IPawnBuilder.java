package showboard;

/**
 * IPawnBuilder.java created for lorann
 *
 * @author Antoine
 * @version 1.0
 * @since 04/06/2018
 */
public interface IPawnBuilder<T extends IPawn> {

    IPawnBuilder setX(int x);

    IPawnBuilder setY(int y);

    T build();
}
