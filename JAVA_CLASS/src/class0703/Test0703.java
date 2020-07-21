package class0703;

import java.util.Scanner;

public class Test0703 {

	public static void main(String[] args) {

		// 입력 숫자중에서 짝수의 합
		int num = 0, i = 0, sum1 = 0, sum2 = 0;
		Scanner scan = new Scanner(System.in);

		System.out.print("더할 숫자를 입력하세요. ");
		num = scan.nextInt();

		// num = 4 01234
		for (i = 0; i <= num; i++) {
			if (i % 2 == 0) {
				sum1 += i;

			} else if (i % 2 != 0) {
				sum2 += i;
			}
		}
		System.out.println("짝수합은 : " + sum1);
		System.out.print("홀수합은 : " + sum2);
	}

}