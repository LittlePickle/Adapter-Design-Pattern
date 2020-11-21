
/**
 * Stores the information for each shoe: brand, name, cost, and description
 */
public class Shoe implements ShoeListing {

    private String brand;
    private String name;
    private double cost;
    private String description;

    public Shoe(String brand, String name, double cost, String description) {
        this.brand = brand;
        this.name = name;
        this.cost = cost;
        this.description = description;
    }

    /**
     * returns the information for the shoe in the following format:
     *
     * @return
     */
    @Override
    public String toString() {
        return String.format("Shoe: %s\nBy: %s\nDetails: %s\nCost: $%f", name, brand, description, cost);
    }

}
