import java.util.Scanner;

public class Main {
public static void plus(){
    int count;
    int sayi;
    int total=0;
    Scanner scanner=new Scanner(System.in);
    System.out.println("Kaç adet sayi gireceksiniz");
    count=scanner.nextInt();
    for (int i = 1; i <=count ; i++) {
        System.out.println("Lütfen "+i+". sayıyı giriniz :");
        sayi= scanner.nextInt();
        total+=sayi;
    }
    System.out.println("Toplam : "+total);

}
static void minus(){
    int count;
    int sayi;
    int total=0;
    Scanner scanner=new Scanner(System.in);
    System.out.println("Kaç adet sayi gireceksiniz");
    count=scanner.nextInt();
    for (int i = 1; i <=count ; i++) {
        System.out.println("Lütfen "+i+". sayıyı giriniz :");
        sayi= scanner.nextInt();
        if (i==1){
            total=sayi;
            continue;
        }
        total-=sayi;
    }
    System.out.println("Sonuc : "+total);


}
static void times(){
    int count;
    int sayi;
    int total=0;
    Scanner scanner=new Scanner(System.in);
    System.out.println("Kaç adet sayi gireceksiniz");
    count=scanner.nextInt();
    for (int i = 1; i <=count ; i++) {
        System.out.println("Lütfen "+i+". sayıyı giriniz :");
        sayi= scanner.nextInt();
        if (i==1){
            total=sayi;
            continue;
        }
        total*=sayi;
    }
    System.out.println("Sonuc : "+total);
}
public static void divided(){

    int count;
    int sayi;
    int total=0;
    Scanner scanner=new Scanner(System.in);
    System.out.println("Kaç adet sayi gireceksiniz");
    count=scanner.nextInt();
    for (int i = 1; i <=count ; i++) {
        System.out.println("Lütfen "+i+". sayıyı giriniz :");
        sayi= scanner.nextInt();
        if (i==1){
            total=sayi;
            continue;
        } if (sayi==0) {
            System.out.println("Sayiyi 0' a bölemezsiniz.");
            break;
        }
        total/=sayi;
    }
    System.out.println("Sonuc : "+total);
}


    public static void main(String[] args) {
int durum;
Scanner klavye =new Scanner(System.in);

    String menu = "1- Toplama İşlemi\n"
            + "2- Çıkarma İşlemi\n"
            + "3- Çarpma İşlemi\n"
            + "4- Bölme işlemi\n" ;
        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz :"     );
        System.out.println(menu     );
        durum= klavye.nextInt();

        switch (durum){
            case 1 :
                plus();
                break;
            case 2:
                minus();
                break;
            case 3 :
                times();
                break;
            case 4:
                divided();
                break;
            default:
                System.out.println("Hatalı işlem yaptınız!");
                break;
        }
    }
}