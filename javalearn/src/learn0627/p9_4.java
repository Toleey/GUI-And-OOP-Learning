package learn0627;

public class p9_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入一个字符");
		try {
			char c = (char) System.in.read();
			System.out.println("c = "+ c);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		 
	}

}
