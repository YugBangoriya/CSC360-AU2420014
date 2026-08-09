import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

/**
 * CSC360 - Session 2 Practice Assignment
 * Java 2D Graphics Showcase
 *
 * This program demonstrates the core features of the Java 2D API using Swing.
 * It covers: lines, stroke styles, basic shapes, curves (Bezier, Arc),
 * Path2D polygons, and transparency (alpha blending).
 *
 * Framework: Java 2D with Swing (Graphics2D)
 * Type: Static graphics — shapes are drawn once during the paint cycle.
 */
public class Java_Basic_2D_Program extends JPanel {

    // ------------------------------------------------------------------
    // Constructor: set the panel size and background colour
    // ------------------------------------------------------------------
    public Java_Basic_2D_Program() {
        setPreferredSize(new Dimension(820, 560));
        setBackground(new Color(245, 245, 245));
    }

    // ------------------------------------------------------------------
    // paintComponent is called automatically by Swing whenever the
    // window needs to be drawn (or redrawn). This is where all
    // Graphics2D drawing happens.
    // ------------------------------------------------------------------
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Cast Graphics to Graphics2D to access the full 2D API
        Graphics2D g2d = (Graphics2D) g.create();

        // Anti-aliasing: smooths edges of shapes and text
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
                RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

        // Draw each section
        drawTitle(g2d);
        drawLines(g2d);
        drawShapes(g2d);
        drawCurves(g2d);
        drawTransparency(g2d);

