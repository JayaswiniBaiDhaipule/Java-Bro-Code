package PracticeProjects;

import java.util.Scanner;

public class ShopingCartProgram {
    public static void main(String[] args) {

        // SHOPPING CART PROGRAM
        
        Scanner sc = new Scanner(System.in);

        String itemName;
        float price;
        int quantity;
        char currency = '$';
        float total;

        System.out.print("What item would you like to buy? : ");
        itemName = sc.nextLine();
        System.out.print("What is the price for each?: ");
        price = sc.nextFloat();
        System.out.print("How many would you like?: ");
        quantity = sc.nextInt();

        total = price * quantity;
        
        System.out.println("\nYou have bought " + quantity + " "+ itemName + "/s");
        System.out.println("Your total is "+ currency + total);

        sc.close();
    }
    
}
