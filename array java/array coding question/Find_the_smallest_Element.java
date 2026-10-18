import java.util.Scanner;

public class Find_the_smallest_Element {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,20,23,43,11,9};
        int min = arr[1];
        for(int i = 0; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.print(min);
        
    }
}
