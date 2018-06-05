package showboard;

import java.awt.Image;

public class Lorann extends Pawn{

	public Lorann(Image image, boolean solid) {
		super(image, solid);
		// TODO Auto-generated constructor stub
	}

	public void moveUp() {
    	this.setY(this.getY() - 1);
    }
    
    public void moveDown() {
    	this.setY(this.getY() + 1);
    }
    
    public void moveLeft() {
    	this.setX(this.getX() - 1);
    }
    
    public void moveRight() {
    	this.setX(this.getX() + 1);
    }
}
