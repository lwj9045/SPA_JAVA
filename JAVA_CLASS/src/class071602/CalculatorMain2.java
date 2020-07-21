package class071602;

import java.util.*;

public class CalculatorMain2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calculator2 cal = new Calculator2();

		while (cal.run) {
			cal.print1();
			cal.user_num(scan.nextInt());

			if (cal.user_num < 5) {
				System.out.print("숫자입력 1 : ");
				cal.num1(scan.nextInt());
				System.out.print("숫자입력 2 : ");
				cal.num2(scan.nextInt());
				
				cal.switchRun();
			} else if (cal.user_num == 5) {
				cal.runOut();
			} else {
				System.out.println("범위를 초과하였습니다.");
			}
		}
		scan.close();
	}
}