package drawings2;

import java.util.ArrayList;
import java.util.Scanner;

import csci348.drawings.Drawing;
import csci348.drawings.SimpleDrawing;

import java.awt.*;
import java.awt.event.*;





/**
 * CSCI 373 Fall 2016 Dr. Sheaffer Project 2
 * @author Andrew Petriccione
 * @contributions Had design discussions with Dr. Sheaffer, Kevin D., & Carole S.
 */

public class SimpleDrawProgram {


	
//	public static void eraseLast(DrawingPalette palette) {
//		if (!palette.shapes.isEmpty()) {
//			try {
//				(palette.shapes.get(palette.shapes.size() - 1)).erase(palette);
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		} else
//			System.out.println("Diagram array list is empty--no boxes to erase.");
//	}
	
	
	public void testSize(SimpleDrawing palette) {
		
		
	}

		
	/**
	 * MAIN METHOD!!
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
		//SimpleDrawProgram page = new SimpleDrawProgram();
		//SimpleDrawing palette = new SimpleDrawing(800,800);
		System.out.println("Draw some stuff: ");
		DrawingPalette palette = new DrawingPalette(600, 600);
		//SimpleDrawing palette2 = new SimpleDrawing(800,800);
		Box testBox = new Box(150, 150, 75, 100, palette);
//		scan.nextLine();
		testBox.draw(palette);
     	System.out.println("Shapes array list is equal to: " + palette.shapes.size());
     	//Triangle newTri = new Triangle(300,300,25,25,palette);
     	Box box2 = new Box(300, 300, 35, 35, palette);
     	
//		scan.nextLine();
		box2.draw(palette);
//     	newTri.drawUpTriangle(palette);
     	System.out.println("Shapes array list is equal to: " + palette.shapes.size());
//     	Arrow newArrow = new Arrow(300, 300, 450, 150, palette);
//		scan.nextLine();
//     	newArrow.draw(palette);
     	System.out.println("The shapes array list is now:   " + palette.shapes.size() + "    with the addition of the arrow? \n"
     			+" Because the line and the triangle are each being counted...\n"
     			+ " \nNow erase some stuff");
//		scan.nextLine();
		
		//System.out.println("Press enter to draw box.");
		//scan.nextLine();
//		testBox.draw(draw, page);
	//	System.out.println("Press enter to erase box.");
	//	testBox.erase(draw, page);
	//	System.out.println("Press enter to draw box outside normal window.");
	//	Box testBox2 = new Box(800, 800, 25 ,90);
	//	testBox2.draw(draw, page);
		
		//public Line(int startX, int startY, int endX, int endY) 
		Line newLine = new Line(300, 300,750, 250, palette);
		newLine.draw(palette);
//		scan.nextLine();
		palette.eraseLast();
//		Line newLine1 = new Line(300, 300,150, 450);
//		newLine1.draw(draw);
//		Line newLine2 = new Line(300, 300,450, 150);
//		newLine2.draw(draw);
//		Line newLine3 = new Line(300, 300, 150, 150);
//		newLine3.draw(draw);
//		Diamond.makeDiamond(600, 600, 75, 25).drawVertical(draw);
//		
//		
//		Parallelogram testP = new Parallelogram(100,100,50,25);
//		testP.draw(palette);
//	Diamond.makeDiamond(450,450, 55,55).drawVertical(draw);
//		
//		Triangle newTriangle = new Triangle(300, 300, 50,75 );
//		newTriangle.drawUpTriangle(palette);
//		newTriangle.drawDownTriangle(palette);
//		Triangle smallTriangle = new Triangle(450, 450, 25, 25);
//		smallTriangle.drawDownTriangle(palette);
//		Triangle wideTri= new Triangle(150, 150, 25, 75);
//		wideTri.drawUpTriangle(palette);
//		Triangle tallTri = new Triangle(450, 150, 75, 25);
//		tallTri.drawUpTriangle(palette);
//		
//		Arrow newArrow = new Arrow(100, 400, 100, 250);
//		newArrow.draw(palette);
//		Arrow arrow1 = new Arrow(300, 300, 250, 300);
//		arrow1.draw(palette);
//		
//		Arrow upArrow = new Arrow(300, 300, 300, 250);
//		upArrow.draw(palette);
//		
//		Arrow downArrow = new Arrow(300, 300, 300, 450);
//		downArrow.draw(palette);
//		
//		Arrow rightArrow = new Arrow(300, 300, 400, 300);
//		rightArrow.draw(palette);
//		
		
		
//		Circle newCircle = new Circle(400, 400, 20);
//		newCircle.drawCircle(myDrawing);
//		Triangle triangle = new Triangle(300, 300, 50, 50);
//		triangle.draw(myDrawing, draw);
//		
	
	
	}// main

	
}// DrawProgram class
