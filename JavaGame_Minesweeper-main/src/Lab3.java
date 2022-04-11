import javax.swing.*;
import java.awt.*;
import static java.lang.StrictMath.pow;

class Okno {
    JFrame f;
    Lab3 p;
    public Okno(){
        f = new JFrame();
        Container c = f.getContentPane();
        c.setLayout(new BorderLayout());
        p = new Lab3();
        c.add(p);
        f.setSize(800,600);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

public class Lab3 extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        setBackground(Color.CYAN);
        double Px, Py;
        double Pxx, Pyy;
        double[] x = {54,54,54,57,57,48,48,39,39,161,161,151,151,141,141,256,256,255,255,254,254,268,268,267};
        double[] y = {357,372,372,78,78,66,66,54,54,186,186,198,198,210,210,88,88,73,73,58,58,373,373,358};

        double[] xx = {47,43,43,115,115,111,111,107,107,175,175,171,171,167,167,230,230,227,227,224,224,284,284,281};
        double[] yy = {48,33,33,281,281,296,296,311,311,82,82,67,67,52,52,271,271,286,286,301,301,31,31,46};
        g2.setColor(Color.yellow);
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(20f,
                BasicStroke.CAP_SQUARE,
                BasicStroke.JOIN_MITER,
                10));
        for(int i = 0; i <= 5; i++) {
            for(double t = 0; t <=1; t=t+0.001) {
                Px = pow(1-t,3) * x[4*i] + 3 * pow(1-t,2) * t * x[4*i+1] + 3 * (1-t) * pow(t,2) * x[4*i+2] + pow(t,3) * x[4*i+3];
                Py = pow(1-t,3) * y[4*i] + 3 * pow(1-t,2) * t * y[4*i+1] + 3 * (1-t) * pow(t,2) * y[4*i+2] + pow(t,3) * y[4*i+3];
                g2.drawLine((int)Px,(int)Py, (int)Px, (int)Py);
            }
        }
        for(int i = 0; i <= 5; i++) {
            for(double t = 0; t <=1; t=t+0.001) {
                Pxx = pow(1-t,3) * xx[4*i] + 3 * pow(1-t,2) * t * xx[4*i+1] + 3 * (1-t) * pow(t,2) * xx[4*i+2] + pow(t,3) * xx[4*i+3];
                Pyy = pow(1-t,3) * yy[4*i] + 3 * pow(1-t,2) * t * yy[4*i+1] + 3 * (1-t) * pow(t,2) * yy[4*i+2] + pow(t,3) * yy[4*i+3];
                g2.drawLine((int)Pxx+250,(int)Pyy+50, (int)Pxx+250, (int)Pyy+50);
            }
        }
    }
}