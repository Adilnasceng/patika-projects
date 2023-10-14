import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double girilenSayi;
        double  toplam =0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen harmonik serisini bulmak istediğiniz sayıyı giriniz : ");

        girilenSayi=scanner.nextInt();

        for (double i = 1; i <=girilenSayi; i++) {
        toplam=(1/i)+toplam;

        }System.out.println("Harmonik serisi : "+toplam);
    }
}