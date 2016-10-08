package drawings2;

import csci348.drawings.SimpleDrawing;
import drawings2.SimpleDrawProgram;

public class Triangle extends SimpleDrawProgram{
	
	private int startX;
	private int startY;
	private int height;
	private int width;
	
	public Triangle(int startX, int startY, int height, int width) {
		this.startX = startX;
		this.startY = startY;
		this.height = height;
		this.width = width;
	}
/*
 * //	public Line(int startX, int startY, int endX, int endY) 
		Triangle newTriangle = new Triangle(300, 300, 50,75 );
 */
	public void drawDownTriangle(SimpleDrawing palette) {
		int aX = startX;
		int aY = startY;
		int bX = startX + width/2;
		int bY = startY + height;
		int cX = startX + width;
		int cY = startY;
		Line line1 = new Line(aX, aY, bX, bY);
		Line line2 = new Line(bX, bY, cX, cY);
		Line line3 = new Line(aX, aY, cX, cY);
		line1.drawBres(palette);
		line2.drawBres(palette);
		line3.drawBres(palette);
	}// drawDownTriangle

	/**
	 * drawUpTriangle draws a Triangle object pointing upwards on the SimpleDrawing window
	 * @param palette the SimpleDrawing where the Triangle will be drawn
	 * @param draw
	 */
	public void drawUpTriangle(SimpleDrawing palette) {
		int aX = startX;
		int aY = startY;
		int bX = startX + width/2;
		int bY = startY - height;
		int cX = startX + width;
		int cY = startY;
		Line line1 = new Line(aX, aY, bX, bY);
		Line line2 = new Line(bX, bY, cX, cY);
		Line line3 = new Line(aX, aY, cX, cY);
		line1.drawBres(palette);
		line2.drawBres(palette);
		line3.drawBres(palette);
	}// drawUpTriangle
	
	public void drawLeft(SimpleDrawing palette) {
		int aX = startX;
		int aY = startY;
		int bX = startX - width;
		int bY = startY - height/2;
		int cX = startX;
		int cY = startY - height;
		Line line1 = new Line(aX, aY, bX, bY);
		Line line2 = new Line(bX, bY, cX, cY);
		Line line3 = new Line(aX, aY, cX, cY);
		line1.drawBres(palette);
		line2.drawBres(palette);
		line3.drawBres(palette);
	}
	public void drawRight(SimpleDrawing palette) {
		int aX = startX;
		int aY = startY;
		int bX = startX + width;
		int bY = startY - height/2;
		int cX = startX;
		int cY = startY - height;
		Line line1 = new Line(aX, aY, bX, bY);
		Line line2 = new Line(bX, bY, cX, cY);
		Line line3 = new Line(aX, aY, cX, cY);
		line1.drawBres(palette);
		line2.drawBres(palette);
		line3.drawBres(palette);
	}
}
