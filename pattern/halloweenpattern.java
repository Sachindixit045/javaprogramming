import java.util.*;

public class halloweenpattern {
    public static void main(String[] args){
        Scanner sca = new Scanner(System.in);
        int a = 4;
        int b = 5;
        for(int i=1; i<=a; i++){
            for(int j=1; j<=b; j++){
                if (i==1 || j==1 || i==4 || j==5 ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println(" ");
        }
        
    }
}
