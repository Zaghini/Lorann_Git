package showboard;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Clavier implements KeyListener{

	private Lorann lorann;

	public Clavier(Lorann lorann) {
		this.lorann = lorann;
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_8) {
			lorann.moveUp();
		}else if(e.getKeyCode() == KeyEvent.VK_4){
			lorann.moveLeft();
		}else if(e.getKeyCode() == KeyEvent.VK_6) {
			lorann.moveRight();
		}else if(e.getKeyCode() == KeyEvent.VK_5) {
			lorann.moveDown();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}

	
}
