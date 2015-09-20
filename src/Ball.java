import java.awt.Graphics;
import java.awt.Rectangle;

public class Ball extends Rectangle {
	
	public double x;
	public double y;
	
	public int width;
	public int height;
	
	double ballspeedX;
	double ballspeedY;
	
	Direction directionHorizontal;
	Direction directionVertical;
	
	public Ball(int x, int y, int width, int height, double ballspeedX, double ballspeedY, Direction horizontal, Direction vertical) {
		
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
		g.fillOval((int) x, (int) y, width, height);
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
	
	public void changeDirection(String collision) {
		
		if (collision.equals("player")) {
			
			setDirection("horizontal", getOppositeDirection(getDirectionHorizontal()));
			
		}
		
		else if (collision.equals("wall")) {
			
			setDirection("vertical", getOppositeDirection(getDirectionVertical()));
			
		}
		
	}
	
	public void setDirection (String axis, Direction newdir) {
		
		switch (axis) {
		case "horizontal": directionHorizontal = newdir; break;
		case "vertical": directionVertical = newdir; break;
		}
		
	}
	
	public Direction getOppositeDirection(Direction dir) {
		switch (dir) {
		
		case UP: return Direction.DOWN;
		case DOWN: return Direction.UP;
		case LEFT: return Direction.RIGHT;
		case RIGHT: return Direction.LEFT;
				
		}
		
		return null;
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
