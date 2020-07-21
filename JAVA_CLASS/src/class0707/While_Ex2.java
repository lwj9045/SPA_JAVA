package class0707;

import java.util.Scanner;

public class While_Ex2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0, x = 0, y = 0, i = 0, X = 0, A = 0, B = 0; // x = 10의자리, y는 일의자리
		boolean run = true;
		
		num = scan.nextInt();
		
		A = num / 10; // 2
		B = num % 10; // 6
		x = A; 	// x=2
		y = B; 	// y=6
		
		while (run) {
			X = y;
			y = (x + y) % 10;
			x=X;
			i++;
			
			if(A==X) {
				if(B==y) {
					run = false;
					System.out.println(i);
				}
			}

		}
	}

}
