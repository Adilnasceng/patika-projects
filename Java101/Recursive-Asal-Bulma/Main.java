import java.util.Scanner;
public class Main {
    public static boolean asalMi(int sayi) {
        if (sayi <= 1)
            return false;

        return asalMiHelper(sayi, sayi-1);
    }

    private static boolean asalMiHelper(int sayi, int bolen) {
        if (bolen == 1)
            return true;

        if (sayi % bolen == 0)
            return false;

        return asalMiHelper(sayi, bolen-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        if (asalMi(sayi))
            System.out.println(sayi + " bir asal sayıdır.");
        else
            System.out.println(sayi + " bir asal sayı değildir.");

    }

}