import java.util.Scanner;

public class Arra2dre {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] age = new int[3][4];

        // Input
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                age[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        // Output
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(age[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}