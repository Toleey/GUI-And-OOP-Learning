package learn0627;

import java.io.IOException;

public class p9_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("请输入一个字符");
		char c = (char) System.in.read();// 该行发生变异错误
		System.out.println("c = " + c);
		 
	}

}
