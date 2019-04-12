package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LineExample extends JPanel {

    int numLines, numLinesT;

    public Color colorx() {
        Random random = new Random();
        int r = random.nextInt(256);
        int g = random.nextInt(256);
        int b = random.nextInt(256);
        return new Color(r, g, b);
    }

    public LineExample() {
        this.setPreferredSize(new Dimension(500, 500));
        numLines = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de lineas"));
        
    } // constructor

    private void draw(Graphics g) {
        setBackground(Color.black);
        int y0 = 0;
        int y1 = 0;
        int x0 = -100;
        int x1 = -100;

        for (int i = 0; i < numLines; i++) {

            g.drawLine(x0, y0, x1, y1);
            x0 = -100 + (int) (Math.random() * 700);
            x1 = -100 + (int) (Math.random() * 700);
            y0 = -400 + (int) (Math.random() * 700);
            y1 = 0 + (int) (Math.random() * 700);
            g.setColor(colorx());
        } 
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);

    }

    public static void main(String[] args) {
        JFrame window = new JFrame("Graphing Function");
        window.setContentPane(new LineExample());
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.pack();
        window.setResizable(false);
        window.setLocation(150, 100);
        window.setVisible(true);

    }
}
