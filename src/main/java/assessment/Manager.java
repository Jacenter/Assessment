package assessment;

public class Manager extends Employee implements Discountable{
    public Manager(String name, double discount, char size) {
        super(name, discount, size);
    }

    @Override
    public void printEmpPriceAfterDisc(Clothing clothing) {
        double paymentAmount = clothing.getPrice() * (getDiscount() / 100);
        System.out.println("Your discount amount is : " + paymentAmount);
    }


    @Override
    public double calcDiscount(Clothing clothing) {
        return clothing.getPrice() * getDiscount()/100;
    }
}
