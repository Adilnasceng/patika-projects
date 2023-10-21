import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int min=0;
        int max=0;
        int sayac=0;
       int[] dizi = {15,12,788,1,-1,-778,2,0} ;
        Arrays.sort(dizi);
        Scanner scanner=new Scanner(System.in);
       int sayi= scanner.nextInt();
        for (int j : dizi) {

            if (sayi < j) {
                max = j;
                break;
            }}
            for (int k : dizi) {
                if (sayi > k) {
                    min =k;

                }
            }
        System.out.println("Dizi : "+Arrays.toString(dizi));
        System.out.println("Girilen Sayı : "+sayi);
        System.out.println("Girilen sayıdan küçük en yakın sayı : "+min);
        System.out.println("Girilen sayıdan büyük en yakın sayı : "+max);

    }
}