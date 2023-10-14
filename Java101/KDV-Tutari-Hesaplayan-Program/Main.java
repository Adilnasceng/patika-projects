import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double tutar ;
        System.out.println("Lütfen tutarı giriniz.");
        Scanner scanner=new Scanner(System.in);
        tutar =scanner.nextDouble();
        System.out.println("Kdvsiz tutar:"+tutar);
        System.out.println("Kdv tutarı :" + tutar*18/100);
        System.out.println("Kdvli tutar :"+ (tutar*18/100+tutar));

    if (tutar<1000){
    System.out.println("Yüzde 18'li Kdvli tutar :"+ (tutar*18/100+tutar));}
    else
    System.out.println("Yüzde 8'li Kdvli tutar :"+ (tutar*8/100+tutar));



    }
}