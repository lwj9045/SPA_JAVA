package class073101;

import java.sql.Date;

public class ICIADTO {
	private int mnumber;
	private String mname;
	private String maddress;
	private String mphone;
	private String mbirth;

	public int getMnumber() {
		return mnumber;
	}

	public void setMnumber(int mnumber) {
		this.mnumber = mnumber;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getMaddress() {
		return maddress;
	}

	public void setMaddress(String maddress) {
		this.maddress = maddress;
	}

	public String getMphone() {
		return mphone;
	}

	public void setMphone(String mphone) {
		this.mphone = mphone;
	}

	public String getMbirth() {
		return mbirth;
	}

	public void setMbirth(String mbirth) {
		this.mbirth = mbirth;
	}

	public ICIADTO(int mnumber, String mname, String maddress, String mphone, String mbirth) {
		super();
		this.mnumber = mnumber;
		this.mname = mname;
		this.maddress = maddress;
		this.mphone = mphone;
		this.mbirth = mbirth;
	}

	public ICIADTO() {
		super();
	}

}
