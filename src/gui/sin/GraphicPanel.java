package gui.sin;

import javax.swing.*;
import java.awt.*;

public class GraphicPanel extends JPanel {
    int height=this.getHeight();
    int width=this.getWidth();
    int  grain=10;
    int  range=60;
    int  freq=2;
    int remove=5;

    protected void paintComponent(Graphics g) {
        int height = this.getHeight();//局部变量
        int width = this.getWidth();//局部变量


        g.setColor(Color.RED);
        g.clearRect(0,0,width,height);
        //g.drawRect(0,0,30,60);
        //g.clearRect(0,0,100,50);
        //g.fillRect(200,100,50,60);
        //g.drawLine(0,0,200,100);


        //画出一条中间坐标轴线
        g.drawLine(0, height / 2, width, height / 2);
        int center = height / 2;
        int x1 = 0, y1 = center, x2 = 0, y2 = 0;
        for (int i = 0; i <= width; i+=grain) {//平滑力度i+=grain
            x2 = i;
            y2 = (int) (range*Math.sin(Math.toRadians(x2*freq+remove))+center);//100调幅度，x2*2调频率，Math.toRadians(x2*2)将括弧内的值转化为弧度值，
            g.drawLine(x1, y1, x2, y2);
            x1 = x2;
            y1 = y2;
        }
    }
}
