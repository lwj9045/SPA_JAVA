package class0703;

import java.util.Scanner;

public class Switch_Case {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String eng = "";

		System.out.print("�ܾ �Է��ϼ���. ");
		eng = scan.nextLine();

		switch (eng) {
		case "desk":
			System.out.println("å���Դϴ�. ");
			break;
		case "chair":
			System.out.println("�����Դϴ�. ");
			break;
		case "mouse":
			System.out.println("���콺 �Դϴ�. ");
			break;
		case "monitor":
			System.out.println("����� �Դϴ�. ");
			break;
		default:
			System.out.println("�߸��� �Է��Դϴ�. ");
			break;
		}

	scan.close();
	}

}
