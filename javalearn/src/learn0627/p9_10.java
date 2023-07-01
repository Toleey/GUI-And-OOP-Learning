package learn0627;

public class p9_10 {
	public static class MismatchedArrayException extends Exception {
		int x =0, y=0;
		public MismatchedArrayException(int x,int y) {
			this.x =x;
			this.y = y;
		}
		@Override
		public String toString() {
			return "数组大小不同，第一个数组大小是"+x+",第二个数组大小是"+y+".";
		}
	}
	
	public static long[] addArray(int [] array1, int[] array2) throws MismatchedArrayException, NullPointerException {
		if (array1.length != array2.length) {
			throw new MismatchedArrayException(array1.length, array2.length);
		}
		if (array1 == null || array2 == null) {
			throw new NullPointerException();
		}
		var result = new long[array1.length];
		for (int i = 0; i < array1.length; i++) {
			result[i] = array1[i] + array2[i];
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int []a = new int[] {1,2,3};
		int []a = new int[] {1,2,3,4,5};
		int []b = new int[] {1,2,3,5,6};
		//int []b = null;
		long []result;
		try {
			result = addArray(a, b);
			for (var n : result) {
				System.out.println(n);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
		 
	}

}
