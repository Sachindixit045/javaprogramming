// import java.util.Scanner;
public class Find_the_Second_Largest_Element {
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        int[] arr = {10,20,30,50,40};
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(largest<arr[i]){
                second = largest;
                largest = arr[i];
            }else if(arr[i] > second && arr[i] < largest ){
                second = arr[i];
            }
        }
        System.out.print("your second value is: "+  second );

    }
}
