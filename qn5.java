import java.util.Scanner;
/**
 * qn5
 */
public class qn5 {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the principal amount: ");
double principal = sc.nextDouble();

System.out.print("Enter the interest rate(in %): ");
double rate = sc.nextDouble()/100;

System.out.print("Enter the # of year: ");
int years = sc.nextInt();

double amount = principal*rate*years;
System.out.println("The amount after"+ years + " is: $"+amount);
sc.close();
}
}