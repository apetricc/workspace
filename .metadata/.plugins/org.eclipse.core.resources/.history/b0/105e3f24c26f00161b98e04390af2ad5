package drawingpackage;
import csci348.drawings.Drawing;
public class DrawProgram {
	private Drawing myDrawing = new Drawing();
//Drawing myDrawing	
	public void drawHorizontalLine(int startX, int startY, int endX) {
		int length = endX - startX;
		for (int i = startX; i <= endX; i++) {
			myDrawing.showPoint(i, startY);
		}
	}//drawHorizontalLine
	
	public void drawVerticalLine(int startY, int startX, int endY) {
		for (int i = startY; i <= endY; i++) {
			myDrawing.showPoint(startX, i);
		}
	}//drawHorizontalLine
	
	public void drawSquare(int startX, int startY, int size) {
		drawHorizontalLine(startX, startY, startX+size);
		drawHorizontalLine(startX, startY+size, startX+size);
		drawVerticalLine(startY, startX, startY+size);
		drawVerticalLine(startY, startX+size, startY+size);
		
	}
		
	/**
	 * MAIN METHOD!!
	 * @param args
	 */
	public static void main(String[] args) {
		DrawProgram draw = new DrawProgram();
		draw.drawVerticalLine(50, 10, 550);
		draw.drawSquare(50, 50, 150);
	}//main

}//DrawProgram class
