package showboard;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * PawnRegistry.java created for lorann
 *
 * @author Antoine
 * @version 1.0
 * @since 04/06/2018
 */
public class PawnRegistry {

    private static PawnRegistry instance;

    private final Map<String, IPawnBuilder> registry;

    private PawnRegistry() {
        registry = new HashMap<>();
        try {
            registry.put("Player", new PawnBuilder("res/lorann_l.png", true));
            registry.put("Monster_1", new PawnBuilder("res/monster_1.png", true));
            registry.put("Monster_2", new PawnBuilder("res/monster_2.png", true));
            registry.put("Monster_3", new PawnBuilder("res/monster_3.png", true));
            registry.put("Monster_4", new PawnBuilder("res/monster_4.png", true));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public IPawn getPawn(String key, int x, int y) {
        IPawnBuilder builder = registry.get(key);
        if (builder == null)
            return null;
        builder.setX(x);
        builder.setY(y);
        return builder.build();
    }

    public static PawnRegistry getInstance() {
        if (instance == null)
            instance = new PawnRegistry();
        return instance;
    }
}
