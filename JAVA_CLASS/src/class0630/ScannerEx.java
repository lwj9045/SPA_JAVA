package class0630;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		
		/*��ĳ�� ����� ���� ��ĳ�� ��ü����
		Scanner scan1 = new Scanner(System.in);  //�ܼ�â���� �̸�, �ּҸ� �Է¹޾Ƽ� �Է¹��� ���� �״�����
		
		String name = "", address = "";   //�̸�, �ּ� �Է��� ���� ���� ����
		
		System.out.print("�̸��� �Է��ϼ��� : ");  //��ĳ�ʷ� �Է¹��� ������ name�� ����
		name = scan1.nextLine();  // nextLine method : �����Է¿� ���
		System.out.println("�Է��� �̸��� : " + name + " �Դϴ�. ");
		
		System.out.print("�ּҸ� �Է��ϼ��� : ");
		address = scan1.nextLine();
		System.out.println("�Է��� �ּҴ� : " + address + " �Դϴ�. ");
		
		int num = 0;
		
		System.out.print("���̸� �Է��ϼ��� : ");
		num = scan1.nextInt();
		System.out.println("�Է��� ���̴� : " + num + " �Դϴ�.");
		scan1.close();
		
		/* 
		 * ������ ���� �����
		 * ������ ������ ����
		 * ���� �ΰ� �Է� �� ���� ��� ���
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		int num1 = 0, num2 = 0, result = 0;
		
		
		System.out.print("ù��° ���ڸ� �Է��� �ּ��� : ");
		num1 = scan.nextInt();
		
		System.out.print("�ι�° ���ڸ� �Է��� �ּ��� : ");
		num2 = scan.nextInt();
		
		result = num1 + num2;
		System.out.println("�� ���� ���� ����� " + result + " �Դϴ�.");
		scan.close();
	}
	
}

			