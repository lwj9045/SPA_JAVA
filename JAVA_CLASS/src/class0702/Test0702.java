package class0702;

import java.util.Scanner;

public class Test0702 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = 0;
		int i = 0, j = 0, k = 0; // i = * , j = line
		System.out.println("줄 설정하세요. ");
		num = scan.nextInt();

// num = 3
		for (j = 1; j <= num; j++) {

			for (k = num; k > j; k--) {
				System.out.print(" ");
			}
			for (i = 1; i <= j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}