package gui;

import javax.swing.*;

public class MyFrame extends JFrame {
    public  MyFrame(){
        this.setBounds(100,100,300,300);
        this.setVisible(true);
    }//不带参数
    public MyFrame(String s){
        //自定义构造方法
        super(s);//调用父类JFrame传值s
        this.setBounds(100,100,300,300);//设置窗口位置
        this.setVisible(true);//带参数用重载
    }

}
