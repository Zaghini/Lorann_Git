package showboard;

import java.awt.Image;

public class Monster_2 extends Pawn{
	
	private Monster_2 monster_2;
	
	public Monster_2(Image image, boolean solid) {
		super(image, solid);
		// TODO Auto-generated constructor stub
	}
	
	public void move() {
		while(monster_2.isAlive()) {
			
		for(int i= 0; i<3; i++) {
			monster_2.setY(monster_2.getY()+1);
		    }
		for(int j= 0; j<3; j++) {
			monster_2.setY(monster_2.getY()-1);
		    }
		}
	}

}
