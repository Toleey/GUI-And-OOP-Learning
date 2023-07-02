package learn0628;

import javax.swing.*;
import java.awt.*;
import java.lang.invoke.VarHandle;

public class p12_4t1 {

    public static void sixButtons(){
        var frame = new JFrame("6按钮");
        frame.setLayout(new GridLayout(2,3));
        //向容器中添加6个按钮
        for (int i = 1; i <= 6; i++) {
            frame.add(new JButton("Button"+i));
        }
        frame.setSize(300,150);
        frame.setLocation(320,10);
//        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public static void sixButtons2(){
        var frame = new JFrame("三行两列6按钮");
        frame.setLayout(new GridLayout(3,1));
        //向容器中添加6个按钮
        for (int i = 1; i <= 6; i++) {
            frame.add(new JButton("Button"+i));
        }


        frame.setSize(300,150);
        frame.setLocation(320,190);
//        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void tenButtons(){
        var frame = new JFrame("10按钮");
        frame.setLayout(new GridLayout(4,3));
        //向容器中添加10个按钮
        for (int i = 1; i <= 10; i++) {
            frame.add(new JButton("Button"+i));
        }
        frame.setSize(400,150);
        frame.setLocation(630,10);
//        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public static void tenButtons2(){
        var frame = new JFrame("五行两列10按钮");
        frame.setLayout(new GridLayout(5,2));
        //向容器中添加10个按钮
        for (int i = 1; i <= 10; i++) {
            frame.add(new JButton("Button"+i));
        }
        frame.setSize(400,150);
        frame.setLocation(630,190);
//        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void old(){
        var frame = new JFrame("原8按钮");
        frame.setLayout(new GridLayout(3,2));
        //向容器中添加8个按钮
        for (int i = 1; i <=8; i++) {
            frame.add(new JButton("Button"+i));
        }
        frame.setSize(300,150);
        frame.setLocation(10,10);
//        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        sixButtons();
        sixButtons2();
        tenButtons();
        tenButtons2();
        old();

    }
}
