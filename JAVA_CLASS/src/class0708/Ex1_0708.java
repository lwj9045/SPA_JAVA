package class0708;

import java.util.Scanner;

public class Ex1_0708 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = 0;

		do {
			System.out.print("���� �Է��ϼ��� : ");
			num = scan.nextInt();
			if (num != 0) {

				if (num % 2 == 0) {
					System.out.println("¦��");
				} else {
					System.out.println("Ȧ��");
				}
			} else {
				System.out.println("�����մϴ�. ");
			}

		} while (num != 0);

	}

}
