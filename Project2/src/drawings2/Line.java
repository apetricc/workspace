package drawings2;

import csci348.drawings.SimpleDrawing;

public class Line extends Shape {
	int startX;
	int startY;
	int endX;
	int endY;

	public Line(int startX, int startY, int endX, int endY, DrawingPalette palette) {
		super(palette);
		this.startX = startX;
		this.startY = startY;
		this.endX = endX;
		this.endY = endY;
	}

	/**
	 * draw shows the points of the Line object in the Drawing passed as a
	 * parameter
	 * 
	 * @param palette
	 *            The Drawing object that the line will be shown in.
	 */
	public void draw(DrawingPalette palette, String modifier) {
		int width = endX - startX;
		int height = endY - startY;
		int x = startX;
		int y = startY;
		int dx1 = 0;
		int dy1 = 0;
		int dx2 = 0;
		int dy2 = 0;
		if (width < 0)
			dx1 = -1;
		else if (width > 0)
			dx1 = 1;
		if (height < 0)
			dy1 = -1;
		else if (height > 0)
			dy1 = 1;
		if (width < 0)
			dx2 = -1;
		else if (width > 0)
			dx2 = 1;
		int longest = Math.abs(width);
		int shortest = Math.abs(height);
		if (longest <= shortest) {
			longest = Math.abs(height);
			shortest = Math.abs(width);
			if (height < 0)
				dy2 = -1;
			else if (height > 0)
				dy2 = 1;
			dx2 = 0;
		}
		int numerator = longest / 2;
		for (int i = 0; i <= longest; i++) {
			palette.showPoint(x, y);
			numerator += shortest;
			if (numerator >= longest) {
				numerator -= longest;
				x += dx1;
				y += dy1;
			} else {
				x += dx2;
				y += dy2;
			}
		}
	}// draw

	public void erase(DrawingPalette palette) {
//		palette.shapes.remove(this);
		int width = endX - startX;
		int height = endY - startY;
		int x = startX;
		int y = startY;
		int dx1 = 0;
		int dy1 = 0;
		int dx2 = 0;
		int dy2 = 0;
		if (width < 0)
			dx1 = -1;
		else if (width > 0)
			dx1 = 1;
		if (height < 0)
			dy1 = -1;
		else if (height > 0)
			dy1 = 1;
		if (width < 0)
			dx2 = -1;
		else if (width > 0)
			dx2 = 1;
		int longest = Math.abs(width);
		int shortest = Math.abs(height);
		if (longest <= shortest) {
			longest = Math.abs(height);
			shortest = Math.abs(width);
			if (height < 0)
				dy2 = -1;
			else if (height > 0)
				dy2 = 1;
			dx2 = 0;
		}
		int numerator = longest / 2;
		for (int i = 0; i <= longest; i++) {
			palette.hidePoint(x, y);
			numerator += shortest;
			if (numerator >= longest) {
				numerator -= longest;
				x += dx1;
				y += dy1;
			} else {
				x += dx2;
				y += dy2;
			}
		}

	}// erase

	public int getStartX() {
		return startX;
	}

	public int getStartY() {
		return startY;
	}

	public int getEndX() {
		return endX;
	}

	public int getEndY() {
		return endY;
	}

}
