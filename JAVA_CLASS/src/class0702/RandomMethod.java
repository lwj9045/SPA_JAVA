package class0702;

public class RandomMethod {

	public static void main(String[] args) {

//		Random Method
//		Ư�� ���� ������ ���� �ϳ��� �������� ������ִ� �޼ҵ�

		int ran_num = 0;
		ran_num = (int) (Math.random() * 6) + 1; // 1 <= x < 7
		// ran_num = 1~6
		switch (ran_num) {
		case 1:
			System.out.println("�ֻ��� 1");
			break;
		case 2:
			System.out.println("�ֻ��� 2");
			break;
		case 3:
			System.out.println("�ֻ��� 3");
			break;
		case 4:
			System.out.println("�ֻ��� 4");
			break;
		case 5:
			System.out.println("�ֻ��� 5");
			break;
		default:
			System.out.println("�ֻ��� 6");
		}

	}

}
