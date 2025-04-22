package PracticeProjects;

import java.util.Scanner;

public class MathClass {
    public static void main(String[] args) {
        // practice

        // HYPOTENUSE C = Math.sqrt(a^2 + b ^2)
        Scanner sc = new Scanner(System.in);
        // double a;
        // double b;
        // double c;
        // System.out.print("Enter the length of side A : ");
        // a = sc.nextDouble();

        // System.out.print("Enter the length of side B : ");
        // b = sc.nextDouble();

        // c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        // System.out.println("The hypotenuse (side c) is : " + c + "cm");
        // sc.close();

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius: ");
        radius = sc.nextDouble();

        circumference = Math.round(2 * Math.PI * radius);
        area = Math.round(Math.PI * Math.pow(radius, 2));
        volume = Math.round((4.0 / 3.0) * Math.PI * Math.pow(radius, 3));
        System.out.println("The circumfernce of a circle is: " + circumference + " cm");

        System.out.println("The area of a circle is: " + area + "cm^2");
        System.out.println("The volume of a circle is : " + volume + "cm^3");

        sc.close();

    }

}
