
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String kullaniciAdi = "patika";
        String dogruSifre = "java123";
        String sifre = "";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kullanıcı Adı: ");
        String girilenKullaniciAdi = scanner.nextLine();

        System.out.print("Şifre: ");
        String girilenSifre = scanner.nextLine();

        if (girilenKullaniciAdi.equals(kullaniciAdi) && girilenSifre.equals(dogruSifre)) {
            System.out.println("Giriş başarılı!");
        } else if (girilenKullaniciAdi.equals(kullaniciAdi)) {
            System.out.print("Şifreniz yanlış. Şifrenizi sıfırlamak ister misiniz? (Evet/Hayır): ");
            String sifreSifirla = scanner.nextLine();

            if (sifreSifirla.equalsIgnoreCase("Evet")) {
                System.out.print("Yeni Şifre: ");
                String yeniSifre = scanner.nextLine();

                if (yeniSifre.equals(girilenSifre) || yeniSifre.equals(dogruSifre)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu.");
                }
            } else {
                System.out.println("Şifre sıfırlama işlemi iptal edildi.");
            }
        } else {
            System.out.println("Kullanıcı adı veya şifre hatalı.");
        }
    }
}