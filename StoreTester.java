import static org.junit.jupiter.api.Assertions.*;

public class StoreTester {
    Store store;
    Store storeEx;

    @org.junit.jupiter.api.BeforeEach
    void examples(){
        store = new Store();
        storeEx = new Store();
        Phone phoneOne = new Phone(
                "Huawei 10",
                "China",
                "A lovely device",
                103.00,
                256,
                "Huawei 10",
                "Huawai",
                "Android",
                "5G",
                6.0
        );
        Phone phoneTwo = new Phone(
                "iPhone 11",
                "USA",
                "A usable device",
                1123.89,
                220,
                "iPhone 11",
                "Apple",
                "iOS",
                "4G",
                5.4
        );
        Phone phoneThree = new Phone(
                "Galaxy S2",
                "Hong Kong",
                "A nice device",
                1000.3,
                230,
                "Galaxy S2",
                "Samsung",
                "Android",
                "5G",
                6.5
        );
        storeEx.addPhone(phoneOne);
        storeEx.addPhone(phoneTwo);
        storeEx.addPhone(phoneThree);
        Magazine magazineOne = new Magazine(
                "Wired",
                "Unknown",
                "A magazine focusing on technology and its effects",
                4.99,
                83,
                "March 1934",
                "Wired Corp",
                "The Future of AI",
                "March 2021"
        );
        Magazine magazineTwo = new Magazine(
                "Vogue",
                "Unknown",
                "A fashion and lifestyle magazine",
                3.89,
                46,
                "Dec 1998",
                "Vogue",
                "The Art of Fashion",
                "February 2000"
        );
        Magazine magazineThree = new Magazine(
                "The Economist",
                "Unknown",
                "A weekly publication offering analysis of current events",
                12.34,
                129,
                "February 1856",
                "The Economist",
                "Global Economic Outlook",
                "Oct 2013"
        );
        storeEx.addMagazine(magazineOne);
        storeEx.addMagazine(magazineTwo);
        storeEx.addMagazine(magazineThree);
    }
    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        store = null;
    }

    @org.junit.jupiter.api.Test
    void addBookTest(){
        Book book = new Book(
                "To Kill a MockingBird",
                "Maycomb, Alabama",
                "A lawyer attempts to prove the innocence of Tom Robinson, a black man who has been wrongly accused of raping a white woman.",
                206.72,
                99121,
                "July 11, 1960",
                "Harper Lee",
                "9780446310789",
                "International Edition",
                "To Kill a MockingBird"
        );
        store.addBook(book);
        assertEquals(1,store.getItems("Book").size());
    }

    @org.junit.jupiter.api.Test
    void addBookAndPhoneTest(){
        Book book = new Book(
                "To Kill a MockingBird",
                "Maycomb, Alabama",
                "A lawyer attempts to prove the innocence of Tom Robinson, a black man who has been wrongly accused of raping a white woman.",
                206.72,
                99121,
                "July 11, 1960",
                "Harper Lee",
                "9780446310789",
                "International Edition",
                "To Kill a MockingBird"
        );

        Phone phone = new Phone(
                "Vivo 2006",
                "China",
                "A malfunctioning device",
                1198,
                256,
                "vivo 2006",
                "Vivo",
                "Android",
                "5G",
                6.0
        );
        store.addBook(book);
        store.addPhone(phone);
        assertEquals(1,store.getItems("Book").size());
        assertEquals(1,store.getItems("Phone").size());
        assertEquals(2,store.getCisItems().size());
    }

    @org.junit.jupiter.api.Test
    void updateAndGetPhonesTest(){
        storeEx.updatePhoneLocation("Room 512");
        storeEx.getAllPhones().forEach(phone -> assertEquals("Room 512", phone.getLocation()));
    }
    @org.junit.jupiter.api.Test
    void getItemsTest() {
        assertEquals(3, storeEx.getItems("Phone").size());
        assertEquals(3, storeEx.getItems("Magazine").size());
    }
    @org.junit.jupiter.api.Test
    void updateItemsTest(){
        storeEx.updateItems("Phone", "location", "Room 512");
        storeEx.getAllPhones().forEach(phone -> assertEquals("Room 512", phone.getLocation()));
        storeEx.updateItems("Magazine", "price","3.89");
        storeEx.getItems("Magazine").forEach(Magazine -> assertEquals(3.89, Magazine.getPrice()));
    }
}
