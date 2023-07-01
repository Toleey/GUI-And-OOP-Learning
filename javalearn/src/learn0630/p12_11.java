package learn0630;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class p12_11 extends JFrame implements ActionListener {
    JButton [][]cells = new JButton[8][8];
    boolean [][]ok= new boolean[8][8];
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
