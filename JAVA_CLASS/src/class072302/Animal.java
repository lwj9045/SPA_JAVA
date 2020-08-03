package class072302;

//추상 클래스
public abstract class Animal {
	String kind;

	void breath() {
		System.out.println("숨을 쉽니다.");
	}

	// 추상 메소드 선언
	abstract void sound();

}
