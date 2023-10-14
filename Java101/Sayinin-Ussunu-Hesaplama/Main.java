import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi;
        int us ;
        int toplam=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen üssünü bilmek sayıyi giriniz :");
        sayi= scanner.nextInt();
        System.out.println("Lütfen üssü giriniz :");
        us= scanner.nextInt();
        toplam=sayi;
        for (int i = 1; i <us ; i++) {
            toplam =toplam*sayi;

        }
        System.out.println("Üslü sayının sonucu :" +toplam);
    }
}