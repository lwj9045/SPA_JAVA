package class0713;

import java.util.*;

public class Ex01_0713 {

	public static void main(String[] args) {
		// ���� 10�� �־�����(39,40,41,42,43,44,82,83,84,85)
		// 42�� �������� ��, ���� �ٸ� �������� �� �� �ִ��� ���
		Scanner scan = new Scanner(System.in);
		int num[] = new int[10];
		int count = 1; // ũ�� = 10

		System.out.println("���� 10���� �Է��ϼ��� : ");
		for (int i = 0; i < num.length; i++) {
			num[i] = scan.nextInt();
		}

		for (int i = 0; i < num.length; i++) {
			num[i] = num[i] % 42;
//			System.out.println("������ �� : " + num[i]);
		}
		// 0,1~0,9 / 1,2~1,9 / 8,9
		Arrays.sort(num);
		for (int i = 0; i < 10; i++) {
			System.out.println(num[i]);
		}
		for (int j = 1; j < num.length; j++) {
			if (num[j - 1] != num[j]) {
				count++;
			}
		}

		System.out.println("���δٸ� ������ : " + count);

	}

}
