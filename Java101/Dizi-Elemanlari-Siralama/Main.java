import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int length=0;

        Scanner scanner =new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        length=scanner.nextInt();
        System.out.println("Dizinin elemanlarını giriniz : ");
        int[] dizi=new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print(i+1+". Elemanı : ");
            dizi[i]= scanner.nextInt();
        }
        Arrays.sort(dizi);
        System.out.print("Sıralama : ");
        for (int j : dizi) {
            System.out.print(j + " ");
        }
    }
}