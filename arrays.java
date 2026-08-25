/**
 * arrays
 */
public class arrays {

public static void main(String[] args) {
    // int arr;//declaration
    // arr = new int[3];//creation

    int[] arr = new int[3];  //declaration and creation in single line

    //initlize
    arr[0] = 101;
    arr[1] = 102;
    arr[2] = 103;

    //declaration, creation and initlization in single line
    // int[] arr = {101,102,103};


    // for triverse
    // System.out.println(arr[0]);
    // System.out.println(arr[1]);
    // if there is limited numbers


    // for(int i=0; i<arr.length;i++){
    //     System.out.println(arr[i]);
    // }

    // foreach loop
    for(int no : arr){
        System.out.println(no);
    }
}
}