package class0709;

import java.util.*;

public class Ex03_0709 {
	// 5�� �Է� �ް� �� �Է°����� ����, ��� ���ϱ�
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int i = 0, sum = 0, avg = 0;
//		int user_num[] = new int[5]; // ũ�Ⱑ 5
		int user_num[];
		user_num = new int[5];

		for (i = 0; i < user_num.length; i++) {
			user_num[i] = scan.nextInt();
			sum += user_num[i];
		}
		avg = sum / user_num.length;
		System.out.println("�Էµ� ������ �� ���� : " + sum);
		System.out.println("�Էµ� ������ ����� : " + avg);
	}

}
