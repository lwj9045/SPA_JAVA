package class0708;

import java.util.*;

public class Ex5_0708 {

	public static void main(String[] args) {
		// 가위바위보 게임   0:가위 1:바위 2:보
		Scanner scan = new Scanner(System.in);

		String user = "";
		int user_num = 0, ran_num = 0;
		boolean run = true;

		System.out.println("가위바위보 게임을 시작합니다. 종료하려면 '종료'를 입력하세요. ");

		while (run) {
			ran_num = (int) (Math.random() * 3); // 0~2
//			System.out.println("ran_num : " + ran_num);
			System.out.print("입력하세요 : ");
			user = scan.nextLine();

			switch (user) {
			case "가위":
				user_num = 0;
				break;
			case "바위":
				user_num = 1;
				break;
			case "보":
				user_num = 2;
				break;
			}
			if (user.equals("종료")) {
				run = false;
				System.out.println("프로그램을 종료합니다. ");
			} else {
				if (user_num == 0) { // 가위
					if (ran_num == 0) {
						System.out.println("비겼습니다. ");
					} else if (ran_num == 1) {
						System.out.println("졌습니다. ");
					} else {
						System.out.println("이겼습니다. ");
					}
				}
				if (user_num == 1) { // 바위
					if (ran_num == 0) {
						System.out.println("이겼습니다. ");
					} else if (ran_num == 1) {
						System.out.println("비겼습니다. ");
					} else {
						System.out.println("졌습니다. ");
					}
				}
				if (user_num == 2) { // 보
					if (ran_num == 0) {
						System.out.println("졌습니다. ");
					} else if (ran_num == 1) {
						System.out.println("이겼습니다. ");
					} else {
						System.out.println("비겼습니다. ");
					}
				}
			}

		}

	}
}