package class073001;

public class CustomerDTO {
	// custid, name, address, phone 필드 생성한 후
	// 각 필드에 대한 getter,setter
	// 모든필드를 매개변수로하는 생성자, 기본생성자
	// toString 메소드 선언
	
	private int custid;
	private String name;
	private String address;
	private String phone;
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	
	public CustomerDTO(int custid, String name, String address, String phone) {
		super();
		this.custid = custid;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	public CustomerDTO() {
		super();
	}
	@Override
	public String toString() {
		return "CustomerDTO [custid=" + custid + ", name=" + name + ", address=" + address + ", phone=" + phone + "]";
	}
	
	
}
