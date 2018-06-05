package showboard;

import java.awt.Image;

public class Monster_3 extends Pawn{
	
	private Monster_3 monster_3;
	
	public Monster_3(Image image, boolean solid) {
		super(image, solid);
		// TODO Auto-generated constructor stub
	}

	public void move() {
		while(monster_3.isAlive()) {
			
		for(int i= 0; i<2; i++) {
			monster_3.setX(monster_3.getX()+1);
		    }
		for(int j= 0; j<2; j++) {
			monster_3.setY(monster_3.getY()+1);
		    }
		for(int k= 0; k<2; k++) {
			monster_3.setX(monster_3.getX()-1);
		    }
		for(int l= 0; l<2; l++) {
			monster_3.setY(monster_3.getY()-1);
		    }
		}
	}
}
