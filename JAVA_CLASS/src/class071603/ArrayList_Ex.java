package class071603;
import java.util.*;
public class ArrayList_Ex {

	public static void main(String[] args) {
		
		// ArrayList, Set, Map
		// numbers 라는 이름의 ArrayList 선언
		
		List<Integer> numbers = new ArrayList<Integer>();
		// <> : generic
		// 타입변환을 하지 않고도 해당 타입을 사용할 수 있게 해줌
		List<String> strs = new ArrayList<String>();
		List<StudentDTO> stuList = new ArrayList<StudentDTO>();
		
		//numbers에 값 저장
		numbers.add(10);
		int num = 100;
		numbers.add(num);
		System.out.println(numbers.add(500));
		numbers.add(1, 99);
		numbers.add(1, 999);
//		numbers.clear();  //number List초기화
		numbers.remove(2);  //하나의 데이터 삭제, 데이터 삭제된 인덱스는 비워지지않고 땡겨진다.
		//출력
		System.out.println(numbers.get(0));
		System.out.println(numbers.get(1));
		System.out.println(numbers.get(2));
		//ArrayList 크기 출력
		System.out.println(numbers.size());
		//for문을 이용하여 ArrayList에 담긴 모든 데이터 출력
		
		for(int i=0; i<numbers.size(); i++) {
			System.out.println("인덱스"+i+":"+numbers.get(i));
		}
		
		StudentDTO stu = new StudentDTO();
		stu.setName("회원 1");
		stu.setAddress("인천광역시");
		stu.setPhone("010-1111-2222");
		
		stuList.add(stu);
		System.out.println(stuList.get(0).getName());
		
		StudentDTO stu1 = new StudentDTO();
		stu1.setName("회원 2");
		stu1.setAddress("인천광역시");
		stu1.setPhone("010-2222-3333");
		
		stuList.add(stu1);
		System.out.println(stuList.get(1).getName());
		
		for(int i = 0; i<stuList.size();i++) {
			System.out.println("전체출력 : "+stuList.get(i));
			System.out.println("이름만 출력 : "+stuList.get(i).getName());
		}
		}
		
		
		
	}

