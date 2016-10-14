package drawings2;

public interface ShapeInterface {
    public void draw(DrawingPalette palette, String modifier);

    public void erase(DrawingPalette palette);

    public int getStartX();

    public int getStartY();

    public int getEndX();

    public int getEndY();
}
