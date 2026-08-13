// Profit or Loss
// // Input cost price and selling price. Determine whether there is a profit, loss, or no profit/no loss.
import java.util.Scanner;
public class qn4 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.print("enter cost price: ");
double cost = sc.nextDouble();
System.out.print("enter selling price: ");
double selling = sc.nextDouble();
double total= selling-cost;
if (selling>cost) {
    System.out.println("there is profit: " + (total));
}else if(selling<cost){
    System.out.println("there is loss: " + (total));
}else{
    System.out.println("there is no profit/loss");
}
        sc.close();
    }
}