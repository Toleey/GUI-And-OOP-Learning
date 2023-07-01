package learn0630;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class calculator {
    private JFrame jFrme;
    private JPanel jPanel1, jPanel2;
    private JTextField jTextField;
    private JButton[] jButtonArray;
    private JButton jButton;
    private String str0 = "0";
    private String flag = null;
    private double s1 = 0.0;
    private double s2 = 0.0;


    public calculator() {

        jFrme = new JFrame("简易计算器");
        jPanel1 = new JPanel(); //第一个panel（面板）
        jTextField = new JTextField(14);//文本框
        jButtonArray = new JButton[16];//按钮数组
        jButton = new JButton("C");//按钮
        String s = "123+456-789*0.=/";//按钮上的名字
        for (int i = 0; i < jButtonArray.length; i++) {
            jButtonArray[i] = new JButton(s.substring(i, i + 1));
        }
        init();
        cal();
    }

    private void init() { //初始化
        jPanel1.setLayout(new FlowLayout());//设置布局
        jPanel1.add(jTextField);
        jPanel1.add(jButton);
        jTextField.setEditable(true);

        jTextField.setText("0");
        jPanel2 = new JPanel();
        jPanel2.setLayout(new GridLayout(4, 4));
        for (int i = 0; i < jButtonArray.length; i++) {
            jPanel2.add(jButtonArray[i]);
        }
        jFrme.add(jPanel1, BorderLayout.NORTH);
        jFrme.add(jPanel2, BorderLayout.CENTER);
    }

    public void show() {
        jFrme.setVisible(true);
        jFrme.setSize(552, 420);
        jFrme.setLocation(200, 200);
        jFrme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setFontAndColor();
    }

    private void setFontAndColor() { //设置字体和颜色
        jTextField.setFont(new Font("楷体", Font.BOLD, 14));
        jButton.setBackground(new Color(128, 198, 077));
        jPanel1.setBackground(Color.DARK_GRAY);
        for (int i = 0; i < jButtonArray.length; i++) {
            jButtonArray[i].setBackground(Color.gray);
        }
    }

    public void cal() { //计算
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = e.getActionCommand();
                if (str.equals("C")) {
                    str0 = "0";
                    s1 = 0.0;
                    s2 = 0.0;
                    flag=null;
                    jTextField.setText(str0);
                }
            }
        });
        for (int i = 0; i < jButtonArray.length; i++) {
            jButtonArray[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // 拿到按钮上的名字
                    String str = e.getActionCommand();
                    if (str.equals("+")) {
                        s2=s1;
                        s1=0.0;
                        str0 = "0";
                        flag="+";
                        s1=s2+s1;
                    } else if (str.equals("-")) {
                        s2=s1;
                        s1=0.0;
                        str0 = "0";
                        flag="-";
                        s1=s2-s1;
                    } else if (str.equals("*")) {
                        s2=s1;
                        s1=1;
                        str0 = "0";
                        flag="*";
                        s1=s2*s1;
                    } else if (str.equals("/")) {
                        s2=s1;
                        s1=1;
                        str0 = "0";
                        flag="/";
                        s1=s2/s1;
                    } else if (str.equals("=")) {
                        if(flag.equals("+")){
                            s1=s2+s1;
                        }else if(flag.equals("-")){
                            s1=s2-s1;
                        }else if(flag.equals("*")){
                            s1=s2*s1;
                        }else if(flag.equals("/")){
                            s1=s2/s1;
                        }else{
                        }
                        flag=null;
                        str0 ="0";
                    } else {
                        str0 = str0 + str;
                        s1=Double.parseDouble(str0);
                    }
                    jTextField.setText(s1+"");
                }
            });
        }

    }

    public static void main(String[] args) {
        new calculator().show();
    }

}
