package controller;

import java.awt.*;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Time;

import model.IModel;
import model.Map;
import showboard.BoardFrame;
import showboard.IPawn;
import showboard.PawnRegistry;
import showboard.SquareRegistry;
import view.IView;

/**
 * <h1>The Class ControllerFacade provides a facade of the Controller component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ControllerFacade implements IController {

    /**
     * The view.
     */
    private final IView view;

    private final BoardFrame board;

    private final PawnRegistry pawnRegistry;

    /**
     * The model.
     */
    private final IModel model;

    /**
     * Instantiates a new controller facade.
     *
     * @param view  the view
     * @param model the model
     */
    public ControllerFacade(final IView view, final IModel model) {
        super();
        this.view = view;
        this.model = model;
        this.board = view.getBoardFrame();
        pawnRegistry = new PawnRegistry(board.getBoardPanel());
    }

    /**
     * Start.
     *
     * @throws SQLException the SQL exception
     */
    public void start() throws SQLException {
        Map map = model.getMapByName("Level 5");
        loadMap(map);
        try {
            mainLoop();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void loadMap(Map map) {
        board.setDimension(new Dimension(map.getWidth(), map.getHeight()));
        board.setDisplayFrame(new Rectangle(0, 0, map.getWidth(), map.getHeight()));
        String[] rows = map.getMapData().split("\n");
        int h = Math.min(map.getHeight(), rows.length);
        for (int y = 0; y < h; y += 1) {
            int w = Math.min(map.getWidth(), rows[y].length());
            for (int x = 0; x < w; x += 1) {
                board.addSquare(SquareRegistry.getInstance().getSquare(rows[y].charAt(x)), x, y);
            }
        }
        String[] pawns = map.getPawnData().split(";");
        for (String pawnData : pawns) {
            String[] data = pawnData.split(",");
            if (data.length != 3)
                continue;
            IPawn pawn = null;
            try {
                pawn = pawnRegistry.getPawn(
                        data[0],
                        Integer.parseInt(data[1]),
                        Integer.parseInt(data[2])
                );
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (pawn != null) {
                board.addPawn(pawn);
            }
        }
        board.repaint();
    }

    private void mainLoop() throws InterruptedException {
        long time = System.currentTimeMillis();
        do {
            Thread.sleep(1000 / 60);
            long now = System.currentTimeMillis();
            float delta = (now - time) / 1000f;
            time = System.currentTimeMillis();
            for (IPawn pawn : board.getBoardPanel().getPawns()) {
                pawn.update(delta);
            }
            board.repaint();
        } while (true);
    }

    /**
     * Gets the view.
     *
     * @return the view
     */
    public IView getView() {
        return this.view;
    }

    /**
     * Gets the model.
     *
     * @return the model
     */
    public IModel getModel() {
        return this.model;
    }
}
