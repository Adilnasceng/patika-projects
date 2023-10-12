import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double sayi1,sayi2;
        String islem;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Lütfen ilk sayiyi giriniz.");
        sayi1= scanner.nextDouble();

        System.out.println("Lütfen yapmak istediğiniz işlemi giriniz :");
        islem= scanner.next();

        System.out.println("Lütfen ikinci sayiyi giriniz");
        sayi2= scanner.nextDouble();



        switch (islem){
            case "+" :
                System.out.println("Sonuc : " + (sayi1+sayi2) );
                break;
            case "-" :
                System.out.println("Sonuc : "+ (sayi1-sayi2));
                break;
            case "*" :
                System.out.println("Sonuc : "+(sayi1*sayi2));
                break;
            case "/" :
                if(sayi2==0||sayi1==0){
                    System.out.println("0 ile işlem yapamazsınız.");
                break;
                }
                System.out.println("Sonuc : "+(sayi1/sayi2));
                break;
            default:
                System.out.println("Hatali işlem yaptiniz.");
        }




    }
}