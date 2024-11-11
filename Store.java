import java.util.ArrayList;

public class Store {
    private ArrayList<CISItem> cisItems;
    public Store(){
        cisItems = new ArrayList<>();
    }

    public void setCisItems(ArrayList<CISItem> cisItems) {
        this.cisItems = cisItems;
    }

    public ArrayList<CISItem> getCisItems() {
        return cisItems;
    }

    public void addBook(Book book){
        cisItems.add(book);
    }

    public void addPhone(Phone phone){
        cisItems.add(phone);
    }
    public void addMagazine(Magazine magazine) {
        cisItems.add(magazine);
    }
    public void addArduino(Arduino arduino) {
        cisItems.add(arduino);
    }

    public ArrayList<CISItem> getItems(String itemType){
        ArrayList<CISItem> items = new ArrayList<>();
        for (int i = 0; i < cisItems.size(); i++){
            CISItem item = cisItems.get(i);
            if (item.getClass().getSimpleName().equals(itemType)){ //simpleName: get the name of the class
                items.add(item);
            }
        }
        return items;
    }

    public void updatePhoneLocation(String location){
        for (int i = 0; i < cisItems.size(); i++){
            CISItem item = cisItems.get(i);
            if (item instanceof Phone){
                item.setLocation(location);
            }
        }
    }

    public ArrayList<Phone> getAllPhones(){
        ArrayList<Phone> phones = new ArrayList<>();
        for (int i = 0; i < cisItems.size(); i++){
            CISItem item = cisItems.get(i);
            if (item instanceof Phone){ //simpleName: get the name of the class
                phones.add((Phone) item);
            }
        }
        return phones;
    }

    public void updateItems(String itemType, String property, String value){
        for (int i = 0; i < cisItems.size(); i++){
            CISItem item = cisItems.get(i);
            if (item.getClass().getSimpleName().equals(itemType)){
                if (property.equals("location")){
                    item.setLocation(value);
                } else if (property.equals("description")) {
                    item.setDescription(value);
                } else if (property.equals("price")) {
                    item.setPrice(Double.parseDouble(value));
                } else if (item instanceof ReadingItem) {
                    updateReadingItem((ReadingItem) item, property, value);
                } else if (item instanceof Magazine) {
                    updateMagazine((Magazine) item, property, value);
                } else if (item instanceof Book) {
                    updateBook((Book) item, property, value);
                } else if (item instanceof ElectronicItem) {
                    updateElectronicItem((ElectronicItem) item, property, value);
                } else if (item instanceof Phone) {
                    updatePhone((Phone) item, property, value);
                } else if (item instanceof Arduino) {
                    updateArduino((Arduino) item, property, value);
                } else {
                    throw new IllegalArgumentException("Invalid property");
                }
            }
        }
    }

    private void updateReadingItem(ReadingItem item, String property, String value) {
        if (property.equals("wordCount")) {
            item.setWordCount(Integer.parseInt(value));
        } else if (property.equals("datePublished")) {
            item.setDatePublished(value);
        } else if (property.equals("author")) {
            item.setAuthor(value);
        } else {
            throw new IllegalArgumentException("Invalid property for ReadingItem");
        }
    }

    private void updateMagazine(Magazine item, String property, String value) {
        if (property.equals("coverStoryTitle")) {
            item.setCoverStoryTitle(value);
        } else if (property.equals("printDate")) {
            throw new IllegalArgumentException("Cannot update print date");
        } else {
            throw new IllegalArgumentException("Invalid property for Magazine");
        }
    }

    private void updateBook(Book item, String property, String value) {
        if (property.equals("isbn")) {
            item.setIsbn(value);
        } else if (property.equals("edition")) {
            throw new IllegalArgumentException("Cannot update edition");
        } else if (property.equals("title")) {
            throw new IllegalArgumentException("Cannot update title");
        } else {
            throw new IllegalArgumentException("Invalid property for Book");
        }
    }

    private void updateElectronicItem(ElectronicItem item, String property, String value) {
        if (property.equals("storageCapacity")) {
            item.setStorageCapacity(Integer.parseInt(value));
        } else if (property.equals("model")) {
            item.setModel(value);
        } else if (property.equals("maker")) {
            item.setMaker(value);
        } else if (property.equals("operatingSystem")) {
            item.setOperatingSystem(value);
        } else {
            throw new IllegalArgumentException("Invalid property for ElectronicItem");
        }
    }

    private void updatePhone(Phone item, String property, String value) {
        if (property.equals("networkType")) {
            item.setNetworkType(value);
        } else if (property.equals("screenSize")) {
            item.setScreenSize(Double.parseDouble(value));
        } else {
            throw new IllegalArgumentException("Invalid property for Phone");
        }
    }

    private void updateArduino(Arduino item, String property, String value) {
        if (property.equals("version")) {
            item.setVersion(value);
        } else {
            throw new IllegalArgumentException("Invalid property for Arduino");
        }
    }

    public void showAllInfo() {
        for (CISItem item : cisItems) {
            System.out.println(item.toString());
            System.out.println("=======================================");
        }
    }

}
