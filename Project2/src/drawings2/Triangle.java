package drawings2;

import csci348.drawings.SimpleDrawing;
import drawings2.SimpleDrawProgram;
import drawings2.HorizontalLine;
import drawings2.VerticalLine;

public class Triangle extends SimpleDrawProgram{
	
	private int startX;
	private int startY;
	private int height;
	private int width;
	private int endX;
	private int endY;
	
	public Triangle(int startX, int startY, int height, int width) {
		this.startX = startX;
		this.startY = startY;
		this.height = height;
		this.width = width;
		this.endX = startX + width;
		this.endY = startY - height;
	}

	
	//triangle constructor: //Triangle triangle = new Triangle(300, 300, 50, 50);

//drawUp method:	
//public void drawUp(SimpleDrawing palette) {
//		
//		for (int i = startX; i < endX; i++) {
//				palette.showPoint(i, startY-i);
//			}
//	}// drawUp
	
	public void draw(SimpleDrawing palette, SimpleDrawProgram draw) {
		HorizontalLine hLine1 = new HorizontalLine(startX, startY, startX + width, startY);
		hLine1.draw(palette);
		DiagonalLine dLine1 = new DiagonalLine(startX, startY, startX + width/2, startY);
		dLine1.drawDown(palette);
		DiagonalLine dLine2 = new DiagonalLine(startX, startY, endX, endY);
		dLine2.drawUp(palette);
		//draw.diagram.add(this);
	}// draw

}
