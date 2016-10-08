package drawings2;

import java.util.ArrayList;
import java.util.Scanner;

import csci348.drawings.Drawing;
import csci348.drawings.SimpleDrawing;

/**
 * CSCI 373 Fall 2016 Dr. Sheaffer Project 1
 * @author Andrew Petriccione
 * @contributions Had design discussions with Dr. Sheaffer, Kevin D., & Carole S.
 */

public class SimpleDrawProgram {

	ArrayList<Box> diagram = new ArrayList<Box>();

	public void eraseLast(SimpleDrawing draw) {
		if (!diagram.isEmpty()) {
			try {
				((Box) diagram.get(diagram.size() - 1)).erase(draw, this);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else
			System.out.println("Diagram array list is empty--no boxes to erase.");
	}

	/**
	 * MAIN METHOD!!
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		SimpleDrawing palette = new SimpleDrawing();
		SimpleDrawProgram draw = new SimpleDrawProgram();
	
		
		
		
		
		
		
		
//		DiagonalLine line1 = new DiagonalLine(300, 300, 450, 450);
//		line1.drawBres(myDrawing);
//		DiagonalLine line2 = new DiagonalLine(300, 300, 450, 150);
//		line2.drawBres(myDrawing);
//		DiagonalLine line3 = new DiagonalLine(300, 300, 150, 150);
//		line3.drawBres(myDrawing);
//		DiagonalLine line4 = new DiagonalLine(300, 300, 150, 450);
//		line4.drawBres(myDrawing);
//		DiagonalLine line5= new DiagonalLine(300, 300, 350, 150);
//		line5.drawBres(myDrawing);
//		
//		Box testBox = new Box(400, 400, 75, 100);
//		System.out.println("Press enter to draw box.");
//		scan.nextLine();
//		testBox.draw(myDrawing, draw);
//		System.out.println("Press enter to erase box.");
//		scan.nextLine();
//		testBox.erase(myDrawing, draw);
//		System.out.println("Press enter to draw box outside normal window.");
//		scan.nextLine();
//		Box testBox2 = new Box(800, 800, 25 ,90);
//		testBox2.draw(myDrawing, draw);
		
		//	public Line(int startX, int startY, int endX, int endY) 
		Triangle newTriangle = new Triangle(300, 300, 50,75 );
		newTriangle.drawUpTriangle(palette);
		newTriangle.drawDownTriangle(palette);
		Triangle smallTriangle = new Triangle(450, 450, 25, 25);
		smallTriangle.drawDownTriangle(palette);
		Triangle wideTri= new Triangle(150, 150, 25, 75);
		wideTri.drawUpTriangle(palette);
		Triangle tallTri = new Triangle(450, 150, 75, 25);
		tallTri.drawUpTriangle(palette);
		
		Arrow newArrow = new Arrow(100, 400, 100, 250);
		newArrow.draw(palette);
		Arrow arrow1 = new Arrow(300, 300, 250, 300);
		arrow1.draw(palette);
		
		Arrow upArrow = new Arrow(300, 300, 300, 250);
		upArrow.draw(palette);
		
		Arrow downArrow = new Arrow(300, 300, 300, 450);
		downArrow.draw(palette);
		
		Arrow rightArrow = new Arrow(300, 300, 400, 300);
		rightArrow.draw(palette);
		
		
		
//		Circle newCircle = new Circle(400, 400, 20);
//		newCircle.drawCircle(myDrawing);
//		Triangle triangle = new Triangle(300, 300, 50, 50);
//		triangle.draw(myDrawing, draw);
//		
		
	}// main

}// DrawProgram class
