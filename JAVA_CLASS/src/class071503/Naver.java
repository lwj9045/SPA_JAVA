package class071503;

public class Naver {

	String id;
	String password;
	String name;
	String birth;
	String gander;
	String email;
	String phone;

	Naver(String id, String password, String name, String birth, String gander, String email, String phone) {
//		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.birth = birth;
		this.gander = gander;
		this.email = email;
		this.phone = phone;
	}

	@Override  // 어노테이션(Annotation)
	public String toString() {
		return "Naver [id=" + id + ", password=" + password + ", name=" + name + ", birth=" + birth + ", gander="
				+ gander + ", email=" + email + ", phone=" + phone + "]";
	}

	Naver() {
		System.out.println("기본 생성자 호출");
	}
}
