package class0707;

import java.util.Scanner;

public class do_While_Ex {

	public static void main(String[] args) {
		// do while = 일단 한번은 실행함 (조건이 안 맞아도)
		Scanner scan = new Scanner(System.in);
		String str = "", fin = "종료";
		boolean run = true;

		System.out.println("메세지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 '종료'를 입력하세요. ");

		do {
			System.out.print(">");
			str = scan.nextLine();
			System.out.println(str);
			if(str.equals(fin)) {
				run = false;
			}
		} while (run);
		//while (! str.equals("종료"));
		System.out.println("프로그램 종료 ");
	}

}
