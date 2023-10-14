import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int girilenSayi;
        int sayac=0;
        int tempNumber;
        int a;
        int b=1;
        int toplam =0;

        Scanner scanner=new Scanner(System.in);
        girilenSayi=scanner.nextInt();
        tempNumber=girilenSayi;
        int sonuc=girilenSayi;
        while (girilenSayi !=0){
        girilenSayi/=10;
        sayac++;

        }
        for (int i = 1; i <=sayac ; i++) {
          a =  tempNumber%10;
          tempNumber-=a;
         tempNumber= tempNumber/10;
            for (int j = 0; j < sayac; j++) {
                b=a*b;

            }
            toplam+=b;

            b=1;
        }if(sonuc==toplam){
            System.out.println("Bu bir armstong sayidir : "+sonuc+"="+toplam);
        }else System.out.println("Bu bir armstong sayi değildir : "+sonuc+"!="+toplam);






    }
}