//Kyla Gray
package contact;
import java.util.HashMap;
import java.util.Map;

//map to prevent duplicate ID numbers 
public class ContactService {
	private final Map<String, Contact> contactMap;
	
	public ContactService() {
		this.contactMap = new HashMap<>();
	}
	
	public boolean addContact(Contact contact) {
		if(contact == null || contactMap.containsKey(contact.getContactID())) {
			return false;
		}
		contactMap.put(contact.getContactID(), contact);
		return true;
	}
	
	public boolean deleteContact(String contactID) {
		if(contactID == null || !contactMap.containsKey(contactID)) {
			return false;
		}
		contactMap.remove(contactID);
		return true;
	}
	
	public boolean updateContact(String contactID, String firstName, String lastName, String phone, String address) {
		if(contactID == null || !contactMap.containsKey(contactID)) {
			return false;
		}
		Contact contact = contactMap.get(contactID);
		
		if(firstName != null && firstName.length() <= 10) {
			contact.setFirstName(firstName);
		}
		if(lastName != null && lastName.length() <= 10) {
			contact.setLastName(lastName);
		}
		if(phone != null && phone.length() == 10) {
			contact.setPhone(phone);
		}
		if(address != null && address.length() <= 30) {
			contact.setAddress(address);
		}
		return true;
	}
	
	public Contact getContactByID(String contactID) {
		return contactMap.get(contactID);
	}
	
	
}

