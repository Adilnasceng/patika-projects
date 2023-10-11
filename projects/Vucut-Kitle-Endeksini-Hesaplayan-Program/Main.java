import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double boy;
        int kilo;
        Scanner klavye =new Scanner(System.in);
        System.out.println("Lütfen kilonuzu giriniz.") ;
        kilo= klavye.nextInt();
        System.out.println("Lütfen boyunuzu metre cinsinden giriniz.");
        boy= klavye.nextDouble();
        System.out.println("Vücüt kitle endeksiniz :" + kilo/(boy*boy));
    }
}
