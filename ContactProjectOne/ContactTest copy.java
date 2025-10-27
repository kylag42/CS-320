package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import contact.Contact;

class ContactTest {

	@Test
	void testContactClass() {
		Contact contact = new Contact("contact1", "Kyla", "Gray", "1213409853","303 Test Rd");
		assertTrue(contact.getContactID().equals("contact1"));
		assertTrue(contact.getFirstName().equals("Kyla"));
		assertTrue(contact.getLastName().equals("Gray"));
		assertTrue(contact.getPhone().equals("1213409853"));
		assertTrue(contact.getAddress().equals("303 Test Rd"));
	}
	
	@Test
	void testContactIDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("contact12345", "Kyla", "Gray", "1213409853","303 Test Rd");
		});
	}
	
	@Test
	void testContactIDNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Kyla", "Gray", "1213409853","303 Test Rd");
		});
	}
	
	@Test 
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("contact1", "Kylaasdfghjj", "Gray", "1213409853","303 Test Rd");
		});
	}
	
	@Test
	void testFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("contact1", null, "Gray", "1213409853","303 Test Rd");
		});
		
	}
	
	@Test 
	void testSetFirstName() {
		Contact contact2 = new Contact("contact2", "Kyla", "Gray", "1213409853","303 Test Rd");
		contact2.setFirstName("Kyla2");
		assertEquals("Kyla2", contact2.getFirstName());
	}
	
	@Test 
	void testLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("contact1", "Kyla", "Grayasdfghjj", "1213409853","303 Test Rd");
		});
	}
	
	@Test
	void testLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("contact1", "Kyla", null, "1213409853","303 Test Rd");
		});
		
	}
	
	@Test
	void testSetLastName() {
		Contact contact2 = new Contact("contact2", "Kyla", "Gray", "1213409853","303 Test Rd");
		contact2.setLastName("Gray2");
		assertEquals("Gray2", contact2.getLastName());
	}
	
	@Test 
	void testPhoneTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("contact1", "Kyla", "Gray", "121340985323843732","303 Test Rd");
		});
	}
	
	@Test
	void testPhoneTooShort() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("contact1", "Kyla", "Gray", "12134","303 Test Rd");
		});
	}
	
	
	
	@Test
	void testPhoneNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("contact1", null, "Gray", null,"303 Test Rd");
		});
		
	}
	
	@Test
	void testAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("contact1", "Kyla", "Gray", "1213409853","303 Test Rd1234567890123456678902934");
		});
	}
	
	@Test
	void testAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Kyla", "Gray", "1213409853", null);
		});
	}
	
	
	
	

}
