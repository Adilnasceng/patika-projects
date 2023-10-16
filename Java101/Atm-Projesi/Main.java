import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String password,userName;
        int sayac =3;
        int islem ;
        int bakiye=5000;
        int tutar ;
        Scanner scanner =new Scanner(System.in);
       while (sayac>0){
           System.out.println("Lütfen kullanıcı adınızı giriniz :");
           userName = scanner.nextLine();
           System.out.println("Lütfen şifrenizi giriniz :");
           password = scanner.nextLine();
           if (password.equals("dev123")&&userName.equals("patika")){
               System.out.println("Hoşgeldiniz Lütfen yapmak istediğniz işlemi seçin :");
               System.out.println("1-Para Çekme\n"+"2-Para Yatırma\n"+"3-Bakiye Sorgulama\n"+"4-Çıkış");
               islem=scanner.nextInt();

               switch (islem){
                   case 1 :
                       System.out.println("Lütfen çekmek istediğiniz tutarı giriniz :");
                       tutar= scanner.nextInt();
                       if(tutar<=bakiye){

                           System.out.println("Hesabınızdan şu kadar çekildi : "+tutar+" Kalan bakiyeniz : "+(bakiye-tutar));
                           bakiye=bakiye-tutar;
                           sayac=0;
                           break;
                       }else { System.out.println("Tutar bakiyeden büyük olamaz !");
                           sayac=0;

                           break;}
                   case 2 :
                       System.out.println("Lütfen yatırmak istediğiniz tutarı giriniz :");
                       tutar= scanner.nextInt();
                       System.out.println("Hesabınız şu kadar para yatırdınız : "+tutar+" Hesabınızdaki toplam tutar "+(bakiye+tutar)+" oldu");
                        bakiye=bakiye+tutar ;
                       sayac=0;

                       break;
                   case 3 :
                       System.out.println("Hesabınızda şu miktar para bulunmaktadır : "+bakiye);
                       sayac=0;

                       break;
                   case 4 :
                       System.out.println("Çıkış yapılıyor.");
                       sayac=0;

                       break;
                   default:
                       sayac=0;
                       break;
               }

           }else{ sayac--;
           System.out.println("Hatalı işlem yaptınız kalan hakkınız :"+sayac);}
       }

    }

}