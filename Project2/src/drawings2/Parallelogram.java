package drawings2;
import csci348.drawings.SimpleDrawing;

public class Parallelogram extends Shape{

	private int startX;
	private int startY;
	private int height;
	private int width;
	
	public Parallelogram(int startX, int startY, int width, int height, DrawingPalette palette) {
		super(palette);
		this.startX = startX;
		this.startY = startY;
		this.height = height;
		this.width = width;
	}

	public void draw(DrawingPalette  palette) {
		int aX = startX;
		int aY = startY;
		int bX = startX + width;
		int bY = startY;
		int cX = (startX + width/2 + width);
		int cY = startY - height;
		int dX = startX + width/2;
		int dY = startY - height;
		Line bottom = new Line(aX, aY, bX, bY, palette);
		Line right = new Line (bX, bY, cX, cY, palette);
		Line top = new Line(cX, cY, dX, dY, palette);
		Line left = new Line(dX, dY, aX, aY, palette);
		bottom.draw(palette);
		right.draw(palette);
		top.draw(palette);
		left.draw(palette);
		
	}//draw
	
	public void erase(DrawingPalette palette) {
		
		
	}
	public int getStartX() {
		return startX;
	}
	public int getEndX() {
		return startX + width;
	}
	public int getStartY() {
		return startY;
	}
	public int getEndY() {
		return startY - height;
	}
}
