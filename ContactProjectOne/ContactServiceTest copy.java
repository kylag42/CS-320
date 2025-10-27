package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import contact.Contact;
import contact.ContactService;

class ContactServiceTest {

	@Test
	void testAddContact() {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("contact1", "Kyla", "Gray", "1213409853","303 Test Rd");
		
		contactService.addContact(contact);
		assertTrue(contact.getContactID().equals("contact1"));
		assertTrue(contact.getFirstName().equals("Kyla"));
		assertTrue(contact.getLastName().equals("Gray"));
		assertTrue(contact.getPhone().equals("1213409853"));
		assertTrue(contact.getAddress().equals("303 Test Rd"));
		
		
	}
	
	@Test
	void testDeleteContact() {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("contact1", "Kyla", "Gray", "1213409853","303 Test Rd");
		contactService.addContact(contact);
		contactService.deleteContact("contact1");
		assertNull(contactService.getContactByID("contact1"));
	}
	
	@Test
	void testUpdateContact() {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("contact1", "Kyla", "Gray", "1213409853","303 Test Rd");
		contactService.addContact(contact);
		contactService.updateContact("contact1", "Leah", "Barett", "1295038592", "101 Test Lane");
		Contact contactUpdated = contactService.getContactByID("contact1");
		assertTrue(contactUpdated.getContactID().equals("contact1"));
		assertTrue(contactUpdated.getFirstName().equals("Leah"));
		assertTrue(contactUpdated.getLastName().equals("Barett"));
		assertTrue(contactUpdated.getPhone().equals("1295038592"));
		assertTrue(contactUpdated.getAddress().equals("101 Test Lane"));
		
	}
	
	@Test
	void testGetContactByID() {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("contact1", "Kyla", "Gray", "1213409853","303 Test Rd");
		contactService.addContact(contact);
		Contact functionContact = contactService.getContactByID("contact1");
		assertEquals("contact1", functionContact.getContactID());
		assertEquals("Kyla", functionContact.getFirstName());
		assertEquals("Gray", functionContact.getLastName());
		assertEquals("1213409853", functionContact.getPhone());
		assertEquals("303 Test Rd", functionContact.getAddress());
		
		
		
	}

}
