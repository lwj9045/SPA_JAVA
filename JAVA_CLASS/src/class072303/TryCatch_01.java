package class072303;

import java.util.*;

public class TryCatch_01 {

	public static void main(String[] args) {

//		����ó��(try ~ catch ~ finally)
//		- ���� �߻� �� ���α׷� ���������ʰ� ��� ���ư��� �Ѵ�
		
		List<String> list = new ArrayList<String>();
		list.add("aaa");
		try {
		for(int i = 0; i< list.size(); i++) {
			System.out.println(list.get(i));
		}
		} catch(IndexOutOfBoundsException e) {
			System.out.println("����Ʈ ũ�� �ʰ��߽��ϴ�.");
			e.printStackTrace();
		}finally {
			System.out.println("������ ���Ϳ�");
		}
	}

}