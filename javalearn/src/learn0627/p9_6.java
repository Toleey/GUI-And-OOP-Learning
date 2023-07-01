package learn0627;

public class p9_6 {
	static void method (int value) throws ArithmeticException, ArrayIndexOutOfBoundsException{
		if (value == 0) {
			System.out.println("���쳣����");
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
			method(2); //����䲻�ܱ�ִ��
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("���񵽣�" + e);
		}finally {
			System.out.println("ִ��finally��.");
		}
		 
	}

}
