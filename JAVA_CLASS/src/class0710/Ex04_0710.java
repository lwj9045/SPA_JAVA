package class0710;

import java.util.*;

public class Ex04_0710 {

	public static void main(String[] args) {
		// ���ڸ��� 3���� �Է�,�Է��� �� ���� 0~9���� � ������ ���
		Scanner scan = new Scanner(System.in);

		int A = 0, B = 0, C = 0, total = 0, count = 0;
		int num[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		A = scan.nextInt();
		B = scan.nextInt();
		C = scan.nextInt();

		for (int i = 0; i < num.length; i++) {
			total = A * B * C;
			count = 0;
			while (total != 0) {

				if (total % 10 == num[i]) {
					count++;
				}
				total = total / 10;
			}

		System.out.println(count);
		}

	}

}
