import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi;
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Lütfen sayiyi giriniz :");
        sayi=scanner.nextInt();

        for (int i = 1; i <= sayi; i*=4) {
            if (i==1){
                continue;
            }
            System.out.println(i);

        }
        System.out.println("-----------");
        for (int i = 1; i <=sayi  ; i*=5) {
            if (i==1){
                continue;
            }
            System.out.println(i);
        }
    }
}