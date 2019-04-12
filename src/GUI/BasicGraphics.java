package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BasicGraphics extends JPanel {

    public Color colorx() {

        Color r = new Color(51, 204, 255);

        return r;
    }

    //Constructor
    public BasicGraphics() {
        this.setPreferredSize(new Dimension(800, 600));
    }

    private void draw(Graphics g) {
        setBackground(colorx());

        //sol
        g.setColor(Color.yellow);
        g.fillOval(500, 25, 125, 125);

        //pasto
        g.setColor(Color.GREEN);
        g.fillRect(0, 400, 900, 800);

        //montaña1
        g.setColor(Color.decode("#09a800"));
        int x[] = {0, 400, 200};
        int y[] = {400, 400, 250};
        g.fillPolygon(x, y, 3);
        
        //montaña2
        g.setColor(Color.decode("#09a800"));
        int x1[] = {300, 600, 450};
        int y1[] = {400, 400, 250};
        g.fillPolygon(x1, y1, 3);

        //montaña3
        g.setColor(Color.decode("#09a800"));
        int x2[] = {500, 900, 700};
        int y2[] = {400, 400, 250};
        g.fillPolygon(x2, y2, 3);

        
        //casa
        g.setColor(Color.decode("#ff8c66"));
        g.fillRect(500, 450, 100, 100);
        
        //techo de la casa
        g.setColor(Color.decode("#00001a"));
        int x3[] = {480, 620, 550};
        int y3[] = {450, 450,405};
        g.fillPolygon(x3, y3, 3);
        
        
         //arbol follaje
        g.setColor(Color.decode("#145214"));
        int x4[] = {200, 250, 225};
        int y4[] = {500, 500,405};
        g.fillPolygon(x4, y4, 3);
        
        //arbol tronco
        g.setColor(Color.decode("#ff8c66"));
        g.fillRect(220, 500, 10, 15);  
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public static void main(String[] args) {
        JFrame ventana = new JFrame("BasicGraphics");
        ventana.setContentPane(new BasicGraphics());
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.pack();

        ventana.setResizable(false);
        ventana.setLocation(150, 100);
        ventana.setVisible(true);
    }

}
