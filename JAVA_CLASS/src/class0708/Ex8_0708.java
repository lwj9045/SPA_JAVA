package class0708;

import java.util.*;

public class Ex8_0708 {

	public static void main(String[] args) {
		// 업다운 게임
		Scanner scan = new Scanner(System.in);
		int user_num = 0, count = 0, ran_num = 0;
		boolean run = true;

		System.out.println("Up&Down 게임");
		ran_num = (int) (Math.random() * 100) + 1; // 1~100

		while (run) {
			System.out.print("1부터 100 사이의 수를 입력하세요 : ");
			user_num = scan.nextInt();
			count++;
			if (user_num > ran_num) {
				System.out.println("Down");
			} else if (user_num < ran_num) {
				System.out.println("Up");
			} else {
				run = false;
				System.out.println("정답");
				System.out.println("시도횟수는 " + count + " 입니다. ");
			}

		}

	}

}
