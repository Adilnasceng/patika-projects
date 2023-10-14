import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi1 , sayi2 ,sayi3;

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lütfen ilk sayiyi giriniz.");
        sayi1=scanner.nextInt();

        System.out.println("Lütfen ikinci sayiyi giriniz.");
        sayi2=scanner.nextInt();

        System.out.println("Lütfen ücüncü sayiyi giriniz.");
        sayi3=scanner.nextInt();
        if (sayi1<sayi2&&sayi1<sayi3){
            if (sayi2<sayi3){
                System.out.println("Siralama : "+sayi1+"<"+sayi2+"<"+sayi3+"\nsayi1<sayi2<sayi3");
            }else
                System.out.println("Siralama :"+sayi1+"<"+sayi3+"<"+sayi2+"\nsayi1<sayi3<sayi2");
        } else if (sayi2<sayi1&&sayi2<sayi3) {
            if (sayi1<sayi3){
                System.out.println("Siralama :"+sayi2+"<"+sayi1+"<"+sayi3+"\nsayi2<sayi1<sayi3");
            }else System.out.println("Siralama :"+sayi2+"<"+sayi3+"<"+sayi1+"\nsayi2<sayi3<sayi1");


        } else if (sayi3<sayi2&&sayi3<sayi1) {
            if (sayi2<sayi1){
                System.out.println("Siralama :"+sayi3+"<"+sayi2+"<"+sayi1+"\nsayi3<sayi2<sayi1");
            }else System.out.println("Siralama :"+sayi3+"<"+sayi1+"<"+sayi2+"\nsayi3<sayi1<sayi2");

        }


    }
}