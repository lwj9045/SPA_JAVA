package class0710;

import java.util.*;

public class Ex07_0710 {

	public static void main(String[] args) {
		// ���� �� �Է�, �ִ밪 ���� ����/(�ִ밪*100) �� ������ ��� ���϶�
		Scanner scan = new Scanner(System.in);
		double max = 0, sum = 0, avg = 0;
		int num = 0;

		System.out.print("������� �Է��ϼ��� : ");
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
		System.out.println("�Էµ� ������ ����� : " + avg);
	}
}