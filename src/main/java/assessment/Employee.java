package assessment;

public abstract class Employee extends Customer {
    private final double discount;


    public Employee(String name, double discount, char size) {
        super(name, size);
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public abstract void printEmpPriceAfterDisc(Clothing clothing);

}

