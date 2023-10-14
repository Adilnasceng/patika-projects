import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int var ;
        int total = 0;

        Scanner scanner=new Scanner(System.in);

        do {
            System.out.println("Lütfen sayı giriniz :");
            var = scanner.nextInt();
            if (var % 4 == 0&&var>0) {
                total += var;


            }
        }

            while (var>0) ;

        System.out.println("Toplam :"+ total);



    }
}