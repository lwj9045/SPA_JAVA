package class0703;

import java.util.Scanner;

public class Star_Ex {
	// 줄 수, 입력 칸
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int i = 0, j = 0, k=0,num = 0;
		num = scan.nextInt();
		
		for (i = 1; i <= num; i++) {

			for (j = 1; j < i; j++) { // 공백
				System.out.print(" ");
			}
			for (k = num; k >= i; k--) {// 별
				System.out.print("*");
			}
			System.out.println("");
		}

	}
}
