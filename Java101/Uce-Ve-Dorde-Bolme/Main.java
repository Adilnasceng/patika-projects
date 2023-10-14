import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    int girilenSayi;

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz :   ");
        girilenSayi=scanner.nextInt();
        for (int i = 0; i <=girilenSayi ; i++) {
            if (i%3==0||i%4==0){
                System.out.println(i);
            }


        }

    }
}