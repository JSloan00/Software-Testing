package contact;

public class Contact {

	private String id;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	//method to throw exception if variables do not meet requirements
	public Contact(String id, String firstName, String lastName, String phone, String address) {
		if (id == null || id.length()>10) {
			throw new IllegalArgumentException("Invalid id");
		}
		if (firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid first name");
		}
		if (lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid last name");
		}
		if (phone == null || phone.length()<10 || phone.length()>10) {
			throw new IllegalArgumentException("Invalid phone number");
		}
		if (address == null || address.length()>30) {
			throw new IllegalArgumentException("Invalid address");
		}
		
		//set variables if pass requirement check
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
		 
	}
	
	//getter methods
	public String getId() {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		if(firstName.length() <= 10 && firstName != null) {
			this.firstName = firstName;
		}
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		if(lastName.length() <= 10 && lastName != null) {
			this.lastName = lastName;
		}
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		if (phone.length() == 10 && phone != null) {
			this.phone = phone;
		}
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		if (address.length() <= 30 && address != null) {
			this.address = address;
		}
	}
}
