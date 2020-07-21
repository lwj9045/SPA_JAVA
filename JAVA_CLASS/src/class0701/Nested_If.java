package class0701;
import java.util.Scanner;
public class Nested_If {

	public static void main(String[] args) {
		// 중첩 If를 사용하여 점수에 따른 학점출력 프로그램 설계
		Scanner scan = new Scanner(System.in);
		
		int score = 0;
		String result = "";
		
		System.out.println("점수를 입력하세요. ");
		score = scan.nextInt();
		
		if (score <= 100) {
			if (score >=60 ) {
				result = "D";
				if (score >= 65 ) {
					result = "D+";
					if (score >= 70) {
						result = "C";
						if (score >= 75) {
							result = "C+";
							if (score >= 80) {
								result = "B";
								if (score >= 85) {
									result = "B+";
									if (score >= 90) {
										result = "A";
										if (score >= 95) {
											result = "A+";
											}
										}
									}
								}
							}
						}
					}
				}else {
					
					result = "F";
				}
					
			System.out.println("당신의 학점은 " + result + " 입니다.");
		} else {
			System.out.println("입력범위 초과입니다. ");
		}
	}
}




