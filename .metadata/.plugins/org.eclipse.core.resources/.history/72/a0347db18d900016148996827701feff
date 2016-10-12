package drawings2;

import csci348.drawings.SimpleDrawing;

public class Arrow extends Shape {
	private int startX;
	private int startY;
	private int endX;
	private int endY;
	
	public Arrow(int startX, int startY, int endX, int endY,DrawingPalette palette) {
		super(palette);
		this.startX = startX;
		this.startY = startY;
		this.endX = endX;
		this.endY = endY;
	}
	

	public void draw(DrawingPalette palette) {
	    int width = endX - startX ;
	    int height = endY - startY ;
	    int x = startX;
	    int y = startY;
	    int dx1 = 0;
	    int dy1 = 0;
	    int dx2 = 0;
	    int dy2 = 0 ;
	    if (width<0) dx1 = -1 ; else if (width>0) dx1 = 1 ;
	    if (height<0) dy1 = -1 ; else if (height>0) dy1 = 1 ;
	    if (width<0) dx2 = -1 ; else if (width>0) dx2 = 1 ;
	    int longest = Math.abs(width) ;
	    int shortest = Math.abs(height) ;
	    if (longest<=shortest) {
	        longest = Math.abs(height) ;
	        shortest = Math.abs(width) ;
	        if (height<0) dy2 = -1 ; 
	        else if (height>0) dy2 = 1 ;
	        dx2 = 0 ;            
	    }
	    int numerator = longest/2;
	    for (int i=0;i<=longest;i++) {
	        palette.showPoint(x,y) ;
	        numerator += shortest ;
	        if (numerator>=longest) {
	            numerator -= longest ;
	            x += dx1 ;
	            y += dy1 ;
	        } else {
	            x += dx2 ;
	            y += dy2 ;
	        }
	    }
	
	    
	    
	    
	    if (endY < startY){
	    	Triangle pointer = new Triangle(endX-6, endY,12,12,palette);
	    	pointer.draw(palette);
	    }
	    else if (endY > startY) {
	    	Triangle pointer = new Triangle(endX - 6, endY, 12, 12,palette);
	    	pointer.drawDownTriangle(palette);
	    }
	    else if (endX < startX) {
	    	Triangle pointer = new Triangle(endX, endY + 6, 12, 12,palette);
	    	pointer.drawLeft(palette);
	    }
	    else if (endX > startX) {
	    	Triangle pointer = new Triangle(endX, endY + 6, 12, 12,palette);
	    	pointer.drawRight(palette);
	    }
	    
	    
	}//draw


	
	public void erase(DrawingPalette palette) {
		
		
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
