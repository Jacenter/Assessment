package assessment;

import java.util.ArrayList;
import java.util.Collections;

public class ShopApp {

    public static double calcTotal(Clothing[] clothing) {
        double sum =0;
        for (Clothing x : clothing) {
            sum += x.getPrice();

        }
        System.out.println("Total of Manager's cart: " + "\n" + sum);
        return sum;
    }

    public static boolean isAFit(Customer customer, Clothing clothing) {
        boolean doesThisFit;
        if (customer.getSize() == clothing.getSize()) {
            doesThisFit = true;
        } else {
            doesThisFit = false;
        }
        System.out.println("Checking if this clothing item fits this customer ");
        return doesThisFit;
    }

    public static void sortAndPrintClothingByPrice(ArrayList<Clothing> clothes) {
        Collections.sort(clothes, new ClothingPriceComparator());
        for (Clothing x : clothes) {
            System.out.println(x.getPrice());
        }

    }

    public static void printEmployeeName(Employee employee) {
        System.out.println(employee.getName());
    }

    public static void printDiscAmntOff(Discountable[] discountableEmployees, Clothing clothing) {
        for (Discountable x : discountableEmployees) {
            System.out.println(x.calcDiscount(clothing));
        }
    }

    public static void main(String[] args) {

        Clothing clothing1 = new Clothing();
        Clothing clothing2 = new Clothing();
        Clothing clothing3 = new Clothing();

        clothing1.setSize('M');
        clothing2.setSize('L');
        clothing3.setSize('S');

        clothing1.setDescription("Button-Up Shirt");
        clothing2.setDescription("Jeans");
        clothing3.setDescription("T-shirt");

        clothing1.setPrice(30.00);
        clothing2.setPrice(20.00);
        clothing3.setPrice(5.00);

        Manager manager = new Manager("Jim Jones",25,'L');
        manager.setSize('L');
        manager.setName("Jim Jones");
        Clothing[] managerCartArray = {clothing1, clothing2, clothing3};

        HourlyEmployee hourlyEmployee = new HourlyEmployee("Mike Jones",10, 'M');
        hourlyEmployee.setSize('L');
        hourlyEmployee.setName("Mike Jones");

        ArrayList<Clothing> clothingitems = new ArrayList<>();
        clothingitems.add(clothing2);
        clothingitems.add(clothing1);
        clothingitems.add(clothing3);

        Discountable[] discountables = {hourlyEmployee,manager};



        //outputs
        calcTotal(managerCartArray);
        System.out.println(isAFit(hourlyEmployee, clothing2));

        hourlyEmployee.printEmpPriceAfterDisc(clothing2);
        hourlyEmployee.printEmpPriceAfterDisc(clothing3);

        manager.printEmpPriceAfterDisc(clothing2);
        manager.printEmpPriceAfterDisc(clothing3);

        System.out.println("\nPrior to sorting clothing objects by price : ");
        for (Clothing x : clothingitems) {
            System.out.println(x);
        }
        System.out.print("\n");
        System.out.println("After sorting - clothing items by price by Implementing the Comparator Interface!!!");
        sortAndPrintClothingByPrice(clothingitems);
        System.out.println("\nPrinting each type of Employee's name");
        printEmployeeName(manager);
        printEmployeeName(hourlyEmployee);
        System.out.println("\nDiscount off specific clothing (jeans) for each employee..meaning how much discount they get off");
        printDiscAmntOff(discountables, clothing2);





    }


}
