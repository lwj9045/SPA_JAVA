package class0703;

import java.util.Scanner;

public class Test0703 {

	public static void main(String[] args) {

		// �Է� �����߿��� ¦���� ��
		int num = 0, i = 0, sum1 = 0, sum2 = 0;
		Scanner scan = new Scanner(System.in);

		System.out.print("���� ���ڸ� �Է��ϼ���. ");
		num = scan.nextInt();

		// num = 4 01234
		for (i = 0; i <= num; i++) {
			if (i % 2 == 0) {
				sum1 += i;

			} else if (i % 2 != 0) {
				sum2 += i;
			}
		}
		System.out.println("¦������ : " + sum1);
		System.out.print("Ȧ������ : " + sum2);
	}

}