package class071603;

import java.util.*;

public class Application {

	public void enter(Student stu) {
		System.out.println("App Ŭ������ enter �޼ҵ�");
		System.out.println(stu.name + " �� �ԽǿϷ�");
		System.out.println("�Խǽð� : " + new Date());

	}

	public void view(Student stu) {
		System.out.println("����Ȯ�� �޴� ����");
		System.out.println(stu.toString());

	}

	public void modi(Student stu) {
		stu.address = "����";
		System.out.println(stu.toString());
	}

}