import java.util.Scanner;

public class Main {
    static int fibb(int x) {
        if (x == 1 || x == 2) {
            return 1;
        }

        return   fibb(x-2)+fibb(x - 1);
    }
    public static void main(String[] args) {

        System.out.println(fibb(8));

    }}