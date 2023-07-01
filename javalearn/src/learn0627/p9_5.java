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
					result = a/b; //����ArithmeticException
				}else {
					letter[5] = 'X'; //����ArrayIndexOutOfBoundsException
				}
				//���ﲶ�����쳣
			} catch (ArithmeticException | ArrayIndexOutOfBoundsException me) {
				// TODO: handle exception
				System.out.println("�����쳣��" + me);
			}
		}
		 System.out.println("������ز���֮��.");
	}

}
