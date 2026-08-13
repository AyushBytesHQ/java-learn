import java.util.Scanner;

public class qn3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Items: ");
        String items = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        System.out.print("Quantity: ");
        int quantity = sc.nextInt();

        double total = price * quantity;

        System.out.println("You bought " + quantity + " " + items);
        System.out.println("Your bill is $" + total);

        sc.close();
    }
}