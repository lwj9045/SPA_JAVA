package class0709;

public class Ex02_0709 {

	public static void main(String[] args) {
		//크기가 5인 배열을 선언하고, 값 입력, 입력된 값들의 총합, 평균 구하기
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
		System.out.println("입력된 값들의 총 합은 : " + sum);
		System.out.println("입력된 값들의 평균은 : " + sum / num.length);
	}

}
