public class Arduino extends ElectronicItem{
    private String version;
    public Arduino (String name, String location, String description, double price, int storageCapacity, String model, String maker, String operatingSystem, String version) {
        super(name, location, description, price, storageCapacity, model, maker, operatingSystem);
        this.version = version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }
}

