package class071603;

public class Student {

	String name, birth, address, exp,phone;
	int age;
	
	Student(String name, String birth, String address, String exp, String phone, int age) {
		this.name = name;
		this.birth = birth;
		this.address = address;
		this.exp = exp;
		this.phone = phone;
		this.age = age;
	}
	Student(String name, String address, String exp, String phone, int age) {
		this.name = name;
		this.address = address;
		this.exp = exp;
		this.phone = phone;
		this.age = age;
	}
	
	public Student(String name, String address, String phone) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", phone=" + phone + "]";
	}

	
	
	
	
}
