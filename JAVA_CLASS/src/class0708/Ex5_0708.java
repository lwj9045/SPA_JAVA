package class0708;

import java.util.*;

public class Ex5_0708 {

	public static void main(String[] args) {
		// ���������� ����   0:���� 1:���� 2:��
		Scanner scan = new Scanner(System.in);

		String user = "";
		int user_num = 0, ran_num = 0;
		boolean run = true;

		System.out.println("���������� ������ �����մϴ�. �����Ϸ��� '����'�� �Է��ϼ���. ");

		while (run) {
			ran_num = (int) (Math.random() * 3); // 0~2
//			System.out.println("ran_num : " + ran_num);
			System.out.print("�Է��ϼ��� : ");
			user = scan.nextLine();

			switch (user) {
			case "����":
				user_num = 0;
				break;
			case "����":
				user_num = 1;
				break;
			case "��":
				user_num = 2;
				break;
			}
			if (user.equals("����")) {
				run = false;
				System.out.println("���α׷��� �����մϴ�. ");
			} else {
				if (user_num == 0) { // ����
					if (ran_num == 0) {
						System.out.println("�����ϴ�. ");
					} else if (ran_num == 1) {
						System.out.println("�����ϴ�. ");
					} else {
						System.out.println("�̰���ϴ�. ");
					}
				}
				if (user_num == 1) { // ����
					if (ran_num == 0) {
						System.out.println("�̰���ϴ�. ");
					} else if (ran_num == 1) {
						System.out.println("�����ϴ�. ");
					} else {
						System.out.println("�����ϴ�. ");
					}
				}
				if (user_num == 2) { // ��
					if (ran_num == 0) {
						System.out.println("�����ϴ�. ");
					} else if (ran_num == 1) {
						System.out.println("�̰���ϴ�. ");
					} else {
						System.out.println("�����ϴ�. ");
					}
				}
			}

		}

	}
}