import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         int sayi;
         int a;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        sayi = input.nextInt();
        a=sayi*2;
        for (int i = 1; i <= sayi*2; i++) {
            if (a%2==1){
                for (int j = 0; j < a; j++) {
                    System.out.print("*");
                }
            }
            a--;
            System.out.println();

        }
    }
}