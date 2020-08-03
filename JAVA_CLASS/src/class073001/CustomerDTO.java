package class073001;

public class CustomerDTO {
	// custid, name, address, phone �ʵ� ������ ��
	// �� �ʵ忡 ���� getter,setter
	// ����ʵ带 �Ű��������ϴ� ������, �⺻������
	// toString �޼ҵ� ����
	
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
