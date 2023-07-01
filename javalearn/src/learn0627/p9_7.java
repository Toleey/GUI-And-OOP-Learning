package learn0627;

import java.io.IOException;

public class p9_7 {
	
	public static void method() throws IOException {
		try {
			throw new IOException("文件未找到"); //抛出一个异常实例
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("捕获到异常");
			throw e;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method();
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("再次捕获" + e);
		}
		 
	}

}
