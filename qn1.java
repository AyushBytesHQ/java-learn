import java.util.Scanner;
/**
 * qn1
 */
public class qn1 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);//input data from user 


System.out.print("enter length: ");
Double length = sc.nextDouble();
System.out.print("enter the breadth: ");
Double breadth = sc.nextDouble();
double area = length * breadth;
System.out.println("area of rectangle is : "+area+ "cm²");//output 
sc.close();


}
}