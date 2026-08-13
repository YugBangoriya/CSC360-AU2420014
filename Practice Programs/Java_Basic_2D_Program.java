import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Java_Basic_2D_Program extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // --- Shape 1: Square (outline only, no fill) ---
        g2d.setColor(Color.BLUE);
        g2d.setStroke(new BasicStroke(3));
        g2d.drawRect(80, 80, 150, 150);

        // --- Shape 2: Circle (filled, no outline) ---
        g2d.setColor(Color.RED);
        g2d.fillOval(310, 80, 150, 150);

        // --- Shape 3: Triangle (filled with outline) ---
        int[] xPoints = { 610, 535, 685 };
        int[] yPoints = { 230, 80, 80 };
        // Fill first, then draw outline on top
        g2d.setColor(Color.GREEN);
        g2d.fillPolygon(xPoints, yPoints, 3);
        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(3));
        g2d.drawPolygon(xPoints, yPoints, 3);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Java 2D - Basic Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 400);
        frame.add(new Java_Basic_2D_Program());
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}