package learn0628;

import javax.swing.*;

public class p12_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    var frame = new JFrame("HelloWorldSwing");
	        var label = new JLabel("第一个Swing程序.",SwingConstants.CENTER);
	        frame.setSize(300,100);
	        frame.add(label);//将标签添加到容器中
	        frame.setLocationRelativeTo(null);//窗口在屏幕上居中显示
	        frame.setVisible(true);//设置窗口可见
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //关闭窗口终止应用程序
	}

}
