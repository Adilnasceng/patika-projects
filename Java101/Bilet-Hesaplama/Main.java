import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 int tip ;
 double mesafeUcreti =0.10;
 int mesafe ;
 int yas ;
 double indirim;
 double ucret;
 double indirimliUcret;
 double gidisdonusindirimi =0.20;
 double toplamtutar;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Mesafeyi km türünden giriniz :");
        mesafe=scanner.nextInt();

        System.out.println("Yaşınızı giriniz :");
        yas=scanner.nextInt();

        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        tip=scanner.nextInt();


        switch (tip){

            case 1 :
              if(mesafe>0) {
                  if (yas < 12 && yas > 0) {
                      indirim = (mesafe * mesafeUcreti) * ((double) 50 / 100);
                      ucret = mesafe * mesafeUcreti;
                      indirimliUcret = ucret - indirim;
                      System.out.println("Toplam tutar = " + indirimliUcret + " TL");
                  } else if (yas >= 12 && yas <= 24) {
                      indirim = (mesafe * mesafeUcreti) * ((double) 10 / 100);
                      ucret = mesafe * mesafeUcreti;
                      indirimliUcret = ucret - indirim;
                      System.out.println("Toplam tutar = " + indirimliUcret + " TL");
                  } else if (yas > 65) {
                      indirim = (mesafe * mesafeUcreti) * ((double) 30 / 100);
                      ucret = mesafe * mesafeUcreti;
                      indirimliUcret = ucret - indirim;
                      System.out.println("Toplam tutar = " + indirimliUcret + " TL");
                  } else if (yas>24&&yas<=65) {
                      ucret = mesafe * mesafeUcreti;
                      System.out.println("Toplam tutar = " + ucret + " TL");
                  } else System.out.println("Hatalı Veri Girdiniz !");
              }else
              {  System.out.println("Hatali veri girdiniz");}


                break;
            case 2:
             if (mesafe>0) {
                 if (yas < 12 && yas > 0) {
                     indirim = (mesafe * mesafeUcreti) * ((double) 50 / 100);
                     ucret = mesafe * mesafeUcreti;
                     indirimliUcret = ucret - indirim;
                     indirimliUcret -= indirimliUcret * gidisdonusindirimi;
                     toplamtutar = indirimliUcret * 2;
                     System.out.println("Toplam tutar = " + toplamtutar + " TL");
                 } else if (yas >= 12 && yas <= 24) {
                     indirim = (mesafe * mesafeUcreti) * ((double) 10 / 100);
                     ucret = mesafe * mesafeUcreti;
                     indirimliUcret = ucret - indirim;
                     indirimliUcret -= indirimliUcret * gidisdonusindirimi;
                     toplamtutar = indirimliUcret * 2;
                     System.out.println("Toplam tutar = " + toplamtutar + " TL");
                 } else if (yas > 65) {
                     indirim = (mesafe * mesafeUcreti) * ((double) 30 / 100);
                     ucret = mesafe * mesafeUcreti;
                     indirimliUcret = ucret - indirim;
                     indirimliUcret -= indirimliUcret * gidisdonusindirimi;
                     toplamtutar = indirimliUcret * 2;
                     System.out.println("Toplam tutar = " + toplamtutar + " TL");
                 } else if (yas>24&&yas<=65) {
                     ucret = mesafe * mesafeUcreti;
                     indirimliUcret=ucret*gidisdonusindirimi;
                     toplamtutar=ucret-indirimliUcret;
                     toplamtutar*=2;
                     System.out.println("Toplam tutar = " + toplamtutar + " TL");
                 }else System.out.println("Hatalı Veri Girdiniz !");
             }else
             {System.out.println("Hatalı veri girdiniz!");}

                break;
            default:
                System.out.println("Hatalı veri girdiniz!");
                break;


        }



    }
}