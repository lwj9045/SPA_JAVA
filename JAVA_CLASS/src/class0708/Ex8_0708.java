package class0708;

import java.util.*;

public class Ex8_0708 {

	public static void main(String[] args) {
		// ���ٿ� ����
		Scanner scan = new Scanner(System.in);
		int user_num = 0, count = 0, ran_num = 0;
		boolean run = true;

		System.out.println("Up&Down ����");
		ran_num = (int) (Math.random() * 100) + 1; // 1~100

		while (run) {
			System.out.print("1���� 100 ������ ���� �Է��ϼ��� : ");
			user_num = scan.nextInt();
			count++;
			if (user_num > ran_num) {
				System.out.println("Down");
			} else if (user_num < ran_num) {
				System.out.println("Up");
			} else {
				run = false;
				System.out.println("����");
				System.out.println("�õ�Ƚ���� " + count + " �Դϴ�. ");
			}

		}

	}

}
