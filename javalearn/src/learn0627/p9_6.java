package learn0627;

public class p9_6 {
	static void method (int value) throws ArithmeticException, ArrayIndexOutOfBoundsException{
		if (value == 0) {
			System.out.println("无异常发生");
			return;
		}else if (value == 1) {
			int iArray[] = new int[4];
			iArray[4] = 3;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method(0);
			method(1);
			method(2); //该语句不能被执行
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("捕获到" + e);
		}finally {
			System.out.println("执行finally块.");
		}
		 
	}

}
