package by.htp.project.bank.entity;

public class Customer {
	private String firstName, lastName, midleName;
	private String adress;
	private int numberCreditCard;
	private int id;

	public Customer() {
	}

	public Customer(int id, String lastName, String firstName, String midleName, String adress, int numberCrditCard) {
		this.id = id;
		this.lastName = lastName;
		this.midleName = midleName;
		this.firstName = firstName;
		this.adress = adress;
		this.numberCreditCard = numberCrditCard;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMidleName() {
		return midleName;
	}

	public void setMidleName(String midleName) {
		this.midleName = midleName;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getNumberCreditCard() {
		return numberCreditCard;
	}

	public void setNumberCreditCard(int numberCreditCard) {
		this.numberCreditCard = numberCreditCard;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return id + "   " + lastName + "\t" + firstName + "\t" + "\t" + midleName + "\t" + adress + "\t"
				+ numberCreditCard;
	}

}
