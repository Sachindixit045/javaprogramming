import java.util.Scanner;

public class Find_the_Largest_Element {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,20,23,43,11,9};
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.print(max);
        
    }
}
