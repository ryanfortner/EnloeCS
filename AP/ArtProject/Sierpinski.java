import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Polygon;
import java.awt.Color;
import java.awt.BasicStroke;
import java.awt.geom.*;
import java.util.Random;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * JPanel subclass which draws iterations of Sierpinski's triangle
 * within squares in the logarithmic spiral with the golden ratio
 * using a recursive algorithm.
 * 
 * https://en.wikipedia.org/wiki/Sierpi%C5%84ski_triangle
 * 
 * For every base triangle, three additional triangles are drawn
 * using the midpoint of the base and the edge of the canvas.
 * 
 * Each triangle is filled with a unique color using randomly-
 * generated RGB values for each unique polygon, if the user wants.
 */

class Sierpinski extends JPanel {
    
    /* Edit below to change end appearance */
    
    /**
     * Degree that all Siepinski triangles will be drawn with
     */
    private int triangleDegree = 3;
    
    /**
     * Flip where Sierpinski triangle is drawn.
     * True: drawn opposite to triangle with arc.
     */
    private boolean flip = false;
    
    /**
     * Fill each Sierpinski triangle with 
     * a randomly-generated color.
     */
    private boolean sierpinskiRandomColors = true;
    
    /**
     * Controls the width of the original golden rectangle.
     */
    private int initialSide = 980;
    
    /**
     * Controls the font size that draws everything
     * but the spiral (in pixels)
     */
    private int baseFontSize = 1;
    
    /**
     * Controls the spiral font size (pixels)
     */
    private int spiralFontSize = 10;
    
    /**
     * Specify minimum side length of squares 
     * in the spiral.
     * 
     * You can think of this as minimum radius
     * of the arc as well.
     * 
     * In pixels. Must be > 0 to avoid infinite 
     * recursion.
     */
    private int minimumSquareSideLength = 1;
    
    /* DO NOT EDIT */
    private final double goldenRatio = (1 + Math.sqrt(5)) / 2;
    private final Random rand = new Random();
    private final BasicStroke spiralStroke = new BasicStroke(spiralFontSize);
    private final BasicStroke baseStroke = new BasicStroke(baseFontSize);

    @Override
    public void paintComponent(Graphics g) {
        
        /**
         * Typecast to Graphics2D object.
         * Much better shape libraries
         * You can use doubles now
         */
        Graphics2D g2 = (Graphics2D) g;
        
        /**
         * Set the default color & stroke to begin with
         */
        g2.setStroke(baseStroke);
        g2.setColor(Color.black);
        
        /**
         * Create and draw the "golden rectangle"
         * This is basically where the spiral begins
         * Ratio of 1:1.618
         */
        Rectangle2D.Double goldenRectangle = 
            new Rectangle2D.Double(10, 10, initialSide, initialSide / goldenRatio);
        g2.draw(goldenRectangle);
        
        /**
         * Start the recursive mess using the golden rectangle
         */
        recursiveDrawSpiral(g2, 10, 10, initialSide / goldenRatio, 90);
    }
    
    /**
     * Recursive method which constructs
     * a Sierpinski triangle with order n
     */
    private void recursiveDrawTriangle(
        Graphics2D g2, int n,
        double x1, double y1,
        double x2, double y2,
        double x3, double y3
    ) {

        g2.setColor(Color.black);
        
        /**
         * Draw three lines connecting all vertices
         */
        g2.draw(new Line2D.Double(x1, y1, x2, y2));
        g2.draw(new Line2D.Double(x2, y2, x3, y3));
        g2.draw(new Line2D.Double(x3, y3, x1, y1));

        /**
         * Fill in the resulting triangle with a random color
         */
        if (sierpinskiRandomColors) {
            g2.setColor(new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat()));
            g2.fillPolygon(new int[]{(int)x1, (int)x2, (int)x3}, new int[]{(int)y1, (int)y2, (int)y3}, 3);
        } 
           
