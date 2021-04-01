package assessment;

public class Clothing {
    private String description;
    private double price;
    private char size;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Clothing : " +
                 description + '\'' +
                "| price: " + "$" + price +
                " | size: " + size;
    }
}
