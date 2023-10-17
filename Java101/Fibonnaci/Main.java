import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Fibonacci serisi eleman sayısını giriniz : ");
        int n = inp.nextInt();
        int a = 0;
        int b = 1;
        int c;
        System.out.print(n+" elemanlık fibonacci serisi: " + a + ", " + b);
        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(", " + c);
            a = b;
            b = c;
        }
        System.out.println();
    }
}