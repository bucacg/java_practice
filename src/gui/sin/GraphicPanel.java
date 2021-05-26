package gui.sin;

import javax.swing.*;
import java.awt.*;

public class GraphicPanel extends JPanel {
    protected void paintComponent(Graphics g){
        g.setColor(Color.RED);
        g.clearRect(0,0,100,50);
        g.fillRect(200,100,50,60);
        g.drawLine(0,0,200,100);

    }
}
