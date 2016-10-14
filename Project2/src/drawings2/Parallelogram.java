package drawings2;

import csci348.drawings.SimpleDrawing;

public class Parallelogram extends Shape {

    int startX;
    int startY;
    int height;
    int width;
    Line bottom;
    Line right;
    Line top;
    Line left;

    public Parallelogram(int startX, int startY, int width, int height, DrawingPalette palette) {
        super(palette);
        this.startX = startX;
        this.startY = startY;
        this.height = height;
        this.width = width;
    }

    public void draw(DrawingPalette palette, String modifier) {
        int aX = startX;
        int aY = startY;
        int bX = startX + width;
        int bY = startY;
        int cX = (startX + width / 2 + width);
        int cY = startY - height;
        int dX = startX + width / 2;
        int dY = startY - height;
        bottom = new Line(aX, aY, bX, bY, palette);
        right = new Line(bX, bY, cX, cY, palette);
        top = new Line(cX, cY, dX, dY, palette);
        left = new Line(dX, dY, aX, aY, palette);
        bottom.draw(palette, modifier);
        right.draw(palette, modifier);
        top.draw(palette, modifier);
        left.draw(palette, modifier);

    }//draw

    public void erase(DrawingPalette palette) {
//		palette.shapes.remove(this);
        bottom.erase(palette);
        top.erase(palette);
        right.erase(palette);
        left.erase(palette);

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
