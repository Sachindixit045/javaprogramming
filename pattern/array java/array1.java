import java.util.*;
public class array1 {
    public static void main(String[] args){
        int[] marks = new int[3];
        Scanner sc =new Scanner(System.in);
        int n;
        for(int i=0; i<3; i++){
            System.out.println("enter the value of marks");
            n=sc.nextInt();
            marks[i]=n;
        }
        
        for(int i=0; i<3; i++){
            System.out.println("this is value of marks at index "+i +" " +"is" +" "+marks[i]);
        }
        System.out.println("the length of the array is " +marks.length);

            

    }
}
