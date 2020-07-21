package class0713;

import java.util.*;

public class Ex05_0713 {

	public static void main(String[] args) {
		// 학년,학기 별 학점을 입력받고 총 합계와 평균을 구하라
		Scanner scan = new Scanner(System.in);

		double score[][] = new double[4][2];
		double sum = 0, count = 0;

		System.out.println("성적을 입력하세요.");
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.print((i + 1) + "학년" + (j + 1) + "학기 : ");
				score[i][j] = scan.nextDouble();
				sum += score[i][j];
				scan.close();
				System.out.println("학점 총 합은 : " + sum);
				System.out.println("학점 평균은 : " + sum / count);

			}

		}
	}
}