package class0710;

import java.util.*;

public class Ex07_0710 {

	public static void main(String[] args) {
		// 과목 수 입력, 최대값 제외 점수/(최대값*100) 총 과목의 평균 구하라
		Scanner scan = new Scanner(System.in);
		double max = 0, sum = 0, avg = 0;
		int num = 0;

		System.out.print("과목수를 입력하세요 : ");
		num = scan.nextInt();
		double score[] = new double[num];

		for (int i = 0; i < score.length; i++) {
			score[i] = scan.nextInt();
			if (max < score[i]) {
				max = score[i];
			}
		}
		for (int i = 0; i < score.length; i++) {
			score[i] = score[i] / max * 100;
			sum += score[i];
		}
		avg = sum / score.length;
		System.out.println("입력된 과목의 평균은 : " + avg);
	}
}