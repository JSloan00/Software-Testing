package contact;

import java.util.ArrayList;

public class ContactService {
	public static ArrayList<Contact>contacts = new ArrayList<>();
	
	public static boolean addContact (Contact newContact) {
		boolean exists = false;
		for (Contact c : contacts) {
			if (c.getId().equalsIgnoreCase(newContact.getId())) {
				exists = true;
				break;
			}
		}
		
		if (!exists) {
			contacts.add(newContact);
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean deleteContact(String id) {
		boolean delete = false;
		
		for (Contact c : contacts) {
			if (c.getId().equalsIgnoreCase(id)) {
				contacts.remove(c);
				delete = true;
				break;
			}
		}
		return delete;
	}
	
	public static boolean updateFirstName(String id, String newFirstName ) {
		boolean update = false;
		
		for (Contact c : contacts) {
			if (c.getId().equalsIgnoreCase(id)) {
				c.setFirstName(newFirstName);
				update = true;
				break;
			}
		}
		return update;
	}
	
	public static boolean updateLastName(String id, String newLastName) {
		boolean update = false;
		
		for (Contact c : contacts) {
			if (c.getId().equalsIgnoreCase(id)) {
				c.setLastName(newLastName);
				update = true;
				break;
			}
		}
		return update;
	}
	
	public static boolean updatePhone(String id, String newPhone) {
		boolean update = false;
		
		for (Contact c : contacts) {
			if (c.getId().equalsIgnoreCase(id)) {
				c.setPhone(newPhone);
				update = true;
				break;
			}
		}
		return update;
	}
	
	public static boolean updateAddress(String id, String newAddress) {
		boolean update = false;
		
		for (Contact c : contacts) {
			if (c.getId().equalsIgnoreCase(id)) {
				c.setAddress(newAddress);
				update = true;
				break;
			}
		}
		return update;
	}
	
	
}
