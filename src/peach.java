import javax.swing.*;
import java.awt.*;

public class peach extends JPanel {

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.white);

        g.setColor(Color.BLUE);
        g.fillRect(25,25,100,30);

        g.setColor(Color.CYAN);
        g.drawString("Testing",25,120);

        g.setColor(Color.BLACK);
        g.draw3DRect(50,50,100,30,true);

    }
}
