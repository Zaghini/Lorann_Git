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
        registry.put(' ', null);
        try {
        	registry.put('M', new CornerWall());
            registry.put('I', new Square("res/vertical_bone.png"));
            registry.put('-', new Square("res/horizontal_bone.png"));
            registry.put('O', new Square("res/crystal_ball.png"));
            registry.put('B', new Square("res/purse.png"));
            registry.put('F', new Square("res/gate_closed.png"));
            //registry.put('P', new Square("res/gate_ouverte.png"));
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
