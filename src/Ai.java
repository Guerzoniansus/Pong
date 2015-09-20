import java.awt.Image;

public class Ai extends Bat {

	public Ai(int x, int y, int width, int height, Image sprite, Game game) {
		
		super(x, y, width, height, sprite, game);
	}
	
	public void updatePosition() {
		
		y = (int) game.getBall().y - (sprite.getHeight(null) / 2);
		
		this.setLocation(x, (int) y);		
	}

}
