package class0707;

import java.util.Scanner;

public class Test0707 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		
		do {
			System.out.print("점수를 입력하세요 : ");
			num = scan.nextInt();
			
			if(num<=100 && num>=0) {
			switch(num/10) {
			
			case 10 : case 9 : // 90~100 (수)
				System.out.println("수");
				break;
			case 8 :  // 80~89 (우)
				System.out.println("우");
				break;
			case 7 : // 70~79 (미)
				System.out.println("미");
				break;
			case 6 : // 60~69 (양)
				System.out.println("양");
				break;
				default :
					System.out.println("가");
					break;
			}
			} else {
				System.out.println("범위초과");
			}
			
			
		}while(num != -1);
		System.out.println("프로그램을 종료합니다. ");
	}
}
