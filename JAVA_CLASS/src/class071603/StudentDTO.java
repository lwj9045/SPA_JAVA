package class071603;

public class StudentDTO {
	// DTO (Data Transfer Object)(VO,BEAN 이라고도 부름)
	// - 데이터를 담아서 전달하기 위한 클래스
	// 교육원 훈련생 정보를 담을 필드와 모든 필드를 매개변수로 하는 생성자를 선언

	private String name, birth, address, phone;
	private int age;
	private boolean exp;
//		public, private : 접근제한자
	
	// get, set 메소드
	// 사용이유 : 필드에 직접 접근이 아닌 메소드를 통한 간접 접근하여 필드값 지정 및 수정
	// get 메소드 : 외부에서 필드값을 쓰고자 할 때
	//	set 메소드 : 외부에서 필드값을 설정할 때
	
	// name 필드에 대한 get, set 메소드 선언

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isExp() {  //boolean type은 is를 씀
		return exp;
	}
	public void setExp(boolean exp) {
		this.exp = exp;
	}
	public StudentDTO(String name, String birth, String address, String phone, int age, boolean exp) {
		super();
		this.name = name;
		this.birth = birth;
		this.address = address;
		this.phone = phone;
		this.age = age;
		this.exp = exp;
	}
	
	StudentDTO(){
		
	}
}
