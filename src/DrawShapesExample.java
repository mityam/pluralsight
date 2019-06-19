import java.awt.Component;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
 
public class DrawShapesExample {
  public static void main(String[] args) {
    // Create a frame
    Frame frame = new Frame();
    // Add a component with a custom paint method
    frame.add(new CustomPaintComponent());
    // Display the frame
    int frameWidth = 800;
    int frameHeight = 600;
    frame.setSize(frameWidth, frameHeight);
    frame.setVisible(true);
    }
    /**
     * To draw on the screen, it is first necessary to subclass a Component 
    * and override its paint() method. The paint() method is automatically called 
    * by the windowing system whenever component's area needs to be repainted.
    */
  static class CustomPaintComponent extends Component {
        public void paint(Graphics g) {
            // Retrieve the graphics context; this object is used to paint shapes
            Graphics2D g2d = (Graphics2D)g;
            // Draw an oval that fills the window
            int x = 0;
            int y = 0;
            int w = getSize().width-1;
            int h = getSize().height-1;
            /**
                * The coordinate system of a graphics context is such that the origin is at the 
                * northwest corner and x-axis increases toward the right while the y-axis increases 
                * toward the bottom.
                */
            //g2d.drawLine(x, y, w, h);
            // to draw a filled oval use : g2d.fillOval(x, y, w, h) instead
            //g2d.drawOval(x, y, w, h);
            // to draw a filled rectangle use : g2d.fillRect(x, y, w, h) instead
            //g2d.drawRect(x, y, w, h);
            // A start angle of 0 represents a 3 o'clock position, 90 represents a 12 o'clock position,
            // and -90 (or 270) represents a 6 o'clock position
            int startAngle = 45;
            int arcAngle = -60;
            // to draw a filled arc use : g2d.fillArc(x, y, w, h, startAngle, arcAngle) instead
            //g2d.drawArc(x, y, w/2, h/2, startAngle, arcAngle);
            // to draw a filled round rectangle use : g2d.fillRoundRect(x, y, w, h, arcWidth, arcHeight) instead
            //g2d.drawRoundRect(x, y, w, h, w/2, h/2);
            Polygon polygon = new Polygon();
            int XX = 10;
            do 
            {   
                g2d.clearRect(XX, 10, XX+40, 50);
                polygon.addPoint(XX, 10);
                polygon.addPoint(XX, 50);
                polygon.addPoint(XX+40,50);
                polygon.addPoint(XX+40, 10);
                g2d.fillPolygon(polygon);
                XX = XX + 10;
                try
                  { Thread.sleep(100);}
                  catch (Exception e)
                  {}
                
            } while (XX <= 600);
            System.exit(1);    
            //polygon.addPoint(0, /4);
            // Add more points...
            // to draw a filled round rectangle use : g2d.fillPolygon(polygon) instead
            //g2d.drawPolygon(polygon);
            

    }
  }
}
 