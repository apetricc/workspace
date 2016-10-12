package drawings2;

import csci348.drawings.SimpleDrawing;
import java.awt.event.MouseListener;

public class Diamond extends Shape{
	private int startX;
	private int startY;
	private int height;
	private int width;

	private Diamond(int startX, int startY, int width, int height, DrawingPalette palette) {
		super(palette);
		this.startX = startX;
		this.startY = startY;
		this.width = width;
		this.height = height;
	}

	public static Diamond makeDiamond( int x, int y, int width, int height, DrawingPalette palette) {
		return new Diamond(x, y, width, height, palette);
	}
	
	public void draw(DrawingPalette  palette, String modifier) {
		int aX = startX;
		int aY = startY;
		int bX = startX + width/2;
		int bY = startY - height/2;
		int cX = startX;
		int cY = startY - height;
		int dX = startX - width/2;
		int dY = startY - height/2;
		Line line1 = new Line(aX, aY, bX, bY, palette);
		Line line2 = new Line(cX, cY, bX, bY, palette);
		Line line3 = new Line(dX, dY, cX, cY, palette);
		Line line4 = new Line(dX, dY, aX, aY, palette);
		line1.draw(palette, modifier);
		line2.draw(palette, modifier);
		line3.draw(palette, modifier);
		line4.draw(palette, modifier);
	}
	
	public void erase(DrawingPalette palette) {
		
		
	}
	
	public int getStartX() {
		return startX;
	}
	public int getEndX() {
		return startX + width;
	}
	public int getStartY() {
		return startY;
	}
	public int getEndY() {
		return startY - height;
	}
}
