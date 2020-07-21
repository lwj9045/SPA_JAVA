package class0714;

import java.util.Scanner;

public class Ex01_0714 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
//		int num[] = null;	// 정수형 배열 num 이름만 선언(완전한 배열 선언x)
//		System.out.println(num.length);
		
		//스캐너 입력을 통해 사이즈 지정
		System.out.println("지정할 배열 크기");
		int size = scan.nextInt();
		int num[] = new int[size];
		System.out.println(num.length);


	}

}
