package learn0628;

import javax.swing.*;
import java.awt.*;

public class p12_4 {
	 public static void main(String[] args) {
	        var frame = new JFrame("GridLayoutDemo");
	        frame.setLayout(new GridLayout(2,4));
	        //向容器中添加8个按钮
	        for (int i = 1; i <= 8; i++) {
	            frame.add(new JButton("Button"+i));
	        }
	        frame.setSize(1300,150);
	        frame.setLocationRelativeTo(null);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);
	    }
}
