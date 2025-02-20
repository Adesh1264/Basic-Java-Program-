import java.util.Scanner;
public class Degree {
    public static void main(String args[]) {
     Scanner sc =new Scanner(System.in);
        System.out.println("1. Degree Celsius to Fahrenheit");
        System.out.println("2. Degree Fahrenheit to Celsius");
        System.out.println("Enter your choice");
        int choice = sc.nextInt();
        switch(choice) {
            case 1:
                System.out.println("Enter the temperature in Celsius");
                double celsius = sc.nextDouble();
                double fahrenheit = (celsius * 9/5) + 32;
                System.out.println("Temperature in Fahrenheit: " + fahrenheit);
                break;
            case 2:
                System.out.println("Enter the temperature in Fahrenheit");
                double fahrenheit1 = sc.nextDouble();
                double celsius1 = (fahrenheit1 - 32) * 5/9;
                System.out.println("Temperature in Celsius: " + celsius1);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
    
}
