public class CISItem {
    private String name;
    private String location;
    private String description;
    private double price;

    public CISItem(String name, String location, String description, double price){
        this.name = name;
        this.location = location;
        this.description = description;
        this.price = price;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setLocation(String location){
        this.location = location;
    }
    public String getLocation(){
        return location;
    }

    public void setDescription(String description){
        this.description = description;
    }
    public String getDescriptione(){
        return description;
    }

    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }
}
