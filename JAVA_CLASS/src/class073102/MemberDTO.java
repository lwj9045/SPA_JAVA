package class073102;

public class MemberDTO {

	private String mid;
	private String mpassword;
	private String mname;
	private String mphone;
	private int mage;

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getMpassword() {
		return mpassword;
	}

	public void setMpassword(String mpassword) {
		this.mpassword = mpassword;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getMphone() {
		return mphone;
	}

	public void setMphone(String mphone) {
		this.mphone = mphone;
	}

	public int getMage() {
		return mage;
	}

	public void setMage(int mage) {
		this.mage = mage;
	}

	public MemberDTO(String mid, String mpassword, String mname, String mphone, int mage) {
		super();
		this.mid = mid;
		this.mpassword = mpassword;
		this.mname = mname;
		this.mphone = mphone;
		this.mage = mage;
	}

	public MemberDTO() {
		super();
	}

	@Override
	public String toString() {
		return "MemberDTO [mid=" + mid + ", mpassword=" + mpassword + ", mname=" + mname + ", mphone=" + mphone
				+ ", mage=" + mage + "]";
	}

}
