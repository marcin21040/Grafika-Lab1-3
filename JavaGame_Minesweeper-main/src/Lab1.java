import javax.swing.*;
import java.awt.*;


public class Lab1 {


    static class Surface extends JPanel {

        private void doDrawing(Graphics g) {

            Graphics2D g2d = (Graphics2D) g;
            g2d.drawLine(200,200,600,200);
            g2d.drawLine(200,200,200,700);
            g2d.drawLine(200,700,600,700);
            g2d.drawLine(600,700,600,200);
            g2d.drawRect(450,600,50,100);
            g2d.drawRoundRect(485,640,10,10,10,10);
            g2d.drawRect(240,350,70,70);
            g2d.drawRect(490,350,70,70);
            g2d.drawLine(200,200,400,100);
            g2d.drawLine(400,100,600,200);
            g2d.drawRect(530,120,40,80);
            g2d.drawRoundRect(560,100,30,30,30,30);
            g2d.drawRoundRect(575,85,30,30,30,30);
            g2d.drawRoundRect(590,70,30,30,30,30);
            g2d.drawRoundRect(600,65,30,30,30,30);
        }

        @Override
        public void paintComponent(Graphics g) {

            super.paintComponent(g);
            doDrawing(g);
        }
    }

    public static class BasicEx extends JFrame {

        public BasicEx() {

            initUI();
        }

        private void initUI() {

            add(new Surface());

            setTitle("Domek");
            setSize(1000, 1000);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

    }
}
