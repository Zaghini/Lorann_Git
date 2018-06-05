package showboard;

import java.awt.Image;

public class Monster_4 extends Pawn{
	
	private Monster_4 monster_4;
	
	public Monster_4(Image image, boolean solid) {
		super(image, solid);
		// TODO Auto-generated constructor stub
	}
	
	public void move() {
		while(monster_4.isAlive()) {
			
		for(int i= 0; i<3; i++) {
			monster_4.setX(monster_4.getX()+1);
		    }
		for(int k= 0; k<3; k++) {
			monster_4.setX(monster_4.getX()-1);
		    }
		for(int l= 0; l<3; l++) {
			monster_4.setY(monster_4.getY()-1);
		    }
		for(int j= 0; j<3; j++) {
			monster_4.setY(monster_4.getY()+1);
		    }
		}
	}

}
