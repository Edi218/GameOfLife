import javax.swing.*;

public class GUI {
    JFrame gameFrame;
    public static DrawGame draw;


    public static final int WIDTH = 800, HEIGHT = 800, XOFFSET = 10, YOFFSET = 10;

    public void createFrame(){
        gameFrame = new JFrame("Game Of Life");
        gameFrame.setSize(850, 850);
        gameFrame.setResizable(false);

        draw = new DrawGame();
        draw.setBounds(0, 0, 850, 850);
        draw.setVisible(true);

        gameFrame.add(draw);
        gameFrame.setVisible(true);
    }
}
