package drawings2;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * CSCI 373 Fall 2016 Dr. Sheaffer Project 2
 *
 * @author Andrew Petriccione
 * @contributions Had design discussions with Dr. Sheaffer, Kevin D., & Carole S.
 */

public class SimpleDrawProgram {


    /**
     * MAIN METHOD!!
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Draw some stuff: ");
        DrawingPalette palette = new DrawingPalette(600, 600);
        Box testBox = new Box(600, 600, 75, -100, palette);
        testBox.draw(palette);
        palette.addShape(testBox);
        Box box2 = new Box(100, 160, 50, -50, palette);
        box2.draw(palette);
        palette.addShape(box2);
        Connector connect = new Connector(testBox, box2, palette);
        connect.draw(palette);
        palette.addShape(connect);

        Line line = new Line(400, 400, 550, 400, palette);
        line.draw(palette);
        palette.addShape(line);
        Arrow testArrow = new Arrow(300, 300, 150, 300, palette);
        testArrow.draw(palette);
        palette.addShape(testArrow);
//
//
//        Diamond d = new Diamond(300, 300, 50, 50, palette);
//        d.draw(palette);
//        palette.addShape(d);
//        System.out.println(d.getShape());
//        palette.setBackgroundColor(Color.BLACK);
//        palette.setForegroundColor(Color.RED);
//        System.out.println(palette.shapes.toString());
//        palette.showPoint(300, 300);
//
//        Triangle newTri = new Triangle(350, 175, 10, 12, palette, "left");
//        newTri.draw(palette);
//        palette.addShape(newTri);
//
//        Triangle upTri = new Triangle(150, 150, 22, -22, palette, "up");
//        upTri.draw(palette);
//        palette.addShape(upTri);
//        Triangle downTri = new Triangle(400, 150, 22, 22, palette, "down");
//        downTri.draw(palette);
//        palette.addShape(downTri);
//        Arrow leftArrow = new Arrow(200, 200, 100, 200, palette);
//        leftArrow.draw(palette);
//        palette.addShape(leftArrow);
//        Arrow rightArrow = new Arrow(400, 100, 500, 100, palette);
//        rightArrow.draw(palette);
//        palette.addShape(rightArrow);
//        Arrow downArrow = new Arrow(400, 400, 400, 500, palette);
//        downArrow.draw(palette);
//        palette.addShape(downArrow);
//        Arrow upArrow = new Arrow(200, 200, 200, 150, palette);
//        upArrow.draw(palette);
//        palette.addShape(upArrow);
//        Circle cir = new Circle(600, 600, 50, palette);
//        cir.draw(palette);
//        palette.addShape(cir);


    }// main


}// DrawProgram class

