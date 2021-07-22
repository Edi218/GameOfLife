import javax.swing.*;
import java.awt.*;

public class DrawGame extends JLabel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);

        g.setColor(Color.BLUE);
        g.drawRect(9, 9, GUI.WIDTH + 2, GUI.HEIGHT + 2);

        for (int x = 0; x < GameLogics.CELLS; x++) {
            for (int y = 0; y < GameLogics.CELLS; y++) {
                if(GameLogics.cells[x][y]){
                    g.setColor(Color.GREEN);
                    g.drawRect(x + GUI.XOFFSET, y + GUI.YOFFSET, 1, 1);
                } else {
                    g.setColor(Color.RED);
                    g.drawRect(x + GUI.XOFFSET, y + GUI.YOFFSET, 1, 1);
                }
            }
        }

        repaint();
    }
}
