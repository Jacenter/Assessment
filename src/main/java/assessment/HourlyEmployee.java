package assessment;

public class HourlyEmployee extends Employee implements Discountable{
    public HourlyEmployee(String name, double discount, char size) {
        super(name, discount, size);


    }

    @Override
    public void printEmpPriceAfterDisc(Clothing clothing) {
        double paymentAmount = clothing.getPrice() * (getDiscount()/100);
        System.out.println("Hourly Employee price for " + clothing.getDescription() + " after discount " + "\n"  +  (clothing.getPrice() - paymentAmount));

    }

    @Override
    public double calcDiscount(Clothing clothing) {
        return clothing.getPrice() * getDiscount()/100;
    }
}
