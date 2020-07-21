package class071603;

import java.util.*;

public class Application {

	public void enter(Student stu) {
		System.out.println("App 클래스의 enter 메소드");
		System.out.println(stu.name + " 님 입실완료");
		System.out.println("입실시간 : " + new Date());

	}

	public void view(Student stu) {
		System.out.println("정보확인 메뉴 실행");
		System.out.println(stu.toString());

	}

	public void modi(Student stu) {
		stu.address = "서울";
		System.out.println(stu.toString());
	}

}