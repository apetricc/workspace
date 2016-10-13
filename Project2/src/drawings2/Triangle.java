package drawings2;

import csci348.drawings.SimpleDrawing;
import drawings2.SimpleDrawProgram;

public class Triangle extends Shape{
	
	int startX;
	int startY;
	int height;
	int width;
	Line line1;
	Line line2;
	Line line3;
	int endY;
	
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
			//y coordinates off when drawn down for some reason
			setEndY(startY - height);
		} // down
		if (modifier.equalsIgnoreCase("left")) {
			bX = startX - width;
			bY = startY - height / 2;
			cX = startX;
			cY = startY - height;
			endY = startY - height;
		} // left
		if (modifier.equalsIgnoreCase("right")) {
			bX = startX + width;
			bY = startY - height / 2;
			cX = startX;
			cY = startY - height;
			endY = startY - height;
		} // right
		if (modifier.equalsIgnoreCase("up") || modifier.isEmpty()){
			bX = startX + width / 2;
			bY = startY - height;
			cX = startX + width;
			cY = startY;
			endY = startY - height;
		} // up
		System.out.println("after the control flow in triangle, startY is: " + startY + " and endY is : " + endY);
		line1 = new Line(aX, aY, bX, bY, palette);
		line2 = new Line(bX, bY, cX, cY, palette);
		line3 = new Line(cX, cY, aX, aY, palette);
		line1.draw(palette, modifier);
		line2.draw(palette, modifier);
		line3.draw(palette, modifier);
	}

	public void erase(DrawingPalette palette) {
//		palette.shapes.remove(this);
		line1.erase(palette);
		line2.erase(palette);
		line3.erase(palette);
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
		return endY;
	}
	public void setEndY(int newY) {
		endY = newY;
	}
	}// Triangle
