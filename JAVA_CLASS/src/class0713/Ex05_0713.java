package class0713;

import java.util.*;

public class Ex05_0713 {

	public static void main(String[] args) {
		// �г�,�б� �� ������ �Է¹ް� �� �հ�� ����� ���϶�
		Scanner scan = new Scanner(System.in);

		double score[][] = new double[4][2];
		double sum = 0, count = 0;

		System.out.println("������ �Է��ϼ���.");
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.print((i + 1) + "�г�" + (j + 1) + "�б� : ");
				score[i][j] = scan.nextDouble();
				sum += score[i][j];
				scan.close();
				System.out.println("���� �� ���� : " + sum);
				System.out.println("���� ����� : " + sum / count);

			}

		}
	}
}