package drawingpackage;
import java.util.LinkedList;

import csci348.drawings.Drawing;

/**
 * 
 * @author petriccione
 *  How do you want them to interact with this code, what are you going to expose,
 *  and which methods will be public
 */


public class DrawProgram {
	
////
//	public void drawHorizontalLine(int startX, int startY, int endX) {
//		int length = endX - startX;
//		for (int i = startX; i <= endX; i++) {
//			myDrawing.showPoint(i, startY);
//		}
//	}//drawHorizontalLine
//	
//	public void drawVerticalLine(int startY, int startX, int endY) {
//		for (int i = startY; i <= endY; i++) {
//			myDrawing.showPoint(startX, i);
//		}
//	}//drawHorizontalLine
//	
//	public void drawSquare(int startX, int startY, int size) {
//		drawHorizontalLine(startX, startY, startX+size);
//		drawHorizontalLine(startX, startY+size, startX+size);
//		drawVerticalLine(startY, startX, startY+size);
//		drawVerticalLine(startY, startX+size, startY+size);
//		
//	}
	
	public void makeBox(int startX, int startY, int size) {
    	
    }
    	
	public void connectBoxes() {
		LinkedList diagram = new LinkedList();
	}
	
	/**
	 * MAIN METHOD!!
	 * @param args
	 */
	public static void main(String[] args) {
		Drawing myDrawing = new Drawing();
		DrawProgram draw = new DrawProgram();
		//draw.drawVerticalLine(50, 10, 550);
		//draw.drawSquare(50, 50, 150);
		HorizontalLine hLine1 = new HorizontalLine(5, 5, 55, 55);
		hLine1.draw(myDrawing);
		
	}//main

}//DrawProgram class
