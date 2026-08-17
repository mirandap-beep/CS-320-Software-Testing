package contact;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class ContactTest {

    @Test
    void testContactCreation() {

        Contact contact = new Contact(
                "1001",
                "Miranda",
                "Perez",
                "5551234567",
                "123 Main Street");

        assertEquals("1001", contact.getContactId());
        assertEquals("Miranda", contact.getFirstName());
        assertEquals("Perez", contact.getLastName());
        assertEquals("5551234567", contact.getPhone());
        assertEquals("123 Main Street", contact.getAddress());
    }

    @Test
    void testContactIdTooLong() {

        assertThrows(IllegalArgumentException.class, () -> {

            new Contact(
                    "12345678901",
                    "Miranda",
                    "Perez",
                    "5551234567",
                    "123 Main Street");
        });
    }

    @Test
    void testContactIdNull() {

        assertThrows(IllegalArgumentException.class, () -> {

            new Contact(
                    null,
                    "Miranda",
                    "Perez",
                    "5551234567",
                    "123 Main Street");
        });
    }

    @Test
    void testFirstNameTooLong() {

        assertThrows(IllegalArgumentException.class, () -> {

            new Contact(
                    "1001",
                    "MirandaLong",
                    "Perez",
                    "5551234567",
                    "123 Main Street");
        });
    }

    @Test
    void testFirstNameNull() {

        assertThrows(IllegalArgumentException.class, () -> {

            new Contact(
                    "1001",
                    null,
                    "Perez",
                    "5551234567",
                    "123 Main Street");
        });
    }

    @Test
    void testLastNameTooLong() {

        assertThrows(IllegalArgumentException.class, () -> {

            new Contact(
                    "1001",
                    "Miranda",
                    "CelestePerez",
                    "5551234567",
                    "123 Main Street");
        });
    }

    @Test
    void testLastNameNull() {

        assertThrows(IllegalArgumentException.class, () -> {

            new Contact(
                    "1001",
                    "Miranda",
                    null,
                    "5551234567",
                    "123 Main Street");
        });
    }

    @Test
    void testPhoneTooShort() {

        assertThrows(IllegalArgumentException.class, () -> {

            new Contact(
                    "1001",
                    "Miranda",
                    "Perez",
                    "5551234",
                    "123 Main Street");
        });
    }

    @Test
    void testPhoneTooLong() {

        assertThrows(IllegalArgumentException.class, () -> {

            new Contact(
                    "1001",
                    "Miranda",
                    "Perez",
                    "55512345678",
                    "123 Main Street");
        });
    }

    @Test
    void testPhoneContainsLetters() {

        assertThrows(IllegalArgumentException.class, () -> {

            new Contact(
                    "1001",
                    "Miranda",
                    "Perez",
                    "555ABC4567",
                    "123 Main Street");
        });
    }

    @Test
    void testPhoneNull() {

        assertThrows(IllegalArgumentException.class, () -> {

            new Contact(
                    "1001",
                    "Miranda",
                    "Perez",
                    null,
                    "123 Main Street");
        });
    }

    @Test
    void testAddressTooLong() {

        assertThrows(IllegalArgumentException.class, () -> {

            new Contact(
                    "1001",
                    "Miranda",
                    "Perez",
                    "5551234567",
                    "1234567890123456789012345678901");
        });
    }

    @Test
    void testAddressNull() {

        assertThrows(IllegalArgumentException.class, () -> {

            new Contact(
                    "1001",
                    "Miranda",
                    "Perez",
                    "5551234567",
                    null);
        });
    }

    @Test
    void testSetFirstName() {

        Contact contact = new Contact(
                "1001",
                "Miranda",
                "Perez",
                "5551234567",
                "123 Main Street");

        contact.setFirstName("Celeste");

        assertEquals("Celeste", contact.getFirstName());
    }

    @Test
    void testSetLastName() {

        Contact contact = new Contact(
                "1001",
                "Miranda",
                "Perez",
                "5551234567",
                "123 Main Street");

        contact.setLastName("Ortiz");

        assertEquals("Ortiz", contact.getLastName());
    }

    @Test
    void testSetPhone() {

        Contact contact = new Contact(
                "1001",
                "Miranda",
                "Perez",
                "5551234567",
                "123 Main Street");

        contact.setPhone("5559876543");

        assertEquals("5559876543", contact.getPhone());
    }

    @Test
    void testSetAddress() {

        Contact contact = new Contact(
                "1001",
                "Miranda",
                "Perez",
                "5551234567",
                "123 Main Street");

        contact.setAddress("456 Oak Avenue");

        assertEquals("456 Oak Avenue", contact.getAddress());
    }

    @Test
    void testSetFirstNameNull() {

        Contact contact = new Contact(
                "1001",
                "Miranda",
                "Perez",
                "5551234567",
                "123 Main Street");

        assertThrows(
                IllegalArgumentException.class,
                () -> contact.setFirstName(null));
    }

    @Test
    void testSetLastNameTooLong() {

        Contact contact = new Contact(
                "1001",
                "Miranda",
                "Perez",
                "5551234567",
                "123 Main Street");

        assertThrows(
                IllegalArgumentException.class,
                () -> contact.setLastName("CelestePerez"));
    }

    @Test
    void testSetPhoneInvalid() {

        Contact contact = new Contact(
                "1001",
                "Miranda",
                "Perez",
                "5551234567",
                "123 Main Street");

        assertThrows(
                IllegalArgumentException.class,
                () -> contact.setPhone("5551234"));
    }

    @Test
    void testSetAddressTooLong() {

        Contact contact = new Contact(
                "1001",
                "Miranda",
                "Perez",
                "5551234567",
                "123 Main Street");

        assertThrows(
                IllegalArgumentException.class,
                () -> contact.setAddress(
                        "1234567890123456789012345678901"));
    }
}