package class0714;

import java.util.*;

public class Ex02_0714 {

	public static void main(String[] args) {
		// ������ �������� ���α׷�
		// 1. �л��� �迭����
		// 2. �л��������� ���� �Է�
		// 3. ��������Ʈ - ���
		// 4. �м� - �ְ�����, �������, �������� ����
		// 5. ����
		Scanner scan = new Scanner(System.in);
		int stu_data[] = null, user_num = 0, user_data = 0, save = 0, sum = 0, score_avg = 0;
		boolean run = true;

		while (run) {
			System.out.println("------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.���� ");
			System.out.println("------------------------------------------");
			System.out.print("���� > ");
			user_num = scan.nextInt();

			switch (user_num) {
			case 1:
				System.out.print("�л��� > ");
				user_data = scan.nextInt();
				stu_data = new int[user_data];
				break;
			case 2:
				for (int i = 0; i < stu_data.length; i++) {
					System.out.print((i + 1) + "�� ° �л����� : ");
					user_data = scan.nextInt();
					stu_data[i] = user_data;
				}
				break;
			case 3:
				for (int i = 0; i < stu_data.length; i++) {
					System.out.println((i + 1) + "�� ° �л����� : " + stu_data[i]);
				}
				break;
			case 4:
				for (int i = 1; i < stu_data.length; i++) {
					for (int j = 1; j < stu_data.length; j++) {
						if (stu_data[j - 1] < stu_data[j]) {
							save = stu_data[j - 1];
							stu_data[j - 1] = stu_data[j];
							stu_data[j] = save;
						}
					}
				}
				for (int i = 0; i < stu_data.length; i++) {
					sum += stu_data[i];
				}
				score_avg = sum / stu_data.length;
				System.out.println("�ְ����� : " + stu_data[0]);
				System.out.println("������� : " + score_avg);
				System.out.println("�������� ����");
				for (int i = 0; i < stu_data.length; i++) {
					System.out.println(stu_data[i]);
				}
				break;
			case 5:
				System.out.println("���α׷� ����");
				run = false;
				break;
			}
		}
		scan.close();
	}
 
}