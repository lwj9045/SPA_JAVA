package class0708;

import java.util.*;

public class Ex6_0708 {

	public static void main(String[] args) {
		// 1-2+3-4+5-6 ~ ���� 100 �̻��϶�,

		int num = 1, sum = 0, num2 = 0;
		boolean run = true;

		while (run) {

			if (num % 2 == 0) { // ¦��
				num2 = num * -1;
			} else if (num % 2 != 0) {
				num2 = num;
			}
			sum += num2;
			if (sum >= 100) {
				System.out.println(num);
				run = false;
			}
			num++;
		}

	}

}
