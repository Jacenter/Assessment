package assessment;

import java.util.ArrayList;
import java.util.Collections;

public class ShopApp {

    public static double calcTotal(Clothing[] clothing) {

        return 0;
    }

    public static double employeePriceAfterDiscount(Employee employee) {

        return 0;
    }

    public static boolean isAFit(Customer customer, Clothing clothing) {

        if (customer.getSize() == clothing.getSize()) {
            return true;
        } else {
            return false;
        }
    }

    public static void sortAndPrintClothingByPrice(ArrayList<Clothing> clothes) {
        Collections.sort(clothes, new ClothingPriceComparator());
        for (Clothing x : clothes) {
            System.out.println(x);
        }

    }

    public static void printEmployeeName(Employee employee) {
        System.out.println(employee.getName());
    }

    public static void printDiscAmntOff(Discountable[] clothing) {

    }


    public static void main(String[] args) {

        Clothing clothing1 = new Clothing();
        Clothing clothing2 = new Clothing();
        Clothing clothing3 = new Clothing();
        clothing1.setSize('M');
        clothing2.setSize('L');
        clothing3.setSize('S');
        clothing1.setDescription("Shirt");
        clothing2.setDescription("Jeans");
        clothing3.setDescription("Jacket");
        clothing1.setPrice(10.00);
        clothing2.setPrice(12.99);
        clothing3.setPrice(5.99);
        Manager manager = new Manager("Phil",25,'L');
        manager.setSize('L');
        manager.setName("Phil");
        Clothing[] managerCartArray = {clothing1, clothing2, clothing3};
        System.out.println("Managers cart total is : " + ((clothing1.getPrice() - manager.calcDiscount(clothing1)) + (clothing2.getPrice() - manager.calcDiscount(clothing2) + (clothing3.getPrice() - manager.calcDiscount(clothing3)))));
        manager.printEmpPriceAfterDisc(clothing1);
        manager.printEmpPriceAfterDisc(clothing2);
        System.out.println("Manager would pay " + (clothing1.getPrice() - manager.calcDiscount(clothing1)) + " for clothing item 1");
        System.out.println("Manager would pay " + (clothing2.getPrice() - manager.calcDiscount(clothing2)) + " for clothing item 2");
        System.out.println();
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Bob",10, 'M');
        hourlyEmployee.setSize('L');
        hourlyEmployee.setName("Bob");
        Clothing[] employeeCartArray = {clothing1, clothing2, clothing3};
        hourlyEmployee.printEmpPriceAfterDisc(clothing1);
        hourlyEmployee.printEmpPriceAfterDisc(clothing2);
        System.out.println("Hourly employee would pay " + (clothing1.getPrice() - hourlyEmployee.calcDiscount(clothing1)) + " for clothing item 1");
        System.out.println("Hourly employee would pay " + (clothing2.getPrice() - hourlyEmployee.calcDiscount(clothing2)) + " for clothing item 2");

        System.out.println(isAFit(manager, clothing2));

        ArrayList<Clothing> clothingitems = new ArrayList<>();
        clothingitems.add(clothing1);
        clothingitems.add(clothing2);
        clothingitems.add(clothing3);

        for (Clothing x : clothingitems) {
            System.out.println(x);
        }

        printEmployeeName(manager);
        printEmployeeName(hourlyEmployee);

        sortAndPrintClothingByPrice(clothingitems);


    }


}
