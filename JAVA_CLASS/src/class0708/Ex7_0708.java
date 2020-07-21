package class0708;

public class Ex7_0708 {

	public static void main(String[] args) {
			//1+2+3-4-5+6+7-8-9 ~ 의 합이 100 이상일 때 출력
		int num = 1, i = 0, j = 0, sum = 1, num1 = 0, num2 = 0, test = 0;
		boolean run = true;

		while (run) {

			for (i = 1; i < 3; i++) { // 1,2
				num++;
				num1 = num;
				sum += num1; // num = =3
//				System.out.println("num1 : " + num1);
//				System.out.println("sum : " + sum);
				if (sum >= 100) {
					run = false;
					System.out.println(sum);
				}
			}
			for (j = 1; j < 3; j++) {
				num++; // num = 4
				num2 = num * -1;
				sum += num2;
//				System.out.println("num2 : " + num2);
//				System.out.println("sum : " + sum);
				if (sum >= 100) {
					run = false;
					System.out.println(sum);
				}
			}
		
			test++;
		}

	}

}
