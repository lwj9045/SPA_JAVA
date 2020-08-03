package class072303;

import java.util.*;

public class TryCatch_01 {

	public static void main(String[] args) {

//		예외처리(try ~ catch ~ finally)
//		- 오류 발생 시 프로그램 종료하지않고 계속 돌아가게 한다
		
		List<String> list = new ArrayList<String>();
		list.add("aaa");
		try {
		for(int i = 0; i< list.size(); i++) {
			System.out.println(list.get(i));
		}
		} catch(IndexOutOfBoundsException e) {
			System.out.println("리스트 크기 초과했습니다.");
			e.printStackTrace();
		}finally {
			System.out.println("무조건 나와요");
		}
	}

}
