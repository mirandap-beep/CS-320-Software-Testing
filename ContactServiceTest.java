package contact;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContactServiceTest {

    private ContactService service;
    private Contact contact;

    @BeforeEach
    void setUp() {

        service = new ContactService();

        contact = new Contact(
                "1001",
                "Miranda",
                "Perez",
                "5551234567",
                "123 Main Street");
    }

    @Test
    void testAddContact() {

        service.addContact(contact);

        Contact storedContact = service.findContact("1001");

        assertEquals(contact, storedContact);
    }

    @Test
    void testAddDuplicateContact() {

        service.addContact(contact);

        Contact duplicateContact = new Contact(
                "1001",
                "Mira",
                "Hayes",
                "5559876543",
                "456 Oak Avenue");

        assertThrows(
                IllegalArgumentException.class,
                () -> service.addContact(duplicateContact));
    }

    @Test
    void testAddNullContact() {

        assertThrows(
                IllegalArgumentException.class,
                () -> service.addContact(null));
    }

    @Test
    void testFindContact() {

        service.addContact(contact);

        Contact storedContact = service.findContact("1001");

        assertEquals("1001", storedContact.getContactId());
    }

    @Test
    void testFindContactNotFound() {

        assertThrows(
                IllegalArgumentException.class,
                () -> service.findContact("9999"));
    }

    @Test
    void testDeleteContact() {

        service.addContact(contact);

        service.deleteContact("1001");

        assertThrows(
                IllegalArgumentException.class,
                () -> service.findContact("1001"));
    }

    @Test
    void testDeleteContactNotFound() {

        assertThrows(
                IllegalArgumentException.class,
                () -> service.deleteContact("9999"));
    }

    @Test
    void testUpdateFirstName() {

        service.addContact(contact);

        service.updateFirstName("1001", "Mira");

        assertEquals(
                "Mira",
                service.findContact("1001").getFirstName());
    }

    @Test
    void testUpdateLastName() {

        service.addContact(contact);

        service.updateLastName("1001", "Hayes");

        assertEquals(
                "Hayes",
                service.findContact("1001").getLastName());
    }

    @Test
    void testUpdatePhone() {

        service.addContact(contact);

        service.updatePhone("1001", "5559876543");

        assertEquals(
                "5559876543",
                service.findContact("1001").getPhone());
    }

    @Test
    void testUpdateAddress() {

        service.addContact(contact);

        service.updateAddress("1001", "456 Oak Avenue");

        assertEquals(
                "456 Oak Avenue",
                service.findContact("1001").getAddress());
    }

    @Test
    void testUpdateFirstNameInvalid() {

        service.addContact(contact);

        assertThrows(
                IllegalArgumentException.class,
                () -> service.updateFirstName("1001", null));
    }

    @Test
    void testUpdateLastNameInvalid() {

        service.addContact(contact);

        assertThrows(
                IllegalArgumentException.class,
                () -> service.updateLastName(
                        "1001",
                        "CelestePerez"));
    }

    @Test
    void testUpdatePhoneInvalid() {

        service.addContact(contact);

        assertThrows(
                IllegalArgumentException.class,
                () -> service.updatePhone(
                        "1001",
                        "5551234"));
    }

    @Test
    void testUpdateAddressInvalid() {

        service.addContact(contact);

        assertThrows(
                IllegalArgumentException.class,
                () -> service.updateAddress(
                        "1001",
                        "1234567890123456789012345678901"));
    }

    @Test
    void testUpdateContactNotFound() {

        assertThrows(
                IllegalArgumentException.class,
                () -> service.updateFirstName(
                        "9999",
                        "Mira"));
    }
}