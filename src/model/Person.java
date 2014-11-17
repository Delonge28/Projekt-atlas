package model;

/**
 * @author Pelle
 *
 */
public class Person {

	private String CPR;
	private String fName;
	private String lName;
	private String streetName;
	private String streetNumber;
	private String email;
	private String phonenumber;
	private City city;
	
	public Person(String CPR, String fName, String lName, String streetName, String streetNumber, String email, String phonenumber, City city) {
		
		this.CPR = CPR;
		this.fName = fName;
		this.lName = lName;
		this.streetName = streetName;
		this.streetNumber = streetNumber;
		this.email = email;
		this.phonenumber = phonenumber;
		this.setCity(city);
	}
	
	public String getPhoneNumber() {
		return phonenumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phonenumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getCPR() {
		return CPR;
	}

	public void setCPR(String CPR) {
		this.CPR = CPR;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}
	
}
