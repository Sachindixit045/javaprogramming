import java.util.Scanner;

public class array2d {
    public static void main(String[] args){
        int[][] age = new int[3][4];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<3; i++){
            for(int j = 0; j<4; j++){
                
                age[i][j] = sc.nextInt();
                
            }
            System.out.println(" ");
        }
        
        for(int i = 0; i<3; i++){
            for(int j = 0; j<4; j++){
                System.out.print(age[i][j]);
            }
        }
    }
    
}
