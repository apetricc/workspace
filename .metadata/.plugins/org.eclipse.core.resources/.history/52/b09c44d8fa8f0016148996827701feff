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
/*
 * //	public Line(int startX, int startY, int endX, int endY) 
		Triangle newTriangle = new Triangle(300, 300, 50,75 );
 */
	public void drawDownTriangle(DrawingPalette  palette) {
		int aX = startX;
		int aY = startY;
		int bX = startX + width/2;
		int bY = startY + height;
		int cX = startX + width;
		int cY = startY;
		Line line1 = new Line(aX, aY, bX, bY);
		Line line2 = new Line(bX, bY, cX, cY);
		Line line3 = new Line(aX, aY, cX, cY);
		line1.draw(palette);
		line2.draw(palette);
		line3.draw(palette);
		//palette.shapes.add(this);
	}// drawDownTriangle

	/**
	 * drawUpTriangle draws a Triangle object pointing upwards on the SimpleDrawing window
	 * @param palette the SimpleDrawing where the Triangle will be drawn
	 * @param draw
	 */
	public void drawUpTriangle(DrawingPalette  palette) {
		int aX = startX;
		int aY = startY;
		int bX = startX + width/2;
		int bY = startY - height;
		int cX = startX + width;
		int cY = startY;
		Line line1 = new Line(aX, aY, bX, bY);
		Line line2 = new Line(bX, bY, cX, cY);
		Line line3 = new Line(aX, aY, cX, cY);
		line1.draw(palette);
		line2.draw(palette);
		line3.draw(palette);
	}// drawUpTriangle
	
	public void drawLeft(DrawingPalette palette) {
		int aX = startX;
		int aY = startY;
		int bX = startX - width;
		int bY = startY - height/2;
		int cX = startX;
		int cY = startY - height;
		Line line1 = new Line(aX, aY, bX, bY);
		Line line2 = new Line(bX, bY, cX, cY);
		Line line3 = new Line(aX, aY, cX, cY);
		line1.draw(palette);
		line2.draw(palette);
		line3.draw(palette);
	}
	public void drawRight(DrawingPalette palette) {
		int aX = startX;
		int aY = startY;
		int bX = startX + width;
		int bY = startY - height/2;
		int cX = startX;
		int cY = startY - height;
		Line line1 = new Line(aX, aY, bX, bY);
		Line line2 = new Line(bX, bY, cX, cY);
		Line line3 = new Line(aX, aY, cX, cY);
		line1.draw(palette);
		line2.draw(palette);
		line3.draw(palette);
	}
}
