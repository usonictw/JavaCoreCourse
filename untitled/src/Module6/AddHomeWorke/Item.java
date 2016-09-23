package Module6.AddHomeWorke;

/**
 * Created by user on 22.09.2016.
 */
public class Item {

    private long id;
    private String producerName;
    private String itemName;
    private String cityStore;
    private double price;


    public Item() {
    }

    public Item(long id, String itemName, String cityStore, double price, String producerName) {
        this.id = id;
        this.itemName = itemName;
        this.cityStore = cityStore;
        this.price = price;
        this.producerName = producerName;
    }

    public long getId() {
        return id;
    }

    public String getItemName() {
        return itemName;
    }

    public String getCityStore() {
        return cityStore;
    }

    public double getPrice() {
        return price;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setCityStore(String cityStore) {
        this.cityStore = cityStore;
    }
}
