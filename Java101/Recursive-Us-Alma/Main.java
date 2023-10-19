import java.util.Scanner;

public class Main {
    static int pow(int a,int b) {
        int result=1;
        if(b==0) {
            return result; }
        return a*pow(a,--b); }



    public static void main(String[] args) {
        int taban, us;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Taban değeri giriniz :");
        taban=scanner.nextInt();
        System.out.println("Üs değerini giriniz :");
        us= scanner.nextInt();
        System.out.println("Sonuc : "+pow(taban,us));
    }
}