        /**
         * Handle terminating case
         */
        if (n > 0) {
            /**
             * Calculate the next set of coordinates to be used
             */
            double x1Next = (x1 + x2) / 2;
            double y1Next = (y1 + y2) / 2;
            double x2Next = (x1 + x3) / 2;
            double y2Next = (y1 + y3) / 2;
            double x3Next = (x2 + x3) / 2;
            double y3Next = (y2 + y3) / 2;
            
            /**
             * Make recursive calls to generate three new triangles
             */
            recursiveDrawTriangle(
                g2,
                n - 1,
                x1,
                y1,
                x1Next,
                y1Next,
                x2Next,
                y2Next
            );
            recursiveDrawTriangle(
                g2,
                n - 1,
                x2,
                y2,
                x1Next,
                y1Next,
                x3Next,
                y3Next
            );
            recursiveDrawTriangle(
                g2,
                n - 1,
                x3,
                y3,
                x2Next,
                y2Next,
                x3Next,
                y3Next
            );
        }
    }
    
    /* BELOW ARE METHODS FOR LOGARITHMIC SPIRAL */
    
    /**
     * Recursive method which draws a logarithmic
     * spiral using the golden ratio, 1.618
     * 
     * This is a visual representation of the
     * Fibonacci sequence if looking at side lengths
     */
    private void recursiveDrawSpiral(
        Graphics2D g2,
        double x,
        double y,
        double side,
        int angle
    ) {
        /**
         * Handle the terminating case
         */
        if (side < minimumSquareSideLength) {
            return;
        } else {
            
            g2.setColor(Color.black);
            
            /**
             * Draw current square & arc
             */
            g2.draw(new Rectangle2D.Double(x, y, side, side));
            
            /**
             * Calculate the new side
             * This is the difference between the two sides
             * of the current rectangle
             */
            double newSide = (side * goldenRatio) - side;
            
            /**
             * The new angle is 90 degrees clockwise,
             * must account for wrapping
             */
            int newAngle = angle - 90;
            if (newAngle < 0) {
                newAngle += 360;
            }
            
            /**
             * Draw Sierpinski's triangle within the square
             */
            if (flip) {
                if (angle == 180) {
                    recursiveDrawTriangle(
                        g2,
                        triangleDegree,
                        x,
                        y,
                        x + side,
                        y,
                        x + side,
                        y + side
                    );
                } else if (angle == 270) {
                    recursiveDrawTriangle(
                        g2,
                        triangleDegree,
                        x,
                        y,
                        x + side,
                        y,
                        x,
                        y + side
                    );
                } else if (angle == 90) {
                    recursiveDrawTriangle(
                        g2,
                        triangleDegree,
                        x + side,
                        y + side,
                        x + side,
                        y,
                        x,
                        y + side
                    );
                } else if (angle == 0) {
                    recursiveDrawTriangle(
                        g2,
                        triangleDegree,
                        x + side,
                        y + side,
                        x,
                        y + side,
                        x,
                        y
                    );
                }
            } else {
                if (angle == 0) {
                    recursiveDrawTriangle(
                        g2,
                        triangleDegree,
                        x,
                        y,
                        x + side,
                        y,
                        x + side,
                        y + side
                    );
                } else if (angle == 90) {
                    recursiveDrawTriangle(
                        g2,
                        triangleDegree,
                        x,
                        y,
                        x + side,
                        y,
                        x,
                        y + side
                    );
                } else if (angle == 270) {
                    recursiveDrawTriangle(
                        g2,
                        triangleDegree,
                        x + side,
                        y + side,
                        x + side,
                        y,
                        x,
                        y + side
                    );
                } else if (angle == 180) {
                    recursiveDrawTriangle(
                        g2,
                        triangleDegree,
                        x + side,
                        y + side,
                        x,
                        y + side,
                        x,
                        y
                    );
                }
            }
            
            /**
             * Draw the arc with specified color & stroke
             */
            g2.setColor(Color.red);
            g2.setStroke(spiralStroke);
            drawArc(g2, x, y, side, angle);
            g2.setColor(Color.black);
            g2.setStroke(baseStroke);

            /**
             * Calculate new x, y starting coordinates
             */
            double newX = calcX(x, angle, side, newSide);
            double newY = calcY(y, angle, side, newSide);
            
            /**
             * Make recursive call
             */
            recursiveDrawSpiral(g2, newX, newY, newSide, newAngle);
        }
    }
    
    /**
     * Draw the arc of the current iteration
     * 
     * Graphics.drawArc requires a specific start & "end" angle
     */
    private void drawArc(
        Graphics2D g2,
        double x,
        double y,
        double side,
        int angle
    ) {
        double auxX = x;
        double auxY = y;
        
        if (angle == 0 || angle == 270) {
            auxX = x - side;
        }
        
        if (angle == 270 || angle == 180) {
            auxY = y - side;
        }
        
        Rectangle2D.Double boundingRectangle = 
            new Rectangle2D.Double(auxX, auxY, side * 2, side * 2);
            
        Arc2D.Double arc = 
            new Arc2D.Double(boundingRectangle, angle, 90, Arc2D.OPEN);
        
        // g2.draw(boundingRectangle); // probably shouldn't draw this
        
        System.out.println("Drawing arc for side length: " + side);
        System.out.println("\tAngle: " + angle);
        System.out.println();
        g2.draw(arc);
    }
    
    /**
     * The following are helper methods which
     * make the necessary linear shifts
     * for the next rectangle & arc coordinates
     */
    private double calcX(
        double x,
        double angle,
        double side,
        double newSide
    ) {
        if (angle == 0) {
            x = x + side - newSide;
        } else if (angle == 90) {
            x = x + side;
        } else if (angle == 270) {
            x = x - newSide;
        }
        
        return x;
    }
    private double calcY(
        double y,
        double angle, 
        double side,
        double newSide
    ) {
        if (angle == 0) {
            y = y + side;
        } else if (angle == 180) {
            y = y - newSide;
        } else if (angle == 270) {
            y = y + side - newSide;
        }
        
        return y;
    }
}
