package drawings2;

import csci348.drawings.SimpleDrawing;
import java.awt.event.MouseListener;

public class Diamond extends SimpleDrawProgram{
	private int startX;
	private int startY;
	private int height;
	private int width;

	private Diamond(int startX, int startY, int width, int height) {
		this.startX = startX;
		this.startY = startY;
		this.width = width;
		this.height = height;
	}

	public static Diamond makeDiamond( int x, int y, int width, int height) {
		return new Diamond(x, y, width, height);
	}
	
	public void drawVertical(SimpleDrawing palette) {
		int aX = startX;
		int aY = startY;
		int bX = startX + width/2;
		int bY = startY - height/2;
		int cX = startX;
		int cY = startY - height;
		int dX = startX - width/2;
		int dY = startY - height/2;
		Line line1 = new Line(aX, aY, bX, bY);
		Line line2 = new Line(cX, cY, bX, bY);
		Line line3 = new Line(dX, dY, cX, cY);
		Line line4 = new Line(dX, dY, aX, aY);
		line1.draw(palette);
		line2.draw(palette);
		line3.draw(palette);
		line4.draw(palette);
	}
	
	
}
