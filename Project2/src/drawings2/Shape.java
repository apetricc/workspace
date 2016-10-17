package drawings2;

import csci348.drawings.SimpleDrawing;

public abstract class Shape implements ShapeInterface {

    public Shape(DrawingPalette palette) {


    }

    public void erase(Shape shape, DrawingPalette palette) {
        shape.erase(palette);
    }

    @Override
    public String getShape() {
        return "Abstract shape.";
    }


//	public int getStartX() {
//		return 
//	}
}
