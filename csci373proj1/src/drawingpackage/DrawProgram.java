package drawingpackage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import csci348.drawings.Drawing;

/**
 * 
 * @author andrew petriccione
 * @contributions had design discussions with Dr. Sheaffer, Kevin D., & Carole S. 
 */

public class DrawProgram {
	
	ArrayList diagram = new ArrayList<Box>();
	
	public void eraseLast(Drawing draw)  {
		if (!diagram.isEmpty()) {
			try {
				((Box) diagram.get(diagram.size() - 1)).erase(draw, this);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else System.out.println("Diagram array list is empty--no boxes to erase.");
	}
	
	
	/**
	 * MAIN METHOD!!
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Drawing myDrawing = new Drawing();
		DrawProgram draw = new DrawProgram();
		// ******************************
		Box testBox = new Box(100, 100, 50, 20);
		System.out.println("Press enter to draw.");
		scan.nextLine();
		testBox.draw(myDrawing, draw);
		// ******************************
		Box testBox5 = new Box(200, 10, 25, 25);
		System.out.println("Press enter to draw.");
		scan.nextLine();
		testBox5.draw(myDrawing, draw);
		testBox.connectBoxes(testBox5, myDrawing);
		Box testBox6 = new Box(10, 10, 20, 40);
		System.out.println("Press enter to draw.");
		scan.nextLine();
		testBox6.draw(myDrawing, draw);
		testBox.connectBoxes(testBox6, myDrawing);
		Box testBox7 = new Box(10, 200, 25, 25);
		System.out.println("Press enter to draw.");
		scan.nextLine();
		testBox7.draw(myDrawing, draw);
		testBox.connectBoxes(testBox7, myDrawing);
		Box testBox2 = new Box(200, 100, 50, 20);
		System.out.println("Press enter to draw.");
		scan.nextLine();
		testBox2.draw(myDrawing, draw);
		testBox.connectBoxes(testBox2, myDrawing);
		Box testBox3 = new Box(100, 300, 50, 20);
		System.out.println("Press enter to draw.");
		scan.nextLine();
		testBox3.draw(myDrawing, draw);
		testBox.connectBoxes(testBox3, myDrawing);
		Box testBox4 = new Box(100, 10, 50, 20);
		System.out.println("Press enter to draw.");
		scan.nextLine();
		testBox4.draw(myDrawing, draw);
		testBox.connectBoxes(testBox4, myDrawing);
		Box anotherBox = new Box(10, 100, 25, 25);
		System.out.println("Press enter to draw.");
		scan.nextLine();
		anotherBox.draw(myDrawing, draw);
		testBox.connectBoxes(anotherBox, myDrawing);
		testBox.connectBoxes(anotherBox, myDrawing);
//		VerticalLine drawUp = new VerticalLine(125, 100, 125, 30);
//		drawUp.draw(myDrawing);
		Box downRight = new Box(200, 300, 25, 25);
		System.out.println("Press enter to draw.");
		scan.nextLine();
		downRight.draw(myDrawing, draw);
		testBox.connectBoxes(downRight, myDrawing);

//		Line angleUp = new Line(300, 30, 500, 600);
//		angleUp.draw(myDrawing);
//		testBox2.erase(myDrawing);
		System.out.println("Press enter to erase.");
		scan.nextLine();
		testBox.erase(myDrawing, draw);
		System.out.println("Press enter to erase.");
		scan.nextLine();
		testBox3.erase(myDrawing, draw);
		System.out.println("Press enter to erase.");
		scan.nextLine();
		downRight.erase(myDrawing, draw);
		System.out.println("Press enter to erase the last box drawn.");
		scan.nextLine();
		draw.eraseLast(myDrawing);
		System.out.println("The diagram array list is this long: "+draw.diagram.size());
    	//
	}// main

}// DrawProgram class
