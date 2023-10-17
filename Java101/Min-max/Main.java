import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int total;
        int max=0;
        int min=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç tane sayı gireceksiniz: ");
        total = scanner.nextInt();

        for (int i = 1; i <=total; i++) {
            System.out.println(i + ". sayıyı giriniz: ");
            int number = scanner.nextInt();
            if (i == 1) {
                max = number;
                min = number;
            } else {
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }

            }
        } System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);

    }
}