package gui;

import gui.sin.MyFrameSin;

import java.util.Calendar;

public class FrameDemo {
    public static void main(String[] args) {

        //frame1.setLocation(100,100);//设置窗口位置
        MyFrameDate frame1 = new MyFrameDate("第一个窗口");
        frame1.showTime();

        MyFrameDate.CalendarBean cb = new MyFrameDate.CalendarBean();
        cb.setYear(2021);
        cb.setMonth(5);
        String[] a = cb.getCalendar();//返回号码的一堆数组
        char[] str = "日 一 二 三 四 五 六".toCharArray();
        for (char c : str) {
            System.out.printf("%3c", c);
        }
        for (int i = 0; i < a.length; i++) {//输出数组a
            if (i % 7 == 0) ;
            System.out.println(" ");//换行
            System.out.printf("%4s", a[i]);
        }

        MyFrameSin frameSin = new MyFrameSin("正弦函数");

    }
}