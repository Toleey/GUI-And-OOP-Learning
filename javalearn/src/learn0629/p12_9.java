package learn0629;

import javax.swing.*;

//GussNumber.java
public class p12_9 {

  public static void main(String[] args) {
      int magic = -1; //存放随机产生的整数
      int guess = -1; //存放用户猜的数
      String s = null;
      while (true){
          magic = (int)(Math.random()*100)+1;
          try{
              s = JOptionPane.showInputDialog(null,"请输入你猜的数(1-100)");
              if (s == null)  {
            	  System.exit(0); // 结束程序
            	  }
              guess = Integer.parseInt(s);
              while (guess != magic){

                  if (guess>magic) JOptionPane.showMessageDialog(null,"猜的数太大了！");
                  else JOptionPane.showMessageDialog(null,"猜的数太小了！");

                  s = JOptionPane.showInputDialog(null,"请输入你猜的数(1-100)");
                  guess = Integer.parseInt(s);
                  
              }
              int i = JOptionPane.showOptionDialog(null,"恭喜你! 猜对了！\n" + "继续猜吗？",
                      "是否继续",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,null,null);
              if (i != 1) continue;
              else break;
          }catch (NumberFormatException e){
              JOptionPane.showMessageDialog(null,"数字非法！");
              continue;
          }
      }//end while

  }
}

