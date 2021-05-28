package gui.sin;

import gui.MyFrame;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class MyFrameSin extends MyFrame {
    GraphicPanel graphicPanel = new GraphicPanel();
    JSpinner grainField = new JSpinner(new SpinnerNumberModel(10, 1, 200, 5));//定义一个按键 依次有初始值最小值最大值以及每一次跳跃多少
    JSpinner rangeField = new JSpinner(new SpinnerNumberModel(10, 1, 200, 5));//定义一个按键 依次有初始值最小值最大值以及每一次跳跃多少
    JSpinner freqField = new JSpinner(new SpinnerNumberModel(10, 1, 200, 5));//定义一个按键 依次有初始值最小值最大值以及每一次跳跃多少
    JSpinner removeField = new JSpinner(new SpinnerNumberModel(10, 1, 200, 5));
    public MyFrameSin(String title) {
        //构造函数
        super(title);
        add(graphicPanel);
        graphicPanel.add(new JLabel("力度"));
        graphicPanel.add(grainField);
        graphicPanel.add(new JLabel("幅度"));
        graphicPanel.add(rangeField);
        graphicPanel.add(new JLabel("频率"));
        graphicPanel.add(freqField);
        graphicPanel.add(new JLabel("位移"));
        graphicPanel.add(removeField);

        //添加监视器
        ChangeListener listener = new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                updateUI();
            }
        };
        grainField.addChangeListener(listener);
        rangeField.addChangeListener(listener);
        freqField.addChangeListener(listener);
        removeField.addChangeListener(listener);
    }


    void updateUI() {
            graphicPanel.grain = (Integer) grainField.getValue();//从grainField中取出数给grain
            graphicPanel.range = (Integer) rangeField.getValue();
            graphicPanel.freq = (Integer) freqField.getValue();
            graphicPanel.remove = (Integer) removeField.getValue();
            graphicPanel.repaint();//重画
        }
    }

