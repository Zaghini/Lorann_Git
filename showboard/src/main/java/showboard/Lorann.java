package showboard;

import java.awt.Image;

public class Lorann extends Pawn{
	
	private Purse purse;
	private int score;
	private Bubble bubble;
	private Gate_Closed gate_closed;
	private Gate_Open gate_open;
	private Pawn monster_1;
	private Pawn monster_2;
	private Pawn monster_3;
	private Pawn monster_4;

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
    
    public String collision(int score) {
    	if(this.getX() == purse.getX() && this.getY() == purse.getY()) {
    		destroy(purse);
    		this.score = score + 500;
    	}
    	if(this.getX() == bubble.getX() && this.getY() == bubble.getY()) {
    		destroy(bubble);
    		destrop(gate_closed);
    		Gate_Open gate_open = new Gate_Open(null);
    	}
    	if(this.getX() == gate_open.getX() && this.getY() == gate_open.getY()) {
    		return ("Victoire : Score :" + getScore());
    	}
    	if(this.getX() == monster_1.getX() && this.getY() == monster_1.getY()) {
    		this.die();
    	}
    	if(this.getX() == monster_2.getX() && this.getY() == monster_2.getY()) {
    		this.die();
    	}
    	if(this.getX() == monster_3.getX() && this.getY() == monster_3.getY()) {
    		this.die();
    	}
    	if(this.getX() == monster_4.getX() && this.getY() == monster_4.getY()) {
    		this.die();
    	}
    }

	private int getScore() {
		return score;
	}
}
