package class0701;

import java.util.Scanner;

public class Test0701 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = 0;

		System.out.println("���밪���� ǥ�� �� ���� �Է��ϼ��� . ");
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
