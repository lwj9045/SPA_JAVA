package class0714;

import java.util.*;

public class Ex02_0714 {

	public static void main(String[] args) {
		// 간단한 성적관리 프로그램
		// 1. 학생수 배열선언
		// 2. 학생수에따른 점수 입력
		// 3. 점수리스트 - 출력
		// 4. 분석 - 최고점수, 평균점수, 내림차순 정렬
		// 5. 종료
		Scanner scan = new Scanner(System.in);
		int stu_data[] = null, user_num = 0, user_data = 0, save = 0, sum = 0, score_avg = 0;
		boolean run = true;

		while (run) {
			System.out.println("------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료 ");
			System.out.println("------------------------------------------");
			System.out.print("선택 > ");
			user_num = scan.nextInt();

			switch (user_num) {
			case 1:
				System.out.print("학생수 > ");
				user_data = scan.nextInt();
				stu_data = new int[user_data];
				break;
			case 2:
				for (int i = 0; i < stu_data.length; i++) {
					System.out.print((i + 1) + "번 째 학생점수 : ");
					user_data = scan.nextInt();
					stu_data[i] = user_data;
				}
				break;
			case 3:
				for (int i = 0; i < stu_data.length; i++) {
					System.out.println((i + 1) + "번 째 학생점수 : " + stu_data[i]);
				}
				break;
			case 4:
				for (int i = 1; i < stu_data.length; i++) {
					for (int j = 1; j < stu_data.length; j++) {
						if (stu_data[j - 1] < stu_data[j]) {
							save = stu_data[j - 1];
							stu_data[j - 1] = stu_data[j];
							stu_data[j] = save;
						}
					}
				}
				for (int i = 0; i < stu_data.length; i++) {
					sum += stu_data[i];
				}
				score_avg = sum / stu_data.length;
				System.out.println("최고점수 : " + stu_data[0]);
				System.out.println("평균점수 : " + score_avg);
				System.out.println("내림차순 정렬");
				for (int i = 0; i < stu_data.length; i++) {
					System.out.println(stu_data[i]);
				}
				break;
			case 5:
				System.out.println("프로그램 종료");
				run = false;
				break;
			}
		}
		scan.close();
	}
 
}