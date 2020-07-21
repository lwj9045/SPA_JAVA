package class0707;

public class While_Ex {

	public static void main(String[] args) {
		// 1부터 10까지 덧셈
		int i = 1, sum = 0;

		while (i <= 10) {
			sum += i;
			i++;
		}
		System.out.println("1~10까지의 합은 : " + sum);
		System.out.println(i);

	}
}
