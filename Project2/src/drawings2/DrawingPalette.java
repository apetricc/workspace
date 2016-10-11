package drawings2;

import java.util.ArrayList;

import csci348.drawings.SimpleDrawing;
import java.awt.event.*;
import java.awt.*;

public class DrawingPalette extends SimpleDrawing {

	ArrayList<Shape> shapes = new ArrayList<Shape>();

	public DrawingPalette(int width, int height) {
		super();
		this.shapes = shapes;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e != null)
			System.out.println("The mouse is at: " + e.getPoint());
	}

	@Override
	public void componentResized(java.awt.event.ComponentEvent event) {
		if (event!=null) System.out.println("The window was resized");
	}
}