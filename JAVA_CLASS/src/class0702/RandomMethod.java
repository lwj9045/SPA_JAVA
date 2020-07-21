package class0702;

public class RandomMethod {

	public static void main(String[] args) {

//		Random Method
//		특정 범위 내에서 숫자 하나를 랜덤으로 출력해주는 메소드

		int ran_num = 0;
		ran_num = (int) (Math.random() * 6) + 1; // 1 <= x < 7
		// ran_num = 1~6
		switch (ran_num) {
		case 1:
			System.out.println("주사위 1");
			break;
		case 2:
			System.out.println("주사위 2");
			break;
		case 3:
			System.out.println("주사위 3");
			break;
		case 4:
			System.out.println("주사위 4");
			break;
		case 5:
			System.out.println("주사위 5");
			break;
		default:
			System.out.println("주사위 6");
		}

	}

}
