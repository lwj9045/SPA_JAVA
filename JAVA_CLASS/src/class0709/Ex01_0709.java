package class0709;

import java.util.Scanner;

public class Ex01_0709 {
	// 1�� ����, 2�� ���, 3�� �ܰ�, 4�� ����
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int num = 0, money = 0, user_money = 0;

		while (run) {
			System.out.println(" ----------------------------");
			System.out.println("| 1.���� | 2.��� | 3.�ܰ� | 4.���� |");
			System.out.println(" ----------------------------");
			System.out.print("���� > ");
			num = scan.nextInt();
			
			
			if (num < 5) {
				if (num == 1) {
					System.out.print("���ݾ� > ");
					user_money = scan.nextInt();
					money += user_money;
					System.out.println("���� �ܾ��� " + money + "�� �Դϴ�.");
				} else if (num == 2) {
					System.out.print("��ݾ� > ");
					user_money = scan.nextInt();
					if (user_money > money) {
						System.out.println("�ܰ� �����մϴ�. ");
						System.out.println("���� �ܾ��� " + money + "�� �Դϴ�.");
					} else {
						money -= user_money;
						System.out.println("���ó���� �Ǿ����ϴ�. ");
						System.out.println("���� �ܾ��� " + money + "�� �Դϴ�.");
					}
				} else if (num == 3) {
					System.out.println("�ܰ� > " + money);
					System.out.println("���� �ܾ��� " + money + "�� �Դϴ�.");
				} else {
					run = false;
					System.out.println("���α׷� ����");
				}
			} else {
				System.out.println("�ùٸ� �Է��� �ƴմϴ�. ");
			}
		}
scan.close();
	}

}
