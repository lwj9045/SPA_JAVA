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
//		stu1.name = "회원1";
		
//		stu1.setName("회원1");
//		System.out.println(stu1.getName());
		
		while (run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.신규등록 | 2.출석체크 | 3.내 정보확인| 4.정보수정| 5.종료 | 6. DTO클래스 이용한 객체");
			System.out.println("----------------------------------------------");
			System.out.print("선택 > ");
			int user_num = scan.nextInt();

			switch (user_num) {
			case 1:
				System.out.print("이름 : ");
				name = scan.next();
				System.out.print("주소 : ");
				address = scan.next();
				System.out.print("전화번호 : ");
				phone = scan.next();
				stu = new Student(name, address, phone);
				break;
			case 2:
				app.enter(stu);
				break;
			case 3: // 내 정보 확인(객체에 담긴 모든 필드값 출력)
				app.view(stu);
				break;
			case 4:
				app.modi(stu);
				break;
			case 6 :
				//DTO 클래스를 이용한 객체생성
				System.out.print("이름 : ");
				name = scan.next();
				System.out.print("주소 : ");
				address = scan.next();
				System.out.print("전화번호 : ");
				phone = scan.next();
				
				stu1 = new StudentDTO();
				stu1.setName(name);
				stu1.setAddress(address);
				stu1.setPhone(phone);
			
			}

		}
	}

}
