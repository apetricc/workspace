package drawings2;

public class Triangle extends Shape {

    int startX;
    int startY;
    int height;
    int width;
    Line line1;
    Line line2;
    Line line3;
    int endX;
    int endY;
    String direction;
    int aX;
    int aY;
    int bX;
    int bY;
    int cX;
    int cY;

    /**
     * Triangle is an object that can be drawn on a DrawingPalette window.
     * @param startX the starting x coordinate for drawing the Triangle
     * @param startY the starting y coordinate for drawing the Triangle
     * @param width the width of the triangle
     * @param height the height of the triangle--use a negative height to draw upwards, a positive height for downwards
     * @param palette the DrawingPalette window the Triangle object can be drawn on
     * @param direction the direction the Triangle will point
     */

    public Triangle(int startX, int startY, int width, int height, DrawingPalette palette, String direction) {
        super(palette);
        this.startX = startX;
        this.startY = startY;
        this.height = height;
        this.width = width;
        endX = startX + width;
        endY = startY + height;
        this.direction = direction;
    }

//

    /**
     * drawUpTriangle draws a Triangle object pointing upwards on the SimpleDrawing window
     *
     * @param palette the SimpleDrawing where the Triangle will be drawn
     *
     */
    public void draw(DrawingPalette palette) {

        if (direction.equalsIgnoreCase("right")) {
            aX = startX;
            aY = startY;
            bX = aX + Math.abs(width);
            bY = aY - height/2;
            cX = aX;
            cY = aY - height;
            endX = bX;
        }
        else if (direction.equalsIgnoreCase("left")) {
            aX = startX;
            aY = startY;
            bX = startX - Math.abs(width);
            bY = startY - height/2;
            cX = startX;
            cY = aY - height;
            endX = bX;
            endY = cY;
        }
        else if (direction.equalsIgnoreCase("up") || direction.equalsIgnoreCase("down")){
              aX = startX;
              aY = startY;
              bX = startX + width;
            bY = startY;
            cX = startX + width/2;
            cY = startY + height;

        }
        endY = startY + height;
//        System.out.println("These are the coords of the triangle; \n"
//
//
//                +"startX: " + startX
//                +"\nendX: " + getEndX()
//                +"\nstartY: " + startY
//                +"\nendY: " + getEndY()
//                +"\naX: " +aX
//                + "\naY: " + aY
//        + "\nbX: " + bX
//        + "\nbY: "+bY
//        + "\ncX: " +cX
//        + "\ncY: " +cY
//        + "\nwidth: " + width
//        + "\nheight: " + height);
//        System.out.println("after the control flow in triangle, startY is: " + startY + " and endY is : " + endY);
            line1 = new Line(aX, aY, bX, bY, palette);
            line2 = new Line(bX, bY, cX, cY, palette);
            line3 = new Line(cX, cY, aX, aY, palette);
            line1.draw(palette);
            line2.draw(palette);
            line3.draw(palette);

    }

    public void erase(DrawingPalette palette) {
        line1.erase(palette);
        line2.erase(palette);
        line3.erase(palette);
    }

    public int getStartX() {
        return startX;
    }

    public int getEndX() {
        return endX;
    }

    public int getStartY() {
        return startY;
    }

    public int getEndY() {
        return endY;
    }

    @Override
    public String getShape() {
        return "Triangle";
    }

    //public void setEndY(int newY) {
      //  endY = newY;
   // }
}// Triangle
