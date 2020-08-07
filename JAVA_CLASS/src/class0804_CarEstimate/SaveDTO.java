package class0804_CarEstimate;

public class SaveDTO {

	private int membernumber;
	private String companyname;
	private String carName;
	private String carTypeName;
	private String optionName;
	private String colorName;
	private String cardName;
	private int monthName;
	private int interest;
	private int totalPrice;
	private int payment;
	private	int monthprice;
	private String id;
	private String pw;
	public int getMembernumber() {
		return membernumber;
	}
	public void setMembernumber(int membernumber) {
		this.membernumber = membernumber;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarTypeName() {
		return carTypeName;
	}
	public void setCarTypeName(String carTypeName) {
		this.carTypeName = carTypeName;
	}
	public String getOptionName() {
		return optionName;
	}
	public void setOptionName(String optionName) {
		this.optionName = optionName;
	}
	public String getColorName() {
		return colorName;
	}
	public void setColorName(String colorName) {
		this.colorName = colorName;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public int getMonthName() {
		return monthName;
	}
	public void setMonthName(int monthName) {
		this.monthName = monthName;
	}
	public int getInterest() {
		return interest;
	}
	public void setInterest(int interest) {
		this.interest = interest;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getPayment() {
		return payment;
	}
	public void setPayment(int payment) {
		this.payment = payment;
	}
	public int getMonthprice() {
		return monthprice;
	}
	public void setMonthprice(int monthprice) {
		this.monthprice = monthprice;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public SaveDTO(int membernumber, String companyname, String carName, String carTypeName, String optionName,
			String colorName, String cardName, int monthName, int interest, int totalPrice, int payment, int monthprice,
			String id, String pw) {
		super();
		this.membernumber = membernumber;
		this.companyname = companyname;
		this.carName = carName;
		this.carTypeName = carTypeName;
		this.optionName = optionName;
		this.colorName = colorName;
		this.cardName = cardName;
		this.monthName = monthName;
		this.interest = interest;
		this.totalPrice = totalPrice;
		this.payment = payment;
		this.monthprice = monthprice;
		this.id = id;
		this.pw = pw;
	}
	public SaveDTO() {
		super();
	}
	@Override
	public String toString() {
		return "SaveDTO [membernumber=" + membernumber + ", companyname=" + companyname + ", carName=" + carName
				+ ", carTypeName=" + carTypeName + ", optionName=" + optionName + ", colorName=" + colorName
				+ ", cardName=" + cardName + ", monthName=" + monthName + ", interest=" + interest + ", totalPrice="
				+ totalPrice + ", payment=" + payment + ", monthprice=" + monthprice + ", id=" + id + ", pw=" + pw
				+ "]";
	}

	
}