package class0702;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num1 = 0, num2 = 0, num3 = 0;
		System.out.println("�� ���� �Է��ϼ��� . ");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();

		if (num1 > num2) {
			if (num1 > num3) {
				System.out.println("�ִ밪�� " + num1);
			} else {
				System.out.println("�ִ밪��" + num3);
			}
		}
		if (num2 > num3) {
			if (num2 > num1) {
				System.out.println("�ִ밪��" + num2);
			} else {
				System.out.println("�ִ밪��" + num1);
			}
		}
		if (num3 > num1) {
			if (num3 > num2) {
				System.out.println("�ִ밪��" + num3);
			} else {
				System.out.println("�ִ밪��" + num2);
			}
		}
		if (num1 == num2) {
			if(num2==num3) {
				System.out.println("������ ����");
			}
		}

//		if(num1>num2 && num1>num3) {
//			System.out.println("�ִ밪�� "+ num1);
//		} else if(num2>num1 && num2>num3) {
//			System.out.println("�ִ밪�� "+ num2);
//		}else if(num3>num1 && num3>num2) {
//			System.out.println("�ִ밪�� "+ num3);
//		}else {
//			System.out.println("�ִ밪�� 2���̻�");
//		}

		scan.close();
	}

}
