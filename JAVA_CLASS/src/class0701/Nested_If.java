package class0701;
import java.util.Scanner;
public class Nested_If {

	public static void main(String[] args) {
		// ��ø If�� ����Ͽ� ������ ���� ������� ���α׷� ����
		Scanner scan = new Scanner(System.in);
		
		int score = 0;
		String result = "";
		
		System.out.println("������ �Է��ϼ���. ");
		score = scan.nextInt();
		
		if (score <= 100) {
			if (score >=60 ) {
				result = "D";
				if (score >= 65 ) {
					result = "D+";
					if (score >= 70) {
						result = "C";
						if (score >= 75) {
							result = "C+";
							if (score >= 80) {
								result = "B";
								if (score >= 85) {
									result = "B+";
									if (score >= 90) {
										result = "A";
										if (score >= 95) {
											result = "A+";
											}
										}
									}
								}
							}
						}
					}
				}else {
					
					result = "F";
				}
					
			System.out.println("����� ������ " + result + " �Դϴ�.");
		} else {
			System.out.println("�Է¹��� �ʰ��Դϴ�. ");
		}
	}
}




