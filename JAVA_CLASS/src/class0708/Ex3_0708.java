package class0708;

import java.util.Scanner;

public class Ex3_0708 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int count = 0, num = 0, total_sum = 0;
		
		System.out.println("정수를 입력하고 마지막에 0을 입력하세요. ");

		do {
			num = scan.nextInt();
			total_sum += num;
			count++;

			if (num == 0) {
				count--;
				System.out.println("입력한 갯수는 " + count + " 개");
				System.out.println("평균은 " + total_sum / count + "입니다. ");
			}
		}while(num != 0);
	}
}
