package class0707;

import java.util.Scanner;

public class do_While_Ex {

	public static void main(String[] args) {
		// do while = �ϴ� �ѹ��� ������ (������ �� �¾Ƶ�)
		Scanner scan = new Scanner(System.in);
		String str = "", fin = "����";
		boolean run = true;

		System.out.println("�޼����� �Է��ϼ���.");
		System.out.println("���α׷��� �����Ϸ��� '����'�� �Է��ϼ���. ");

		do {
			System.out.print(">");
			str = scan.nextLine();
			System.out.println(str);
			if(str.equals(fin)) {
				run = false;
			}
		} while (run);
		//while (! str.equals("����"));
		System.out.println("���α׷� ���� ");
	}

}
