import java.util.Scanner;

public class qn2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a place: ");
        String place = sc.nextLine();

        System.out.print("Enter your friend's name: ");
        String friend = sc.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective = sc.nextLine();

        System.out.print("Enter an animal: ");
        String animal = sc.nextLine();

        System.out.print("Enter a food: ");
        String food = sc.nextLine();

        System.out.print("Enter a verb: ");
        String verb = sc.nextLine();

        System.out.println("\n--- Your Mad Libs ---");
        System.out.println("I went to the " + place + " with my friend " + friend + ".");
        System.out.println("We saw a " + adjective + " " + animal + " eating a " + food + ".");
        System.out.println("It was very funny, so we started " + verb + "!");

        sc.close();
    }
}