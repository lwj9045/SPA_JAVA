package class071603;

public class StudentDTO {
	// DTO (Data Transfer Object)(VO,BEAN �̶�� �θ�)
	// - �����͸� ��Ƽ� �����ϱ� ���� Ŭ����
	// ������ �Ʒû� ������ ���� �ʵ�� ��� �ʵ带 �Ű������� �ϴ� �����ڸ� ����

	private String name, birth, address, phone;
	private int age;
	private boolean exp;
//		public, private : ����������
	
	// get, set �޼ҵ�
	// ������� : �ʵ忡 ���� ������ �ƴ� �޼ҵ带 ���� ���� �����Ͽ� �ʵ尪 ���� �� ����
	// get �޼ҵ� : �ܺο��� �ʵ尪�� ������ �� ��
	//	set �޼ҵ� : �ܺο��� �ʵ尪�� ������ ��
	
	// name �ʵ忡 ���� get, set �޼ҵ� ����

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
	public boolean isExp() {  //boolean type�� is�� ��
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
