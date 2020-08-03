package class072302;

public class AniamlMain {

	public static void main(String[] args) {

		// Aniaml 클래스 객체 생성
//		Animal animal = new Animal(); //객체생성 불가
		Dog dog = new Dog();
		dog.sound();
		dog.breath();

		Cat cat = new Cat();
		cat.sound();
		cat.breath();

		// 다형성(polymorphism)
		Animal animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();

	}

}
