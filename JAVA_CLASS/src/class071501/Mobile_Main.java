package class071501;

import java.util.*;

public class Mobile_Main {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// �⺻ �����ڸ� �̿��� Mobile ��ü ����

//		Mobile_A mobile1 = new Mobile_A();
//		mobile1.company = "apple";
//		mobile1.model = "������11";
//		mobile1.color = "black";
//		mobile1.type = 5;
//		
//		Mobile_A mobile2 = new Mobile_A();
//		mobile2.model = "s20";
//		mobile2.color = "red";
//		mobile2.type  = 5;
//		System.out.println(mobile2.company);

		// ��ü�� ���� �� �ʵ� ������ �Բ� �����ϰ��� �Ҷ�
		// �Ű������� �ִ� �����ڸ� ���
		
		
		
		
		
//		Mobile_A mobile3 = new Mobile_A("����","������x", "black",5);
		String[] str = new String[3];
		int i = 0;
//		str = scan.next();
//		if (i == 1) {
//			str = "��Ʈ 10";
//		} else {
//			str = "������11";
//		}
		for(int j = 0; j<3; j++) {
			str[j] = scan.next();
		}
		i = scan.nextInt();
		Mobile_A mobile3 = new Mobile_A(str[0], str[1], str[2], i);

		System.out.println(mobile3.company);
		System.out.println(mobile3.model);
		System.out.println(mobile3.color);
		System.out.println(mobile3.type);
	}
}
