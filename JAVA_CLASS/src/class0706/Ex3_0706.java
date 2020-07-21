package class0706;

import java.util.Scanner;

public class Ex3_0706 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num = 0, i = 0, j = 0, k = 0;
		num = scan.nextInt();
									// num = 5
		for(i=1; i<=num/2+1; i++) {// i = 1,2,3
			for(j=num; j>i+2; j-- ) { //j=5,
				System.out.print(" ");
			}
			for(k=1;k<=i*2-1; k++) {
				System.out.print("*");
			}
		System.out.println("");
		}
		for(i=1; i<=num/2; i++) { // i = 1,2
			for(j=1; j<=i; j++) { //ฐ๘น้
				System.out.print(" ");
			}
			for(k=num; k>i*2; k--) {
				System.out.print("*");
			}
		System.out.println("");	
		}
		
	}
}