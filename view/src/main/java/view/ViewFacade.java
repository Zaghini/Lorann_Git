package view;

import showboard.BoardFrame;
import javax.swing.*;

/**
 * <h1>The Class ViewFacade provides a facade of the View component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ViewFacade implements IView {

    private BoardFrame boardFrame;

    /**
     * Instantiates a new view facade.
     */
    public ViewFacade() {
        boardFrame = new BoardFrame();
    }

    /*
     * (non-Javadoc)
     * @see view.IView#displayMessage(java.lang.String)
     */
    @Override
    public final void displayMessage(final String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    @Override
    public BoardFrame getBoardFrame() {
        return boardFrame;
    }
}
