package class071401;

import class0714.Ex01_0714;

public class Car_Main {

	public static void main(String[] args) {
//		 Car 클래스를 객체로 선언하여 
//		 Car 클래스가 가지고 있는 필드 사용
//		* 객체 선언 방법
//		 '객체로만들클래스이름' 변수명 = new '객체클래스의 생성자형식';

//		Car 클래스의 객체를 car1이라는 이름으로 선언
//		car1 : Car 클래스 타입의 변수
		Car car1 = new Car();
//		Car 클래스가 가지고있는 color 필드에 값 입력
		car1.color = "red";
//		car1의 color 필드가 가지고 있는 값 출력
		System.out.println(car1.color);

		Car car2 = new Car();
		car2.color = "blue";
		System.out.println(car1.color);
		System.out.println(car2.color);

		
		String var = "";
		var = car1.color;
		System.out.println(var);
		
		Car car3 = null;
		car3 = new Car();
		
//		매개변수가 있는 생성자를 활용한 객체선언 
		Car car4 = new Car("가나다라");
		System.out.println(car4.color);
		System.out.println(car4.company);
		System.out.println(car4.model);
		System.out.println(car4.ok);
		System.out.println(car4.speed);
		System.out.println(car4.type);
		
		Ex01_0714 car5 = new Ex01_0714();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
