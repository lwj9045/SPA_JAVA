package class071505;

import java.util.*;

public class CalculatorMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

//		int num1 = 0, num2 = 0;
		int[] num = new int[5];
		int user_num = 0;
		int i = 0;
		boolean run = true;
//		num1 = scan.nextInt();
//		num2 = scan.nextInt();

		Calculator cal = new Calculator();
		System.out.println("5���� ������ �Է��ϼ��� : ");
		System.out.println("�����Ϸ��� -1�� �Է��ϼ���. ");
		
		if(user_num != -1) {
		while (i<5) {
			user_num = scan.nextInt();
			num[i] = user_num;
			i++;
		}
		}else {
			run = false;
			System.out.println("�����մϴ�.");
		}
			if (cal.excute(num[0], num[1], num[2], num[3], num[4]) > 90) {
				System.out.println("��");
			} else if (cal.excute(num[0], num[1], num[2], num[3], num[4]) > 80) {
				System.out.println("��");
			} else if (cal.excute(num[0], num[1], num[2], num[3], num[4]) > 70) {
				System.out.println("��");
			} else if (cal.excute(num[0], num[1], num[2], num[3], num[4]) > 60) {
				System.out.println("��");
			} else if (cal.excute(num[0], num[1], num[2], num[3], num[4]) <= 60) {
				System.out.println("��");
			}
			
		}
	}


