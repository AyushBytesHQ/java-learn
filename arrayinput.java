// import java.util.Scanner;

// public class arrayinput {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter size: ");
//         int size = sc.nextInt();

//         int[] numbers = new int[size];

//         for(int i = 0; i < numbers.length; i++) {
//             System.out.print("Enter number: ");
//             numbers[i] = sc.nextInt();
//         }

//         System.out.println("Your numbers are:");

//         for(int i = 0; i <= numbers.length; i++) {
//             System.out.println(numbers[i]);
//         }
//         sc.close();
//     }
// }
                    //    SUM OF NUMBERS
public class arrayinput {
    public static void main(String[] args) {
    int numbers[] = {10, 45, 23, 78, 12};
        int smallest = numbers[0];
        for(int i=0; i<numbers.length; i++){
            if (numbers[i]<smallest) {
                smallest = numbers[i];
                
            }
        }
        System.out.println("Smallest: "+smallest);

    }

}