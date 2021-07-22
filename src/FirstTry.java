import java.awt.*;
import javax.swing.*;

public class FirstTry extends JPanel {

    private Field[] fields = new Field[64];
    private boolean[] alive = new boolean[64];
    private JPanel Gameboard = new JPanel();


    @Override
    public void paint(Graphics g) {
        Gameboard.setBounds(0, 0, 800, 800);
        Gameboard.setBackground(Color.WHITE);

        /*
          set Field coordinates
        */

        for (int i = 0; i < fields.length; i++) {
            g.setColor(Color.BLACK);
            g.drawRect(fields[i].getX(), fields[i].getY(), 100, 100);
        } // end of for

        for (int i = 0; i < alive.length; i++) {
            if (fields[i].getX() == 0 || fields[i].getY() == 0 || fields[i].getX() == 800 || fields[i].getY() == 800) {
                alive[i] = false;
            } else if (fields[i].getX() % 2 == 0 && fields[i].getY() % 3 == 0) {
                alive[i] = true;
            } else {
                alive[i] = false;
            } // end of if-else
        } // end of for
    }

    public void nextGeneration() {
        for (int i = 0; i < fields.length; i++) {
            /*
              check neighbors;
            */
        } // end of for
    }

    public void redraw(Graphics g) {

    }

    public static void main(String[] args) {
        FirstTry game = new FirstTry();
    }
}
