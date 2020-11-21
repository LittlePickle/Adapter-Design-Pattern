
// We store our products in an ArrayList of ProductListings in the driver.
public interface ProductListing {

    /**
     * @return the title
     */
    public String getTitle();

    /**
     * @return the price
     */
    public double getPrice();

    /**
     * @return the description
     */
    public String getDescription();
}

