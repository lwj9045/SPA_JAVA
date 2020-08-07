package class0804_CarEstimate;

public class ChoiceDTO {
	private int companynumber;
	private int carNumber;
	private int carTypeNumber;
	private int optionNumber;
	private int colorNumber;
	private int cardNumber;
	private int monthNumber;

	public int getCompanynumber() {
		return companynumber;
	}

	public void setCompanynumber(int companynumber) {
		this.companynumber = companynumber;
	}

	public int getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(int carNumber) {
		this.carNumber = carNumber;
	}

	public int getCarTypeNumber() {
		return carTypeNumber;
	}

	public void setCarTypeNumber(int carTypeNumber) {
		this.carTypeNumber = carTypeNumber;
	}

	public int getOptionNumber() {
		return optionNumber;
	}

	public void setOptionNumber(int optionNumber) {
		this.optionNumber = optionNumber;
	}

	public int getColorNumber() {
		return colorNumber;
	}

	public void setColorNumber(int colorNumber) {
		this.colorNumber = colorNumber;
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getMonthNumber() {
		return monthNumber;
	}

	public void setMonthNumber(int monthNumber) {
		this.monthNumber = monthNumber;
	}

	public ChoiceDTO(int companynumber, int carNumber, int carTypeNumber, int optionNumber, int colorNumber,
			int cardNumber, int monthNumber) {
		super();
		this.companynumber = companynumber;
		this.carNumber = carNumber;
		this.carTypeNumber = carTypeNumber;
		this.optionNumber = optionNumber;
		this.colorNumber = colorNumber;
		this.cardNumber = cardNumber;
		this.monthNumber = monthNumber;
	}

	public ChoiceDTO() {
		super();
	}

	@Override
	public String toString() {
		return "ChoiceDTO [companynumber=" + companynumber + ", carNumber=" + carNumber + ", carTypeNumber="
				+ carTypeNumber + ", optionNumber=" + optionNumber + ", colorNumber=" + colorNumber + ", cardNumber="
				+ cardNumber + ", monthNumber=" + monthNumber + "]";
	}
}
