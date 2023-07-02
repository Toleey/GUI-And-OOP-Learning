package learn0630;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

public class p12_11 extends JFrame implements ActionListener {
    JButton [][]cells = new JButton[8][8];
    boolean [][]ok= new boolean[8][8];
    
    private int flag = 0;//做个皇后记录
    private int trueNum = 0;//正确记录
    
    public p12_11(String title){
        super(title);
        setLayout(new GridLayout(8,8,0,0));
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                ok[i][j] = true;
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                cells[i][j] = new JButton();
                cells[i][j].addActionListener(this);
                if ((i+j)%2 == 0 ){
                    cells[i][j].setBackground(Color.WHITE);
//                    cells[i][j].setOpaque(true);
                    cells[i][j].setBorderPainted(false);
//                    cells[i][j].setText("白色");
                    //https://stackoverflow.com/questions/1065691/how-to-set-the-background-color-of-a-jbutton-on-the-mac-os
                }else {
//                    getContentPane().setBackground(Color.WHITE);
                    cells[i][j].setBackground(Color.BLACK);
                    cells[i][j].setOpaque(true);
                    cells[i][j].setBorderPainted(false);
//                    cells[i][j].setText("黑色");
                }
                add(cells[i][j]);
            }
        }
        setSize(350,350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((JButton)e.getSource() == cells[i][j]){
                    if (ok[i][j]){
                        cells[i][j].setIcon(new ImageIcon("src/learn0630/images/queen.png"));
                        ok[i][j] = false;
                        
             
                        
                        flag=flag+1;//判断当前放了几个皇后
//                        System.out.println(flag);
                        if (flag>=8) {
//                        	JOptionPane.showMessageDialog(null,"恭喜你成功了！,下次再来！");
//                        	System.exit(0);
                        	int a = JOptionPane.showOptionDialog(null,"恭喜你成功了！\n" + "继续猜吗？",
                                     "是否继续",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,null,null);
                        	 if (a != 1) {
                        		 flag=0;
                        		 trueNum=0;
                        		 main(null);
                        		 }
                        	 if (a == 1) System.exit(0); 
						}
                        
                        
                        for (int r = 0; r < 8; r++) {
                            ok[r][j] = false;
                        }
                        for (int c = 0; c < 8; c++) {
                            ok[i][c] = false;
                        }
                        for (int r = i, c = j; r >= 0 && c >= 0; r--, c--) {
                            ok[r][c] = false;
                        }
                        for (int r = i, c = j; r < 8 && c < 8; r++, c++) {
                            ok[r][c] = false;
                        }
                        for (int r = i, c = j; r >= 0 && c < 8; r--, c++) {
                            ok[r][c] = false;
                        }
                        for (int r = i, c = j; r < 8 && c >= 0; r++, c--) {
                            ok[r][c] = false;
                        }
                        
                        //遍历看看还有几个位置（True）
                        for (int k = 0; k < 8; k++) {
 							for (int l = 0; l < 8; l++) {
 								System.out.print(ok[k][l]+" ");
 								if (ok[k][l] == true) {
 									trueNum+=1;
 								}
 							}
 							System.out.println();
 						}
                         System.out.println("_");
                         System.out.println(trueNum);
                         if (trueNum == 0) {
                        	 int a = JOptionPane.showOptionDialog(null,"傻瓜，你失败了！\n" + "继续猜吗？",
                                     "是否继续",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,null,null);
							 if (a != 1) {
								 flag=0;
                        		 trueNum=0;
                        		 main(null);
                        		 }
                        	 if (a == 1) System.exit(0);
						}else {
							trueNum=0;
						}
                         
                         
                    }else {
                        JOptionPane.showMessageDialog(null,"此处不能放置皇后");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        var frame = new p12_11("八皇后问题解");
    }
}
