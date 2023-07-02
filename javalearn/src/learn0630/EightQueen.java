package learn0630;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class EightQueen extends JFrame {
	JButton[][] cells = new JButton[8][8];//按钮
	boolean [][] ok = new boolean[8][8];//每个空可放东西
	//添加记录---记录放置皇后次数
	int flag=0;
	//错误记录
	private int falseNum=0;
	//定义有参构造方法
	public EightQueen(String title) {
		super(title);
		setLayout(new GridLayout(8,8,0,0));
		for(int i = 0;i < 8;i++) {
			for(int j = 0;j<8;j++) {
				ok[i][j] = true;
			}
		}
		for(int i = 0;i<8;i++) {
			for(int j = 0;j<8;j++) {
				cells[i][j] = new JButton();
				cells[i][j].addActionListener(new Handler(i,j));//添加监听器
				if((i+j)%2 == 0) {
					cells[i][j].setBackground(Color.white);
			}else{
				cells[i][j].setBackground(Color.red);
				
			}
			add(cells[i][j]);
			//调用辅助函数
//			cells[i][j].addActionListener(new Handler(i,j));
			
		}
		
	}
		setSize(350,350);
		setLocationRelativeTo(null);//不对位置进行设置，即居中
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置可关闭操作
		setVisible(true);
		}
	class Handler implements ActionListener{
		 
		private int i,j;
		public Handler(int row,int col){
			i=row;
			j=col;
		}
		
		public void paint(int i,int j){
			//水平线变橙色
			for(int x=0;x<8;x++){
				cells[x][j].setBackground(Color.orange);
			}
			//竖直线变橙色
			for(int y=0;y<8;y++){
				cells[i][y].setBackground(Color.orange);
			}
			//斜线上变橙色
			for(int x=0;x<8;x++){
				for(int y=0;y<8;y++){
					if(Math.abs(x-i)==Math.abs(y-j)){
						cells[x][y].setBackground(Color.orange);
					}
				}
			}
		}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for(int i = 0; i<8 ;i++) {
			for(int j = 0;j<8;j++) {
				if((JButton)e.getSource() == cells[i][j]) {
					if(ok[i][j]) {
						//调用paint函数——即点过方格所在行列变为固定颜色，提示玩家不可以再放入皇后
						paint(i,j);
						//添加图片
						cells[i][j].setIcon(new ImageIcon("images\\yyqx.jpg"));
						ok[i][j] = false;
//						判断当前放置了几个皇后
						flag=flag+1;
						if(flag>=8) {
//							int a=JOptionPane.showOptionDialog(null, "恭喜你成功了！", null, null, null, null, null, null);
							int a = JOptionPane.showOptionDialog(null,"恭喜你成功了！\n" + "继续猜吗？",
                                    "是否继续",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,null,null);
							if(a!=1) {
								flag=0;
								falseNum=0;
								main(null);
							}
							else if(a==1) {
								System.exit(0);
							}
						}
						for(int r = 0;r<8;r++) {
							ok[r][j] = false;
						}
						for(int c = 0;c<8;c++) {
							ok[i][c] = false;
						}
						for(int r = i,c = j;r>=0&&c>=0;r--,c--) {
							ok[r][c] = false;
						}
						for(int r = i,c = j;r<8&&c<8;r++,c++) {
							ok[r][c] = false;
						}
						for(int r = i,c = j;r>=0&&c<8;r--,c++) {
							ok[r][c] = false;
						}
						for(int r = i,c = j;r<8&&c>=0;r++,c--) {
							ok[r][c] = false;
						}
						
						//使用遍历，看看还有几个位置（true）
						for (int k = 0; k < 8; k++) {
					        for (int l = 0; l < 8; l++) {
					         System.out.print(ok[k][l]+" ");
					         if (ok[k][l] == true) {
					          falseNum+=1;
					         }
					        }
					        System.out.println();
					       }
					                         System.out.println("_");
					                         System.out.println(falseNum);
					                         if (falseNum == 0) {
					                          int a = JOptionPane.showOptionDialog(null,"你失败了哦...\n" + "继续猜吗？",
					                                     "是否继续",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,null,null);
					        if (a != 1) {
					         flag=0;
					                           falseNum=0;
					                           main(null);
					                           }
					                          if (a == 1) System.exit(0);
					      }else {
					       falseNum=0;
					      }
						
						
						
					}else {
						JOptionPane.showMessageDialog(null, "这里不能放皇后!");
					}
				}
			}
		}
	}
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		EightQueen title = new EightQueen("八皇后问题解决⭐");
	}

}
