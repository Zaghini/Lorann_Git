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

    private final Map<String, IPawnBuilder> registry;

    public PawnRegistry(BoardPanel boardPanel) {
        registry = new HashMap<>();
        try {
            registry.put("Player", new PlayerBuilder(boardPanel));
            registry.put("Monster1", new Monster1Builder(boardPanel));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public IPawn getPawn(String key, int x, int y) throws IOException {
        IPawnBuilder builder = registry.get(key);
        if (builder == null)
            return null;
        builder.setPosition(x, y);
        return builder.build();
    }
}
