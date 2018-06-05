package showboard;

import java.awt.Image;

public class Monster_1 extends Pawn{
	
	private Monster_1 monster_1;
	
	public Monster_1(Image image, boolean solid) {
		super(image, solid);
		// TODO Auto-generated constructor stub
	}
	
	public void move() {
		while(monster_1.isAlive()) {
			
		for(int i= 0; i<3; i++) {
			monster_1.setX(monster_1.getX()+1);
		    }
		for(int j= 0; j<3; j++) {
			monster_1.setX(monster_1.getX()-1);
		    }
		}
	}
}
