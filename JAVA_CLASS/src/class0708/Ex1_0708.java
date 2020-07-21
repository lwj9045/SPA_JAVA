package class0708;

import java.util.Scanner;

public class Ex1_0708 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = 0;

		do {
			System.out.print("수를 입력하세요 : ");
			num = scan.nextInt();
			if (num != 0) {

				if (num % 2 == 0) {
					System.out.println("짝수");
				} else {
					System.out.println("홀수");
				}
			} else {
				System.out.println("종료합니다. ");
			}

		} while (num != 0);

	}

}
