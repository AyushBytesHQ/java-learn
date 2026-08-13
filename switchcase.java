// Write a Java program to input a character representing a traffic signal:
import java.util.Scanner;
public class switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Traffic signal: ");
        char signal = sc.next().charAt(0);
        switch (signal) {
            case 'r':
            case 'R':
                System.out.println("Stop");
                
                break;
                case 'y':
                case 'Y':
                    System.out.println("Wait");
                    break;
                case 'g':
                case 'G':
                    System.out.println("Go");
                    break;
        
            default:
                System.out.println("Invalid signal");
        }


        sc.close();
    }

}
