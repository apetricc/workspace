package drawings2;

import csci348.drawings.SimpleDrawing;
import drawings2.SimpleDrawProgram;

public class Triangle extends Shape{
	
	private int startX;
	private int startY;
	private int height;
	private int width;
	
	public Triangle(int startX, int startY, int height, int width, DrawingPalette palette) {
		super(palette);
		this.startX = startX;
		this.startY = startY;
		this.height = height;
		this.width = width;
	}

//
	/**
	 * drawUpTriangle draws a Triangle object pointing upwards on the SimpleDrawing window
	 * @param palette the SimpleDrawing where the Triangle will be drawn
	 * @param draw
	 */
	public void draw(DrawingPalette palette, String modifier) {
		int aX = startX;
		int aY = startY;
		int bX = startX;
		int bY = startY;
		int cX = startX;
		int cY = startY;
		if (modifier.equalsIgnoreCase("down")) {
			bX = startX + width / 2;
			bY = startY + height;
			cX = startX + width;
			cY = startY;		
		} // down
		if (modifier.toLowerCase() == "left") {
			bX = startX - width;
			bY = startY - height / 2;
			cX = startX;
			cY = startY - height;
		} // left
		if (modifier.toLowerCase() == "right") {
			bX = startX + width;
			bY = startY - height / 2;
			cX = startX;
			cY = startY - height;
		} // right
		if (modifier.equalsIgnoreCase("up") || modifier.isEmpty()){
			bX = startX + width / 2;
			bY = startY - height;
			cX = startX + width;
			cY = startY;
		} // up
		Line line1 = new Line(aX, aY, bX, bY, palette);
		Line line2 = new Line(bX, bY, cX, cY, palette);
		Line line3 = new Line(aX, aY, cX, cY, palette);
		line1.draw(palette, modifier);
		line2.draw(palette, modifier);
		line3.draw(palette, modifier);
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
}// Triangle
