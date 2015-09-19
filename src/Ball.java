import java.awt.Graphics;
import java.awt.Rectangle;

public class Ball extends Rectangle {
	
	public int x;
	public int y;
	
	public int width;
	public int height;
	
	int ballspeedX;
	int ballspeedY;
	
	Direction directionHorizontal;
	Direction directionVertical;
	
	public Ball(int x, int y, int width, int height, int ballspeedX, int ballspeedY, Direction horizontal, Direction vertical) {
		
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.ballspeedX = ballspeedX;
		this.ballspeedY = ballspeedY;
		this.directionHorizontal = horizontal;
		this.directionVertical = vertical;
		
	}
	
	public void draw(Graphics g) {
		g.fillOval(x, y, width, height);
	}
	
	public void updatePosition() {
		switch (directionHorizontal) {
		case LEFT: x = x - ballspeedX; break;
		case RIGHT: x = x + ballspeedX; break;
		}
		
		switch (directionVertical) {
		case UP: y = y - ballspeedY; break;
		case DOWN: y = y + ballspeedY; break;
		}
	}
	
	public Direction getDirectionHorizontal() {
		return directionHorizontal;
	}
	
	public Direction getDirectionVertical() {
		return directionVertical;
	}
	
	public void setDirectionHorizontal(Direction dir) {
		directionHorizontal = dir;
	}
	
	public void setDirectionVertical(Direction dir) {
		directionVertical = dir;
	}
	

}
