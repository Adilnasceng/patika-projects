import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    int matematik,fizik,muzik,kimya,turkce;
    int toplam=0;
    int sayac=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen matematik notunu giriniz :");
        matematik=scanner.nextInt() ;
        System.out.println("Lütfen fizik notunu giriniz :");
        fizik=scanner.nextInt() ;
        System.out.println("Lütfen muzik notunu giriniz :");
        muzik=scanner.nextInt();
        System.out.println("Lütfen kimya notunu giriniz :");
        kimya=scanner.nextInt();
        System.out.println("Lütfen turkce notunu giriniz :");
        turkce=scanner.nextInt();

        if (matematik>=0&&matematik<=100){
            toplam+=matematik;
            sayac++;
        }
        if (fizik>=0&&fizik<=100){
            toplam+=fizik;
            sayac++;
        }
        if (muzik>=0&&muzik<=100){
            toplam+=muzik;
            sayac++;
        }
        if (kimya>=0&&kimya<=100){
            toplam+=kimya;
            sayac++;
        }
        if (turkce>=0&&turkce<=100){
            toplam+=turkce;
            sayac++;}
        if((toplam/sayac)>=55){
            System.out.println("Tebrikler sinifi gectiniz! Ortalamaniz :"+(toplam/sayac));

        }else System.out.println("Üzgünüm kaldiniz. Ortalamaniz :"+(toplam/sayac));



    }



}