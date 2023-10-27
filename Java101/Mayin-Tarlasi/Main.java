import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows of the array: ");
        int row = sc.nextInt();
        System.out.print("Enter the number of column of the array: ");
        int col = sc.nextInt();

        MineSweeper mineSweeper = new MineSweeper(row,col);

        mineSweeper.run();


    }
}