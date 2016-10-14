package drawings2;

import csci348.drawings.SimpleDrawing;

public abstract class Shape implements ShapeInterface {

    public Shape(DrawingPalette palette) {


    }

    public void erase(Shape shape, DrawingPalette palette) {
        shape.erase(palette);
    }


//	public int getStartX() {
//		return 
//	}
}
