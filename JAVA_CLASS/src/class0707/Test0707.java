package class0707;

import java.util.Scanner;

public class Test0707 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		
		do {
			System.out.print("������ �Է��ϼ��� : ");
			num = scan.nextInt();
			
			if(num<=100 && num>=0) {
			switch(num/10) {
			
			case 10 : case 9 : // 90~100 (��)
				System.out.println("��");
				break;
			case 8 :  // 80~89 (��)
				System.out.println("��");
				break;
			case 7 : // 70~79 (��)
				System.out.println("��");
				break;
			case 6 : // 60~69 (��)
				System.out.println("��");
				break;
				default :
					System.out.println("��");
					break;
			}
			} else {
				System.out.println("�����ʰ�");
			}
			
			
		}while(num != -1);
		System.out.println("���α׷��� �����մϴ�. ");
	}
}
