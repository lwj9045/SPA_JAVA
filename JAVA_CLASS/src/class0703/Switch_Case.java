package class0703;

import java.util.Scanner;

public class Switch_Case {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String eng = "";

		System.out.print("단어를 입력하세요. ");
		eng = scan.nextLine();

		switch (eng) {
		case "desk":
			System.out.println("책상입니다. ");
			break;
		case "chair":
			System.out.println("의자입니다. ");
			break;
		case "mouse":
			System.out.println("마우스 입니다. ");
			break;
		case "monitor":
			System.out.println("모니터 입니다. ");
			break;
		default:
			System.out.println("잘못된 입력입니다. ");
			break;
		}

	scan.close();
	}

}
