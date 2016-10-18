package drawings2;


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

}
