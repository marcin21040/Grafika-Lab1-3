import javax.swing.*;
import java.awt.*;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Wybierz 1 - Lab1 , 2 - Lab2 ,3 - Lab3:");
        switch (sc.nextInt())
        {
            case 1:
                EventQueue.invokeLater(new Runnable() {

                    @Override
                    public void run() {
                        Lab1.BasicEx ex = new Lab1.BasicEx();
                        ex.setVisible(true);
                    }
                });
                break;

            case 2:
                JFrame w = new JFrame("Saper");
                w.setResizable(false);
                w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                w.add(new Lab2());
                w.pack();
                w.setLocationRelativeTo(null);
                w.setVisible(true);
                break;
            case 3:
                Okno o = new Okno();
                break;
        }

    }
}
