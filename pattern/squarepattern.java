import java.util.*;

public class squarepattern {
    public static void main(String[] args){
        Scanner sca = new Scanner(System.in);
        int first = sca.nextInt();
        int scond = sca.nextInt();

        for(int i=1; i<=first; i++){
            for(int j=1; j<=scond; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
