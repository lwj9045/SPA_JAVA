package class0713;

import java.util.*;

public class Ex02_0713 {

	public static void main(String[] args) {
		// 500��, 100��, 50��, 10�� �������� ���
		Scanner scan = new Scanner(System.in);
		int coin[] = { 500, 100, 50, 10 };
		int exchange[] = new int[4];
		int money = 0;
		boolean run = true;

		while (run) {
			System.out.print("�ݾ��� �Է��ϼ��� : ");
			money = scan.nextInt();
			if (money != 1) {
				for (int i = 0; i < coin.length; i++) { // 0,1,2,3
					exchange[i] = money / coin[i];
					money = money % coin[i];
				}
				for (int j = 0; j < exchange.length; j++) {
					System.out.println(coin[j] + "�� ���� : " + exchange[j] + "��");
				}
			} else if (money == 1) {
				run = false;
				System.out.println("�����մϴ�. ");
			}

		}

	}

}
