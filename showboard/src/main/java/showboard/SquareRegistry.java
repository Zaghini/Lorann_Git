package showboard;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * SquareRegistry.java created for lorann
 *
 * @author Julien
 * @version 1.0
 * @since 03/06/2018
 */
public class SquareRegistry {

    private static SquareRegistry instance;

    private final Map<Character, Square> registry;

    /**
     * Put Squares in a Registry
     */
    private SquareRegistry() {
        registry = new HashMap<>();
        try {
            registry.put('M', new Square("res/bone.png", true, 'M'));
            registry.put('I', new Square("res/vertical_bone.png", true, 'I'));
            registry.put('-', new Square("res/horizontal_bone.png", true, '-'));
            registry.put('O', new Square("res/crystal_ball.png", false, 'O'));
            registry.put('B', new Square("res/purse.png", false, 'B'));
            registry.put('F', new Square("res/gate_closed.png", true, 'F'));
            registry.put('G', new Square("res/gate_open.png", false, 'G'));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Recovers the Squares in the Registry
     * @param key
     * @return
     */
    public ISquare getSquare(char key) {
        return registry.get(key);
    }

    /**
     * Instantiate a Registry
     * @return
     */
    public static SquareRegistry getInstance() {
        if (instance == null)
            instance = new SquareRegistry();
        return instance;
    }
}