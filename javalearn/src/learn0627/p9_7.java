package learn0627;

import java.io.IOException;

public class p9_7 {
	
	public static void method() throws IOException {
		try {
			throw new IOException("�ļ�δ�ҵ�"); //�׳�һ���쳣ʵ��
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("�����쳣");
			throw e;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method();
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("�ٴβ���" + e);
		}
		 
	}

}
