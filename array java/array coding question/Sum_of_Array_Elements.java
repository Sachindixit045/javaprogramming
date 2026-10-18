import java.util.Scanner;
public class Sum_of_Array_Elements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter  your value of array : ");
        int sum = 0;
        for(int i = 0; i < arr.length; i++ ){
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        System.out.print(sum);
    }
    
}
