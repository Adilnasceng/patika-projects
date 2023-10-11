import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km ;
        double min = 10, tarife = 2.20, total ;
        Scanner scanner = new Scanner(System.in);
        km = scanner.nextInt();
        total = (tarife*km)+min;
        total = total < 20.0 ? total = 20.0 : total ;
        System.out.println("Ücretiniz :"+total);
    }
}