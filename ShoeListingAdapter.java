
public class ShoeListingAdapter implements ProductListing {

    // private instance of shoe
    private ShoeListing shoe;
    private String title;
    private String brand;
    private double price;
    private String description;

    public ShoeListingAdapter(ShoeListing shoe) {
        this.shoe = shoe;

        // It will have to usesubstring and indexOf to gather the required information
        String[] tokens = shoe.toString().split("\n");
        title = tokens[0].substring(6);
        brand = tokens[1].substring(4);
        description = String.format("Created by %s, %s", brand, tokens[2].substring(9));
        price = Double.parseDouble(tokens[3].substring(7));
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
