package drawings2;

public interface ShapeInterface {
    void draw(DrawingPalette palette);

    void erase(DrawingPalette palette);

   int getStartX();

   int getStartY();

   int getEndX();

   int getEndY();

    int getWidth();
    int getHeight();

   String getShape();
}
