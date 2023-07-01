package learn0628;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;import java.awt.GridBagConstraints;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class practice extends JFrame{

	public practice(String title) {
		super(title);
		setSize(400,300);
		Container container=getContentPane();
		container.setLayout(null);
		
		JPanel panel1=new JPanel();
		panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel1.add(new JLabel("当前打印机为： Canon LBP34107 /3460"));
		
		JPanel panel2=new JPanel();
		panel2.setLayout(new GridLayout(4,1,15,15));
		JButton[] buttons= {
				new JButton("确定"),
				new JButton("取消"),
				new JButton("设置..."),
				new JButton("帮助")
		};
		int maxWidth=0;
		int i;
		for(i=0;i<buttons.length;i++) {
			panel2.add(buttons[i]);
		}
		
		JPanel panel3=new JPanel();
		panel3.add(new JLabel("打印质量:"));
		panel3.setLayout(new FlowLayout(FlowLayout.LEFT));
		JComboBox jComboBox=new JComboBox();
		jComboBox.addItem("高");
		jComboBox.addItem("中");
		jComboBox.addItem("低");
		jComboBox.setSelectedIndex(0);
		panel3.add(jComboBox);
		panel3.add(new JCheckBox("打印到文件"));
		
		JPanel panel4=new JPanel();
		panel4.setLayout(new GridLayout(3,1,15,15));
		panel4.add(new JCheckBox("图像"));
		panel4.add(new JCheckBox("文本",true));
		panel4.add(new Checkbox("编码"));
		
		JPanel panel5=new JPanel();
		panel5.setLayout(new GridLayout(3,1,15,15));
		ButtonGroup rGroup=new ButtonGroup();
		JRadioButton[] radioButtons= {
				new JRadioButton("所选区域"),
				new JRadioButton("全部",true),
				new JRadioButton("Applet")
		};
		for(i=0;i<radioButtons.length;i++) {
			rGroup.add(radioButtons[i]);
			panel5.add(radioButtons[i]);
		}
		
		JPanel panel6=new JPanel();
		panel6.setBackground(Color.YELLOW);
		panel6.setLayout(new FlowLayout(FlowLayout.LEFT,30,5));
		panel6.add(panel4);
		panel6.add(panel5);
		
		JPanel panel7=new JPanel();
		panel7.setLayout(new BorderLayout());
		panel7.add(panel1,"North");
		panel7.add(panel6,"Center");
		panel7.add(panel3,"South");
		panel7.setBorder(BorderFactory.createLineBorder(Color.RED,2));
		
		JPanel panel8=new JPanel();
		panel8.setLayout(new BorderLayout());
		panel8.add(panel7,"West");
		panel8.add(panel2,"Center");
		panel8.setBorder(BorderFactory.createLineBorder(Color.BLUE,2));
		
		setContentPane(panel8);
	}
	
	public static void main(String[] args) {
		practice f=new practice("复杂界面布局示例");
		f.setVisible(true);
	}

}
