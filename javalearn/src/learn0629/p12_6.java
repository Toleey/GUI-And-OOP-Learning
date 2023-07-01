package learn0629;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author toby
 *	ActionEventDemo.java
 */
public class p12_6 {
    JLabel jLabel = new JLabel("请单击按钮.",SwingConstants.CENTER);
    JButton btn1 = new JButton("OK"), btn2 = new JButton("Cancel");
    JPanel jp = new JPanel();

    public p12_6() {
        var frame = new JFrame("动作事件");
        frame.add(jLabel, BorderLayout.CENTER);
        jp.add(btn1);
        jp.add(btn2);
        frame.add(jp, BorderLayout.PAGE_END);
        var listener = new ButtonClickListener();
        btn1.addActionListener(listener);//为按钮注册监听器
        btn2.addActionListener(listener);//为按钮注册监听器
        frame.setSize(300, 100);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    //定义内部类，实现ActionListener接口
    public class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if ((JButton) e.getSource() == btn1) {
                jLabel.setText("你单击了‘确定’按钮"); //修改标签的内容
            } else if ((JButton) e.getSource() == btn2) {
                jLabel.setText("你单击了‘取消’按钮");
            }
        }

    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new p12_6(); //在事件分派线程中创建界面
            }
        });
    }
}
