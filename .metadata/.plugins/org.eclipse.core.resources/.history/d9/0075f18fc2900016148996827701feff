package drawings2;

import java.util.ArrayList;

import csci348.drawings.SimpleDrawing;
import java.awt.event.*;
import java.awt.*;

public class DrawingPalette extends SimpleDrawing{

	ArrayList<Shape> shapes = new ArrayList<Shape>();

	//only really need mouse click and if resized
	
	
	
	public DrawingPalette(int width, int height) {
		super();
		this.shapes = shapes;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e != null)
			System.out.println("The mouse is at: " + e.getPoint());
			int x = e.getX();
			int y = e.getY();
			int startX;
			int endX;
			int startY;
			int endY;
			for (int i = 0; i < shapes.size(); i++) {
				startX = shapes.get(i).getStartX();
				endX = shapes.get(i).getEndX();
				startY = shapes.get(i).getStartY();
				endY = shapes.get(i).getEndY();
				if ((x > startX && x < endX )&&(y < startY && y > endY))  {
					System.out.println("Clicked inside a shape!  Should be erasing right now! \n\n ");
					System.out.println("startX: " + startX + " \n"
							+ "startY: " + startY + "\n"
							+ " endX: " + endX + " \n"									
											+ "endY: " + endY);
					System.out.println("The click that registered to erase was: " + e.getPoint());
					shapes.get(i).erase(this);
				}
			}
	}

	public void componentResized(java.awt.event.ComponentEvent event, DrawingPalette palette, String modifier) {
		if (event!=null) shapes.get(shapes.indexOf(this)).draw(palette, modifier);
	}
	
	public void eraseLast() {
		if (!(shapes.isEmpty())) {
			try {
				(shapes.get(shapes.size() - 1)).erase(this);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else
			System.out.println("Diagram array list is empty--no boxes to erase.");
	}

}