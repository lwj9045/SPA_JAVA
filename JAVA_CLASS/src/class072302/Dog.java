package class072302;

public class Dog extends Animal{
	
	
	//부모클래스(Animal)가 가진 sound 추상메소드(sound) 재정의
	@Override
	void sound() {
		System.out.println("강아지는 멍멍");
	}

}
