package drawings2;
public class Arrow extends Shape {
	int startX;
	int startY;
	int endX;
	int endY;
	Line arrowLine;
	Triangle pointer;
	public Arrow(int startX, int startY, int endX, int endY,DrawingPalette palette) {
		super(palette);
		this.startX = startX;
		this.startY = startY;
		this.endX = endX;
		this.endY = endY;
	}
	

	public void draw(DrawingPalette palette, String modifier) {
	    arrowLine = new Line(startX, startY, endX, endY, palette);
	    arrowLine.draw(palette, "");
	    
	    if (endY < startY){
	    	modifier = "up";
	    	pointer = new Triangle(endX-6, endY,12,12,palette);
	    	pointer.draw(palette, modifier);
	    }
	    else if (endY > startY) {
	    	modifier = "down";
	    	pointer = new Triangle(endX - 6, endY, 12, 12,palette);
	    	pointer.draw(palette, modifier);
	    }
	    else if (endX < startX) {
	    	modifier = "left";
	    	pointer = new Triangle(endX, endY + 6, 12, 12,palette);
	    	pointer.draw(palette, modifier);
	    }
	    else if (endX > startX) {
	    	modifier = "right";
	    	pointer = new Triangle(endX, endY + 6, 12, 12,palette);
	    	pointer.draw(palette, modifier);
	    }
	    
	    endY += Math.abs(pointer.getStartY() - pointer.getEndY());
	    endX += Math.abs(pointer.getEndX() - pointer.getStartX());
	}//draw


	
	public void erase(DrawingPalette palette) {
//		palette.shapes.remove(this);
		arrowLine.erase(palette);
		pointer.erase(palette);
	}
	
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
