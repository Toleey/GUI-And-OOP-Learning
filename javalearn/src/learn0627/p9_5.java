package learn0627;

public class p9_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 88, b = 0;
		int result;
		char [] letter = {'A','B','C'};
		for (int i = 0; i < 2; i++) {
			try {
				if (i == 0) {
					result = a/b; //产生ArithmeticException
				}else {
					letter[5] = 'X'; //产生ArrayIndexOutOfBoundsException
				}
				//这里捕获多个异常
			} catch (ArithmeticException | ArrayIndexOutOfBoundsException me) {
				// TODO: handle exception
				System.out.println("捕获到异常：" + me);
			}
		}
		 System.out.println("处理多重捕获之后.");
	}

}
