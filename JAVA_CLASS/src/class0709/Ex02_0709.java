package class0709;

public class Ex02_0709 {

	public static void main(String[] args) {
		//ũ�Ⱑ 5�� �迭�� �����ϰ�, �� �Է�, �Էµ� ������ ����, ��� ���ϱ�
		int num[] = new int[5];
//		int num[] = {10,40,70,20,40};
		int i = 0, sum = 0;

		num[0] = 10;
		num[1] = 40;
		num[2] = 70;
		num[3] = 20;
		num[4] = 40;

		for (i = 0; i < num.length; i++) {
			sum += num[i];
		}
		System.out.println("�Էµ� ������ �� ���� : " + sum);
		System.out.println("�Էµ� ������ ����� : " + sum / num.length);
	}

}
