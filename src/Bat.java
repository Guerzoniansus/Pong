import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class Bat extends Rectangle {

	Image sprite;
	Game game;

	int x;
	double y;
	int width;
	int height;

	public Bat(int x, int y, int width, int height, Image sprite, Game game) {

		this.game = game;
		this.sprite = sprite;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.setBounds(x, y, width, height);

	}

	public void draw(Graphics g) {

		g.drawImage(sprite, x, (int) Math.round(y), null);

	}

	public void updatePosition(double newy) {

		this.y = newy;
		
		if (y > game.roomHeight - sprite.getHeight(null) - game.img_wall.getHeight(null) - 13) {
			y = game.roomHeight - sprite.getHeight(null) - game.img_wall.getHeight(null) - 13;
		}
		
		this.setLocation(x, (int) y);

	}
	
	public Image getSprite() {
		return sprite;
	}

}
