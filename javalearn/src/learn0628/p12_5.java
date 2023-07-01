package learn0628;

import javax.swing.*;
import java.awt.*;

public class p12_5 extends JFrame {
	
    public p12_5(String title){
        super(title);
        JPanel panel1 = new JPanel(), panel2 = new JPanel();
        panel1.setBackground(Color.CYAN);
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER,20,10));
        panel2.add(new JButton("红色"));
        panel2.add(new JButton("绿色"));
        panel2.add(new JButton("蓝色"));
        panel2.add(new JButton("黄色"));
        add(panel1,BorderLayout.CENTER);
        add(panel2,BorderLayout.PAGE_END);
        setSize(350,150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        var frame = new p12_5("FrameAndPanel");
    }
	
}
