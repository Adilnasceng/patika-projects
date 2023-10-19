import java.util.Scanner;

public class Main {
    static boolean pali(int x){
        int temp=x ,topla=0,sonRakam;
        while (temp!=0){
            sonRakam=temp % 10;
            topla=(topla*10)+sonRakam;
           temp= temp/10;

        }
        if (x==topla)
        return true;
        else return false;

    }
    public static void main(String[] args) {
        int sayi ;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz.");
        sayi= scanner.nextInt();
        if (pali(sayi)){
            System.out.println(sayi+" Sayısı bir polindrom sayıdır.");

        }else
            System.out.println(sayi+" Sayısı bir polindrom sayı değilidir.");
    }
}