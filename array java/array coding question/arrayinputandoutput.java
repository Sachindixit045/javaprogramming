
import java.util.Scanner;

public class arrayinputandoutput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your arr size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter your array : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();

        }
        // for print this array
        System.out.print("your array is : ");
        for(int j = 0; j < arr.length; j++){
            System.out.print(arr[j] + " ");

            

        }

    }
    
}
