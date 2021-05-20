package gui;

import javax.swing.*;
import javax.xml.crypto.Data;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

public class MyFrameDate<listener2> extends JFrame {
    JLabel dateLabel, randomPickLabel, resultlable, JTextFieldt1;
    JTextField t1 = new JTextField();


    public MyFrameDate() {
        this.setBounds(100, 100, 300, 300);
        this.setVisible(true);

    }

    public MyFrameDate(String s) {
        super(s);//调用父类JFrame传值s
        this.setBounds(100, 100, 300, 300);//设置窗口位置
        this.setVisible(true);//带参数用重载
    }

    public void showTime() {//增加布局
        FlowLayout layout = new FlowLayout();
        setLayout(layout);
        //设置对齐方式
        layout.setAlignment(FlowLayout.LEFT);
        JButton b1 = new JButton("显示时间");//创建按钮1
        this.add(b1);
        dateLabel = new JLabel("点击显示当前时间");
        add(dateLabel);


        JButton b2 = new JButton("随机点名");
        this.add(b2);
        randomPickLabel = new JLabel("点击显示当前学号");
        add(randomPickLabel);
        JTextField t1 = new JTextField();
        add(t1);
        JButton b3 = new JButton("求平方根");
        add(b3);
        resultlable = new JLabel("求平方根结果");
        add(resultlable);

        //添加监视器
        ActionListener listener1 = new ActionListener() {
            @Override//重写 有类与接口 在这是接口
            public void actionPerformed(ActionEvent e) {
//指定操执行的作方法
                showDate();
            }
        };
        b1.addActionListener(listener1);


        ActionListener listener2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                randomPick();
            }
        };
        b2.addActionListener(listener2);
        ActionListener listener3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                caculation();
            }
        };
        b3.addActionListener(listener3);
    }

    public void showDate() {//不返回任何值也要加void,构造方法外
        Date nowTime = new Date();
        dateLabel.setText(nowTime.toString());
    }

    public void randomPick() {
        Random random = new Random();//定义随机数。若只生成一次则Random random=new Random(44);
        int i = random.nextInt(36);//nextInt为生成随机数的代码，36为上限。
        if (i == 0 || i == 1) {
            randomPickLabel.setText("20203606130");
        } else if (i <= 10) {
            randomPickLabel.setText("20208117010" + i);
        } else {
            randomPickLabel.setText("2020811701" + i);
        }
    }
        public void caculation () {
            double d = Double.parseDouble(t1.getText());
            double result = Math.sqrt(d);
            resultlable.setText(String.valueOf(result));

        }
}
