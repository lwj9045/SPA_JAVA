package class0701;

import java.util.Scanner;

public class Clock_Ex {

	public static void main(String[] args) {
			// 알람 시간보다 45분 일찍 맞춰지는 시계 설계
		Scanner scan = new Scanner(System.in);
		int hour = 0, min = 0;

		System.out.print("");
		hour = scan.nextInt();
		System.out.print("");
		min = scan.nextInt();

		if (min >= 45) {
			if (min > 45) {
				System.out.print(hour + " ");
				System.out.print(min - 45);
			} else {
				System.out.print(hour + " ");
				System.out.print(min - 45);
			}
		} else if(min<45){
			if(hour == 00) {
				hour = 24;
			}
			System.out.print(--hour + " ");
			System.out.print(min - 45 + 60);
		}
scan.close();
	}

}
