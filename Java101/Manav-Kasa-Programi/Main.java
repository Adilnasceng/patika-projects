import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    double armut =2.14;
    double elma =3.67;
    double domates =1.11;
    double muz = 0.95;
    double patlican=5.00;
    int kilo;
    double total;

    Scanner klavye =new Scanner(System.in);

    System.out.println("Armut kaç kilo");
    kilo= klavye.nextInt();
    armut*=kilo;

    System.out.println("Elma kaç kilo ? :");
    kilo= klavye.nextInt();
    elma*=kilo;

    System.out.println("Domates kaç kilo ? :");
    kilo= klavye.nextInt();
    domates*=kilo;

    System.out.println("Muz kaç kilo ? :");
    kilo= klavye.nextInt();
    muz*=kilo;

    System.out.println("Patlıcan kaç kilo ? :");
    kilo= klavye.nextInt();
    patlican*=kilo;

    total=armut+elma+muz+domates+patlican;

    System.out.println("Toplam tutar :" +total+ " TL" );



    }
}