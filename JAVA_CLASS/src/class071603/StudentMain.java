package class071603;

import java.util.*;

public class StudentMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		String name = "", address = "", phone = "";

		Student stu = null;

		Application app = new Application();
		StudentDTO stu1 = null;
//		stu1.name = "ȸ��1";
		
//		stu1.setName("ȸ��1");
//		System.out.println(stu1.getName());
		
		while (run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.�űԵ�� | 2.�⼮üũ | 3.�� ����Ȯ��| 4.��������| 5.���� | 6. DTOŬ���� �̿��� ��ü");
			System.out.println("----------------------------------------------");
			System.out.print("���� > ");
			int user_num = scan.nextInt();

			switch (user_num) {
			case 1:
				System.out.print("�̸� : ");
				name = scan.next();
				System.out.print("�ּ� : ");
				address = scan.next();
				System.out.print("��ȭ��ȣ : ");
				phone = scan.next();
				stu = new Student(name, address, phone);
				break;
			case 2:
				app.enter(stu);
				break;
			case 3: // �� ���� Ȯ��(��ü�� ��� ��� �ʵ尪 ���)
				app.view(stu);
				break;
			case 4:
				app.modi(stu);
				break;
			case 6 :
				//DTO Ŭ������ �̿��� ��ü����
				System.out.print("�̸� : ");
				name = scan.next();
				System.out.print("�ּ� : ");
				address = scan.next();
				System.out.print("��ȭ��ȣ : ");
				phone = scan.next();
				
				stu1 = new StudentDTO();
				stu1.setName(name);
				stu1.setAddress(address);
				stu1.setPhone(phone);
			
			}

		}
	}

}
