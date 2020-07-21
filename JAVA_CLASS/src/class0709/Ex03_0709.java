package class0709;

import java.util.*;

public class Ex03_0709 {
	// 5개 입력 받고 각 입력값들의 총합, 평균 구하기
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int i = 0, sum = 0, avg = 0;
//		int user_num[] = new int[5]; // 크기가 5
		int user_num[];
		user_num = new int[5];

		for (i = 0; i < user_num.length; i++) {
			user_num[i] = scan.nextInt();
			sum += user_num[i];
		}
		avg = sum / user_num.length;
		System.out.println("입력된 값들의 총 합은 : " + sum);
		System.out.println("입력된 값들의 평균은 : " + avg);
	}

}
