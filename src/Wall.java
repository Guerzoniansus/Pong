import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class Wall extends Rectangle {
	
	int x;
	int y;
	int width;
	int height;
	
	Image sprite;
	
	public Wall(int x, int y, int width, int height, Image sprite) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		
		this.sprite = sprite;
	}
	
	public void draw(Graphics g) {
		g.drawImage(sprite, x, y, null);
	}
	

}