        // Always dispose a Graphics2D copy when done
        g2d.dispose();
    }

    // ------------------------------------------------------------------
    // SECTION 1: Title bar
    // ------------------------------------------------------------------
    private void drawTitle(Graphics2D g2d) {
        g2d.setFont(new Font("SansSerif", Font.BOLD, 17));
        g2d.setColor(new Color(30, 30, 30));
        g2d.drawString("CSC360 - Java 2D Graphics Showcase", 20, 30);

        // Horizontal divider line below the title
        g2d.setStroke(new BasicStroke(1f));
        g2d.setColor(new Color(180, 180, 180));
        g2d.draw(new Line2D.Double(20, 38, 800, 38));
    }

    // ------------------------------------------------------------------
    // SECTION 2: Lines with different stroke styles
    //
    // BasicStroke controls line width and dash patterns.
    // This directly relates to how vector graphics describe lines
    // using mathematical properties rather than pixel grids.
    // ------------------------------------------------------------------
    private void drawLines(Graphics2D g2d) {
        sectionLabel(g2d, "Lines & Strokes", 20, 62);

        // --- Thin solid line (1px) ---
        g2d.setColor(new Color(30, 30, 30));
        g2d.setStroke(new BasicStroke(1f));
        g2d.draw(new Line2D.Double(20, 78, 230, 78));
        smallLabel(g2d, "1px solid", 235, 82);

        // --- Thick solid line (4px) ---
        g2d.setColor(new Color(50, 100, 200));
        g2d.setStroke(new BasicStroke(4f));
        g2d.draw(new Line2D.Double(20, 100, 230, 100));
        smallLabel(g2d, "4px solid", 235, 104);

        // --- Dashed line ---
        // BasicStroke(width, cap, join, miterLimit, dashArray, dashPhase)
        // dashArray {8f, 5f} means: 8px on, 5px off
        float[] dash = { 8f, 5f };
        g2d.setColor(new Color(180, 50, 50));
        g2d.setStroke(new BasicStroke(
                2f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 10f, dash, 0f));
        g2d.draw(new Line2D.Double(20, 122, 230, 122));
        smallLabel(g2d, "2px dashed", 235, 126);

        // --- Diagonal line to show direction ---
        g2d.setColor(new Color(80, 160, 80));
        g2d.setStroke(new BasicStroke(2f));
        g2d.draw(new Line2D.Double(20, 78, 20, 122)); // left cap line
        g2d.draw(new Line2D.Double(230, 78, 230, 122)); // right cap line
    }

    // ------------------------------------------------------------------
    // SECTION 3: Basic geometric shapes
    //
    // Java 2D uses the java.awt.geom package for shape objects.
    // fill() - fills the interior of a shape with the current colour
    // draw() - draws only the outline using the current stroke
    // ------------------------------------------------------------------
    private void drawShapes(Graphics2D g2d) {
        sectionLabel(g2d, "Basic Shapes", 20, 158);

        // --- Filled rectangle ---
        g2d.setStroke(new BasicStroke(1f));
        g2d.setColor(new Color(80, 180, 80));
        g2d.fill(new Rectangle2D.Double(20, 168, 110, 65));
        smallLabel(g2d, "Filled rect", 20, 245);

        // --- Stroked rectangle (outline only) ---
        g2d.setColor(new Color(50, 100, 200));
        g2d.setStroke(new BasicStroke(3f));
        g2d.draw(new Rectangle2D.Double(150, 168, 110, 65));
        smallLabel(g2d, "Stroked rect", 150, 245);

        // --- Rounded rectangle ---
        g2d.setStroke(new BasicStroke(1f));
        g2d.setColor(new Color(220, 150, 40));
        // RoundRectangle2D(x, y, width, height, arcW, arcH)
        g2d.fill(new RoundRectangle2D.Double(280, 168, 110, 65, 24, 24));
        smallLabel(g2d, "Rounded rect", 280, 245);

        // --- Filled circle ---
        g2d.setColor(new Color(200, 60, 60));
        g2d.fill(new Ellipse2D.Double(410, 168, 70, 70));
        smallLabel(g2d, "Circle", 418, 250);

        // --- Stroked ellipse ---
        g2d.setColor(new Color(100, 50, 190));
        g2d.setStroke(new BasicStroke(2.5f));
        g2d.draw(new Ellipse2D.Double(500, 178, 130, 55));
        smallLabel(g2d, "Stroked ellipse", 508, 250);

        // --- Triangle using Path2D ---
        // Path2D lets you build any polygon by specifying vertices.
        // This is the vector graphics concept: shapes defined by
        // mathematical paths, not pixel grids.
        Path2D.Double triangle = new Path2D.Double();
        triangle.moveTo(695, 233); // bottom-left
        triangle.lineTo(740, 168); // top-centre
        triangle.lineTo(785, 233); // bottom-right
        triangle.closePath(); // connects back to the start
        g2d.setStroke(new BasicStroke(1f));
        g2d.setColor(new Color(30, 170, 170));
        g2d.fill(triangle);
        smallLabel(g2d, "Triangle (Path2D)", 672, 250);
    }

    // ------------------------------------------------------------------
    // SECTION 4: Curves
    //
    // Curves are defined mathematically by control points.
    // - QuadCurve2D: one control point (quadratic Bezier)
    // - CubicCurve2D: two control points (cubic Bezier)
    // - Arc2D: a portion of an ellipse
    // This relates to the Session 1 discussion on how a curve's
    // derivative changes at every point unlike a straight line.
    // ------------------------------------------------------------------
    private void drawCurves(Graphics2D g2d) {
        sectionLabel(g2d, "Curves", 20, 275);

        // --- Quadratic Bezier curve ---
        // Three points: start, one control point, end
        g2d.setColor(new Color(200, 80, 30));
        g2d.setStroke(new BasicStroke(2.5f));
        g2d.draw(new QuadCurve2D.Double(20, 370, 120, 275, 220, 370));
        smallLabel(g2d, "Quadratic Bezier", 45, 395);

        // --- Cubic Bezier curve ---
        // Four points: start, two control points, end
        g2d.setColor(new Color(30, 120, 200));
        g2d.setStroke(new BasicStroke(2.5f));
        g2d.draw(new CubicCurve2D.Double(265, 370, 315, 275, 365, 395, 430, 295));
        smallLabel(g2d, "Cubic Bezier", 298, 410);

        // --- Arc ---
        // A slice of an ellipse: Arc2D(x, y, w, h, startAngle, arcAngle, type)
        g2d.setColor(new Color(60, 170, 60));
        g2d.setStroke(new BasicStroke(2.5f));
        g2d.draw(new Arc2D.Double(465, 285, 120, 95, 30, 240, Arc2D.OPEN));
        smallLabel(g2d, "Arc", 510, 400);

        // --- Pentagon using Path2D + trigonometry ---
        // This is how vector graphics work: each vertex is computed
        // mathematically, so the shape scales perfectly at any size.
        Path2D.Double pentagon = new Path2D.Double();
        double cx = 680, cy = 335, r = 52;
        for (int i = 0; i < 5; i++) {
            double angle = Math.toRadians(-90 + i * 72); // evenly spaced angles
            double x = cx + r * Math.cos(angle);
            double y = cy + r * Math.sin(angle);
            if (i == 0)
                pentagon.moveTo(x, y);
            else
                pentagon.lineTo(x, y);
        }
        pentagon.closePath();
        g2d.setColor(new Color(160, 50, 160));
        g2d.setStroke(new BasicStroke(2f));
        g2d.draw(pentagon);
        smallLabel(g2d, "Pentagon (math + Path2D)", 625, 400);
    }

    // ------------------------------------------------------------------
    // SECTION 5: Transparency (Alpha blending)
    //
    // Colours in Java 2D support an alpha channel (0 = fully transparent,
    // 255 = fully opaque). When transparent shapes overlap, their colours
    // blend together. This is a key concept in raster rendering.
    // ------------------------------------------------------------------
    private void drawTransparency(Graphics2D g2d) {
        sectionLabel(g2d, "Transparency (Alpha Blending)", 20, 430);

        g2d.setStroke(new BasicStroke(1f));

        // Red circle - alpha 140 out of 255
        g2d.setColor(new Color(255, 50, 50, 140));
        g2d.fill(new Ellipse2D.Double(20, 445, 90, 75));

        // Blue circle - overlaps with red, blend is visible
        g2d.setColor(new Color(50, 50, 255, 140));
        g2d.fill(new Ellipse2D.Double(62, 445, 90, 75));

        // Green circle - overlaps both, triple blend at centre
        g2d.setColor(new Color(30, 200, 30, 140));
        g2d.fill(new Ellipse2D.Double(41, 472, 90, 75));

        smallLabel(g2d, "Overlapping shapes with alpha = 140/255. Blended colours visible at intersections.", 175, 505);
    }

    // ------------------------------------------------------------------
    // Helper: bold section heading
    // ------------------------------------------------------------------
    private void sectionLabel(Graphics2D g2d, String text, int x, int y) {
        g2d.setFont(new Font("SansSerif", Font.BOLD, 13));
        g2d.setColor(new Color(60, 60, 60));
        g2d.drawString(text, x, y);
    }

    // ------------------------------------------------------------------
    // Helper: small grey descriptor label
    // ------------------------------------------------------------------
    private void smallLabel(Graphics2D g2d, String text, int x, int y) {
        g2d.setFont(new Font("SansSerif", Font.PLAIN, 10));
        g2d.setColor(new Color(100, 100, 100));
        g2d.drawString(text, x, y);
    }

    // ------------------------------------------------------------------
    // Entry point: create the window on the Swing Event Dispatch Thread
    // ------------------------------------------------------------------
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("CSC360 - Java 2D Graphics Showcase");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new Java_Basic_2D_Program());
            frame.pack(); // size window to fit the panel
            frame.setLocationRelativeTo(null); // centre on screen
            frame.setVisible(true);
        });
    }
}
