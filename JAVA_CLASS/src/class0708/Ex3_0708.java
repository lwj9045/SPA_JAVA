package class0708;

import java.util.Scanner;

public class Ex3_0708 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int count = 0, num = 0, total_sum = 0;
		
		System.out.println("������ �Է��ϰ� �������� 0�� �Է��ϼ���. ");

		do {
			num = scan.nextInt();
			total_sum += num;
			count++;

			if (num == 0) {
				count--;
				System.out.println("�Է��� ������ " + count + " ��");
				System.out.println("����� " + total_sum / count + "�Դϴ�. ");
			}
		}while(num != 0);
	}
}
