package class071602;

import java.util.*;

public class CalcualtorMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calculator cal = new Calculator();
		int user_num = 0, num1 = 0, num2 = 0;

		while (cal.run) {
			cal.print1();
			user_num = scan.nextInt();
			
			if(user_num != 5) {
			System.out.print("숫자입력 1 : ");
			num1 = scan.nextInt();
			System.out.print("숫자입력 2 : ");
			num2 = scan.nextInt();

			switch (user_num) {
			case 1:
				cal.sum(num1, num2);
				break;
			case 2:
				cal.sub(num1, num2);
				break;
			case 3:
				cal.mul(num1, num2);
				break;
			case 4:
				cal.div(num1, num2);
				break;
			}
			}else {
				cal.run();
			}
		}
	}

}
