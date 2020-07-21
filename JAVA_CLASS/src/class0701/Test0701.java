package class0701;

import java.util.Scanner;

public class Test0701 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = 0;

		System.out.println("절대값으로 표현 할 수를 입력하세요 . ");
		num = scan.nextInt();

		if (num < 0) {
			num = num * -1;
			System.out.println(num);
		} else {
			System.out.println(num);
		}
		scan.close();
	}
}
