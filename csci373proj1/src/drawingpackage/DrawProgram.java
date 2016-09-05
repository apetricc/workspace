package drawingpackage;
import java.util.ArrayList;
import java.util.LinkedList;

import csci348.drawings.Drawing;

/**
 * 
 * @author andrew petriccione 
 * @contributions from Dr. Sheaffer, Kevin D., & Carole S.
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
		//hLine1.draw(myDrawing);
		VerticalLine vLine1 = new VerticalLine(150, 150, 150, 600);
		//vLine1.draw(myDrawing);
//		Line testLine = new Line(10, 10, 50, 350);
//		testLine.draw(myDrawing);
		Line testLine2 = new Line(100, 100, 550, 210);
		//testLine2.draw(myDrawing);
		myDrawing.showPoint(50, 350);
		//public HorizontalLine(int startX, int startY, int endX, int endY)
		
		//******************************
		Box testBox = new Box(100, 100, 50, 20);
		testBox.draw(myDrawing);
		//******************************
		Box testBox5 = new Box(200, 10, 25, 25);
		testBox5.draw(myDrawing);
		testBox.connectBoxes(testBox5, myDrawing);
		Box testBox6 = new Box(10, 10, 20, 40);
		testBox6.draw(myDrawing);
		testBox.connectBoxes(testBox6, myDrawing);
		Box testBox7 = new Box(10, 200, 25, 25);
		testBox7.draw(myDrawing);
		testBox.connectBoxes(testBox7, myDrawing);
		Box testBox2 = new Box(200, 100, 50, 20);
		testBox2.draw(myDrawing);
		testBox.connectBoxes(testBox2,myDrawing);
		Box testBox3 = new Box(100, 300, 50, 20);
		testBox3.draw(myDrawing);
		testBox.connectBoxes(testBox3, myDrawing);
		Box testBox4 = new Box(100, 10, 50, 20);
		testBox4.draw(myDrawing);
		testBox.connectBoxes(testBox4, myDrawing);
		Box anotherBox = new Box(10, 100, 25, 25);
		anotherBox.draw(myDrawing);
		testBox.connectBoxes(anotherBox, myDrawing);
		testBox.connectBoxes(anotherBox, myDrawing);
//		HorizontalLine drawLeft = new HorizontalLine(550, 350, 10, 350);
//		drawLeft.draw(myDrawing);
		VerticalLine drawUp = new VerticalLine(125, 100, 125, 30);
		drawUp.draw(myDrawing);
		Box downRight = new Box(200, 300, 25,25);
		downRight.draw(myDrawing);
		testBox.connectBoxes(downRight, myDrawing);
		
		Line angleUp = new Line(300, 30, 500, 600);
		angleUp.draw(myDrawing);
		testBox2.erase(myDrawing);
		testBox3.eraseBox(myDrawing);
	}//main

}//DrawProgram class
