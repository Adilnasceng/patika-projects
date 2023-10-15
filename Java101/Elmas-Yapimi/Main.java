import java.util.Scanner;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int number;
        Scanner input=new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        number=input.nextInt();

        for (int i = 1; i <= number; i++){ // kaç satır olacagını belirliyoruz
            for (int k = 1; k <= (number - i); k++){ // boşlukları ayarlıyoruz
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++){ // yıldız sayısını belirliyoruz
                System.out.print("*");
            }
            System.out.println();

        }
        for(int k = number; k >= 0; k--){
            for(int j = 0; j < (number - k); j++){
                System.out.print(" ");
            }
            for( int i = 0 ; i < (k * 2) - 1; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}