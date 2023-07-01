package learn0627;

public class p9_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a = new int[5];
		try {
			System.out.println(a[5]);//�׳��쳣
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());//�����쳣
		}
		System.out.println("������������");
	}

}
