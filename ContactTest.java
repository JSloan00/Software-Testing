package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import contact.Contact;

class ContactTest {

	@Test
	public void testContactClass() {
		Contact contactClass = new Contact("0001", "Bob", "Smith", "8001234567", "100 Street Dr");
		assertTrue(contactClass.getId().equals("0001"));
		assertTrue(contactClass.getFirstName().equals("Bob"));
		assertTrue(contactClass.getLastName().equals("Smith"));
		assertTrue(contactClass.getPhone().equals("8001234567"));
		assertTrue(contactClass.getAddress().equals("100 Street Dr"));
				
	}

	@Test
	public void testContactClassIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact ("00000000001", "Bob", "Smith", "8001234567", "100 Street Dr");
		});
	}
	
	@Test
	public void testContactClassIdIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact (null, "Bob", "Smith", "8001234567", "100 Street Dr");
		});
	}
	
	
	@Test
	void testContactClassFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact ("0001", "Verylongname", "Smith", "8001234567", "100 Street Dr");
		});
	}
	
	@Test
	public void testContactClassFirstNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact ("0001", null, "Smith", "8001234567", "100 Street Dr");
		});
	}	
	
	@Test
	public void testContactClassLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact ("0001", "Bob", "Verylongname", "8001234567", "100 Street Dr");
		});
	}
	
	@Test
	public void testContactClassLastNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact ("0001", "Bob", null, "8001234567", "100 Street Dr");
		});
	}
	
	@Test
	public void testContactClassPhoneTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact ("0001", "Bob", "Smith", "800123456700", "100 Street Dr");
		});
	}
	
	@Test
	public void testContactClassPhoneIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact ("0001", "Bob", "Smith", null, "100 Street Dr");
		});
	}
	
	@Test
	public void testContactClassAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact ("0001", "Bob", "Smith", "8001234567", "100 Street Dr                  ");
		});
	}
	
	@Test
	public void testContactClassAddressIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact ("0001", "Bob", "Smith", "8001234567", null);
		});
	}
	
	//test set address
	@Test
	public void testSetAddress() {
		Contact contactClass = new Contact("0001", "Bob", "Smith", "8001234567", "100 Street Dr");
		contactClass.setAddress("100 New Address Rd");
		assertTrue(contactClass.getAddress() == "100 New Address Rd");
	}
	
	//test set first name
	@Test
	public void testSetFirstName() {
		Contact contactClass = new Contact("0001", "Bob", "Smith", "8001234567", "100 Street Dr");
		contactClass.setFirstName("Joe");
		assertTrue(contactClass.getFirstName() == "Joe");
	}
	
	//test set last name
	@Test
	public void testSetLastName() {
		Contact contactClass = new Contact("0001", "Bob", "Smith", "8001234567", "100 Street Dr");
		contactClass.setLastName("Doe");
		assertTrue(contactClass.getLastName() == "Doe");
	}
	
	//test set phone
	@Test
	public void testSetPhone() {
		Contact contactClass = new Contact("0001", "Bob", "Smith", "8001234567", "100 Street Dr");
		contactClass.setPhone("8009874563");
		assertTrue(contactClass.getPhone() == "8009874563");
	}

}
//JUnit test 100% coverage for contact class
