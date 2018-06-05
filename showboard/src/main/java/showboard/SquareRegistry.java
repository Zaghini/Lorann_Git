package showboard;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * SquareRegistry.java created for lorann
 *
 * @author Antoine
 * @version 1.0
 * @since 03/06/2018
 */
public class SquareRegistry {

    private static SquareRegistry instance;

    private final Map<Character, Square> registry;

    private SquareRegistry() {
        registry = new HashMap<>();
        try {
            registry.put('M', new Square("res/bone.png", true));
            registry.put('I', new Square("res/vertical_bone.png", true));
            registry.put('-', new Square("res/horizontal_bone.png", true));
            registry.put('O', new Square("res/crystal_ball.png", false));
            registry.put('B', new Square("res/purse.png", false));
            registry.put('F', new Square("res/gate_closed.png", true));
            registry.put('G', new Square("res/gate_open.png", false));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public ISquare getSquare(char key) {
        return registry.get(key);
    }

    public static SquareRegistry getInstance() {
        if (instance == null)
            instance = new SquareRegistry();
        return instance;
    }
}