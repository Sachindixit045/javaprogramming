import java.util.Scanner;

public class arr{
    public static void main(String[] args){
        int[] age = new int[3];
        int n;
        for(int i=0; i<3; i++){
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            age[i] = n;
        }
        for(int i = 0; i<3; i++){
            System.out.println("your index is"+" "+i+" "+"and value is"+" "+age[i]);
        }
        System.out.println("thank buddy for your code");
        System.out.println("your length is "+" " +age.length);

       
    }
    
}