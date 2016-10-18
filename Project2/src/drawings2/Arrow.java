package drawings2;

public class Arrow extends Shape {
    int startX;
    int startY;
    int endX;
    int endY;
    Line arrowLine;
    Triangle pointer;

    public Arrow(int startX, int startY, int endX, int endY, DrawingPalette palette) {
        super(palette);
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }


    public void draw(DrawingPalette palette) {
        arrowLine = new Line(startX, startY, endX, endY, palette);
        arrowLine.draw(palette);

        if (endY < startY && endX == startX) {
            pointer = new Triangle(endX - 6, endY, 12, -12, palette, "up");
            pointer.draw(palette);
        } else if (endY > startY && endX == startX) {
            pointer = new Triangle(endX - 6, endY, 12, 12, palette, "down");
            pointer.draw(palette);
        } else if (endX < startX && startY == endY) {
            pointer = new Triangle(endX, endY + 6, 12, 12, palette, "left");
            pointer.draw(palette);
        } else if (endX > startX && startY == endY) {
            pointer = new Triangle(endX, endY + 6, 12, 12, palette, "right");
            pointer.draw(palette);
        }

    }//draw


    public void erase(DrawingPalette palette) {
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

    @Override
    public int getWidth() {
        return endX - startX;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public String getShape() {

        return "Arrow";
    }

}
