package class0710;

import java.util.Arrays;

public class for_Each_Ex {

	public static void main(String[] args) {
		// for each(향상된 for)
		// 값이 5개 있는 String 배열 선언, for each 이용, 배열값 출력

		String str[] = { "가", "나", "다", "라", "마" };

		for (String a : str) {
			System.out.println(a);
		}

	}
}
