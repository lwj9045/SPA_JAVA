package class0709;

import java.util.Scanner;

public class Ex01_0709 {
	// 1번 예금, 2번 출금, 3번 잔고, 4번 종료
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int num = 0, money = 0, user_money = 0;

		while (run) {
			System.out.println(" ----------------------------");
			System.out.println("| 1.예금 | 2.출금 | 3.잔고 | 4.종료 |");
			System.out.println(" ----------------------------");
			System.out.print("선택 > ");
			num = scan.nextInt();
			
			
			if (num < 5) {
				if (num == 1) {
					System.out.print("예금액 > ");
					user_money = scan.nextInt();
					money += user_money;
					System.out.println("현재 잔액은 " + money + "원 입니다.");
				} else if (num == 2) {
					System.out.print("출금액 > ");
					user_money = scan.nextInt();
					if (user_money > money) {
						System.out.println("잔고가 부족합니다. ");
						System.out.println("현재 잔액은 " + money + "원 입니다.");
					} else {
						money -= user_money;
						System.out.println("출금처리가 되었습니다. ");
						System.out.println("현재 잔액은 " + money + "원 입니다.");
					}
				} else if (num == 3) {
					System.out.println("잔고 > " + money);
					System.out.println("현재 잔액은 " + money + "원 입니다.");
				} else {
					run = false;
					System.out.println("프로그램 종료");
				}
			} else {
				System.out.println("올바른 입력이 아닙니다. ");
			}
		}
scan.close();
	}

}
