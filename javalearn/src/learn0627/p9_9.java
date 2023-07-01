package learn0627;

import java.util.Scanner;

public class p9_9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int radius = 0, area = 0;
		System.out.println("请输入半径值：");
		try {
			radius = (int) input.nextDouble();
			if (radius < 0) {
				throw new NegativeValueException("半径值不能小于0");
			} else {
				area = (int) (Math.PI * radius * radius);
				System.out.println("圆形的面积是：" + area);
			}
		} catch (NegativeValueException e) {
			System.out.println(e.getMessage());
		}
	}
}