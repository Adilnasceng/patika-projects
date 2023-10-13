import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yil;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Yıl Giriniz : ");
        yil= scanner.nextInt();

        if(yil%100==0){
            if (yil%400==0){
                System.out.println(yil+" Yılı artık bir yıldır.");
            }else System.out.println(yil+" Yılı artık bir yıl değildir.");


        } else if (yil%4==0) {
            System.out.println(yil+" Yılı artık bir yılıdır.");
            
        }else System.out.println(yil+" Yılı artık bir yıl değildir.");



    }
}