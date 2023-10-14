import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n ,r;
       double  total=1;
       double total2 =1;
       double kombinasyon;
       double total3=1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen kümenin eleman sayısını giriniz :");
        n= scanner.nextInt();
        System.out.println("Lütfen oluşturulacak r elemanlı farklı grupların sayısını giriniz :");
        r= scanner.nextInt();
        for (int i = 1; i <=n ; i++) {
            total=i*total;
        }
        for (int i = 1; i <= r; i++) {
            total2=total2*i;
        }
        int islem =(n-r);

        for (int i = 1; i <= islem; i++) {
            total3=i*total3;
        }
kombinasyon=(total)/(total2*total3);
        System.out.println("N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı : " +kombinasyon) ;

    }
}