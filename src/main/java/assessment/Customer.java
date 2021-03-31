package assessment;

public abstract class Customer extends Person{
    private Clothing[] clothingItems;
    private char size;

    public Customer(String name, char size) {
        super(name);
    }


    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        size = size;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "Size=" + size +
                '}';
    }
}
