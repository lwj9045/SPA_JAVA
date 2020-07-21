package class0710;

import java.util.*;

public class Ex06_0710 {

	public static void main(String[] args) {
		// 고정된숫자 중 한개 입력받고, 몇번째 수 인지 출력
		Scanner scan = new Scanner(System.in);
		int user_num = 0, count = 0, i = 0;
		int num[] = { 1, 2, 5, 3, 4, 7, 6, 9, 10, 8 };
		boolean run = true;
		System.out.print("숫자입력 : ");
		user_num = scan.nextInt();
		scan.close();

		while (run) {

			if (user_num == num[i]) {
				count = i + 1;
				run = false;
			}
			i++;
		}
		System.out.println(user_num + " 는 " + count + " 번째에 있습니다. ");
	}
}