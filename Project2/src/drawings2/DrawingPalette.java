package drawings2;

import java.util.ArrayList;

import csci348.drawings.SimpleDrawing;

import java.awt.event.*;
import java.awt.*;

public class DrawingPalette extends SimpleDrawing {

    ArrayList<Shape> shapes = new ArrayList<Shape>();

    //only really need mouse click and if resized


    public DrawingPalette(int width, int height) {
        super();
    }

    public DrawingPalette() {
        super();
    }

    /**
     * why don't I just hide a 10*10 area around where the mouse is clicked??  Spot erase.
     * why don't I just remove the object from the arraylist and redraw the arraylist
     */
    @Override
    public void mouseClicked(MouseEvent e) {

        if (e != null){
//
//                    for (Shape s : shapes) {
//                        System.out.println("The mouse is at: " + e.getPoint()
//                        + " \nvalid points between: " +s.getStartX() +" " + s.getStartY()
//                    + "\n and: " +s.getEndX() +" "+s.getEndY());
//        }



            int x = e.getX();

        int y = e.getY();

        int startX;
        int endX;
        int startY;
        int endY;
        for (int i = 0; i < shapes.size(); i++) {
            // if (shapes.get(i).getShape().equalsIgnoreCase("line")|| shapes.get(i).getShape().equalsIgnoreCase("arrow")) {
            startX = shapes.get(i).getStartX();
            startY = shapes.get(i).getStartY();
            endX = shapes.get(i).getEndX();
            endY = shapes.get(i).getEndY();
            System.out.println("Clicked! --> coords: " + x + " " + y);

            if (((x >= startX && x <= endX) || (x <= startX && x >= endX)) && ((y <= startY && y >= endY) || (y >= startY && y <= endY))) {
                // shapes.get(i).erase(this);
                shapes.remove(i);
                this.hideAllPoints();
                System.out.println("Erased! -->contents of shapes list: " + shapes.toString());
                for (Shape s : shapes) s.draw(this);
            }


        }








//                //acknowledge that endX or endY could be less than the startX or startY
//                //1st quad
//                if (startX < endX && startY > endY) {
//                    if (x > startX && x < endX && y < startY && y > endY) {
//                        shapes.get(i).erase(this);
//                        shapes.remove(i);
//                        System.out.println("The array list shapes is now this long, after click event: " + shapes.size());
//
//                    }
//                }
//                //2nd quad
//                if (startX > endX && startY > endY) {
//                    if (x < startX && x > endX && y > endY && y < startY) {
//                        shapes.get(i).erase(this);
//                        shapes.remove(i);
//                        System.out.println("The array list shapes is now this long, after click event: " + shapes.size());
//                    }
//
//                }
//
//                //3rd
//                if (startX > endX && startY < endY) {
//                    if (x < startX && x > endX && y > startY && y < endY) {
//                        shapes.get(i).erase(this);
//                        shapes.remove(shapes.get(i));
//                        System.out.println("The array list shapes is now this long, after click event: " + shapes.size());
//                    }
//                }
//                //4th quad
//                if (startX < endX && startY < endY) {
//                    if (x > startX && x < endX && y > startY && y < endY) {
//                        shapes.get(i).erase(this);
//                        shapes.remove(shapes.get(i));
//                        System.out.println("The array list shapes is now this long, after click event: " + shapes.size());
//                    }
//                }






            //catch all below

               // for (Shape s : shapes) s.draw(this);
//            } else {
//                startX = shapes.get(i).getStartX();
//                endX = shapes.get(i).getEndX();
//                startY = shapes.get(i).getStartY();
//                endY = shapes.get(i).getEndY();
//                if (((x >= startX && x <= endX) || (x <= startX && x >= endX)) && ((y <= startY && y >= endY) || (y >= startY && y <= endY))) {
//                    shapes.get(i).erase(this);
//                    shapes.remove(i);
//                    this.hideAllPoints();
//                    for (Shape s : shapes) s.draw(this);
//                }
            }

        }//mouseClicked



    /*
    The triangle is getting re-drawn as a reflection b/c I'm not passing a modifier string and the defaul is up!
    Maybe if I determined up and down for the triangle by positive or negative height and had the up and down
    algorithms inside the one draw method I could fix this issue. Really that's the last BIG issue.  The reason my clicks are off a little
    I dunno but I bet my math is just off a little somewhere. Still that's not a total breakdown of the software.  I could find a more efficient way to
    check for collisions too. I could just google 'collision check' for gosh sakes.  There are a million algorithms out there.
     */
    @Override
    public void componentResized(ComponentEvent e) {
        System.out.println("The size of the window is: " + e.getComponent().getSize());
        if (e != null && shapes != null) {
            System.out.println("Window resized, should be redrawing window from linked list now...");
            int numShapes = shapes.size();
			for (Shape s : shapes) {
                s.erase(this);
				s.draw(this);
			}
//            for (int i = 0; i < numShapes; i++) {
//                if (!shapes.isEmpty())
//                    shapes.get(i).draw(this, "");
//            }
//			

        }
    }//componentResized

    //	public void setForegroundColor(java.awt.Color color) {
//		setForegroundColor(color);
//	}
    public void addShape(Shape s) {
        shapes.add(s);
    }

}