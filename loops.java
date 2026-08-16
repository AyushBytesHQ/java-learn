
import java.util.Scanner;
public class loops{
    public static void main(String[] args){
    //i=i+1; == i++; are same in loops, 
    

    // // initialisatioon       for(Inititalisation; condition; upadate){
    //                                                            code
    //                                                         }
    // while(condition){
    //     update
    // }
//Write a Java program to input two numbers. Print the multiplication table of the first number up to the second number.
Scanner sc = new Scanner(System.in);
System.out.print("Enter the first number: ");
int n1 = sc.nextInt();
System.out.print("Enter the second number: ");
int n2 = sc.nextInt();
for(int i = 1; i<=n2; i++  ){
    System.out.println(n1 + "*" + i + "="+ (n1*i));
}

sc.close();
    }
}