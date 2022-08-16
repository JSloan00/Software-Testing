package test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import contact.Contact;
import contact.ContactService;

class ContactServiceTest {	

	@Test
	public void testAddContact() {
		Contact newContact1 = new Contact("0001", "Bob", "Smith", "8001234567", "100 Street Dr");		
		assertEquals(false, ContactService.addContact(newContact1));
	}

	@Test
	public void testDeleteContact() {
		Contact newContact = new Contact("0001", "Bob", "Smith", "8001234567", "100 Street Dr");
		ContactService.addContact(newContact);
		assertEquals(true, ContactService.deleteContact(newContact.getId()));
	}

	@Test
	public void testUpdateFirstName() {
		Contact newContact = new Contact("0001", "Bob", "Smith", "8001234567", "100 Street Dr");
		ContactService.updateFirstName(newContact.getId(), "Joe");
		assertTrue(ContactService.addContact(newContact));	
	}

	@Test
	public void testUpdateLastName() {
		Contact newContact = new Contact("0001", "Bob", "Smith", "8001234567", "100 Street Dr");
		ContactService.updateLastName(newContact.getId(), "Doe");
		assertTrue(ContactService.addContact(newContact));
	}
	
	@Test
	public void testContactServiceUpdatePhone() {
	Contact newContact = new Contact("0001", "Bob", "Smith", "8001234567", "100 Street Dr");
	ContactService.updatePhone(newContact.getId(), "1234567890");
	assertTrue(ContactService.addContact(newContact));
	}

	@Test
	public void testContactServiceUpdateAddress() {
	Contact newContact = new Contact("0001", "Bob", "Smith", "8001234567", "100 Street Dr");
	ContactService.updateAddress(newContact.getId(), "1000 Road rd");
	assertTrue(ContactService.addContact(newContact));
	}
}

//JUnit test 80.7% coverage for Contact Service class