package class0703;

import java.util.Scanner;

public class for_Ex {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int i = 0, sum = 0, num_start = 0, num_fin = 0;

		System.out.print("���۰��� �Է��ϼ���. ");
		num_start = scan.nextInt();
		System.out.print("������ �Է��ϼ���. ");
		num_fin = scan.nextInt();

		for (i = num_start; i <= num_fin; i++) {
			sum += i;
			if (i < num_fin) {
				System.out.print(i + "+");
			} else if (i == num_fin) {
				System.out.println(i + "=" + sum);
				System.out.println(num_start + "���� " + num_fin + "������ ���� " + sum + " �Դϴ�. ");
			}
		}

		scan.close();
	}

}
