import java.util.Scanner;

public class nestedif{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are an adult.");

            if (age >= 60) {
                System.out.println("You are a senior citizen.");
            }
        }
        sc.close();
    }
}