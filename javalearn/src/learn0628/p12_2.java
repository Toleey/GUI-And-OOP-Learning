package learn0628;

import javax.swing.*;
import java.awt.*;

public class p12_2 {
	public static void main(String[] args) {
        var frame = new JFrame("FlowLayoutDwmo");
        //创建一个FlowLayout对象
        var layout = new FlowLayout(FlowLayout.CENTER,10,20);
        frame.setLayout(layout);//设置容器的布局管理器
        frame.add(new JButton("Button 1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("Button 3"));
        frame.add(new JButton("Long-Named Button 4"));
        frame.add(new JButton("Button 5"));
        frame.setSize(300,150);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

