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
/**
 * why don't I just hide a 10*10 area around where the mouse is clicked??  Spot erase.
 */
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
				if ((x > startX && x < endX )&&((y < startY && y > endY) || (y > startY && y < endY)))  {
					System.out.println("The array list shapes was this long: " + shapes.size());
					System.out.println("\n\nClicked inside a shape!  Should be erasing right now! ");
					System.out.println("startX: " + startX + " \n"
							+ "startY: " + startY + "\n"
							+ " endX: " + endX + " \n"									
											+ "endY: " + endY);
					System.out.println("The click that registered to erase was: " + e.getPoint());
					shapes.get(i).erase(this);
					shapes.remove(this);
					System.out.println("The array list shapes is now this long: " + shapes.size());

				}
			}
	}
	
	public void componentResized(ComponentEvent event, DrawingPalette palette) {
		if (event!=null) {
			System.out.println("Window resized, should be redrawing window from linked list now...");
			shapes.get(shapes.indexOf(this)).draw(palette, "");
		}
	}//componentResized
	
//	public void setForegroundColor(java.awt.Color color) {
//		setForegroundColor(color);
//	}
	
}