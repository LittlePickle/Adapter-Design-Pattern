
/**
 * hold the information of each product
 */
public class Product implements ProductListing{

    private String title;
    private double price;
    private String description;

    public Product(String title, double price, String description) {
        this.title = title;
        this.price = price;
        this.description = description;

    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

}
