import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int month,day;
        String burc=null;
        boolean isTrue=false ;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Doğduğunuz ayı giriniz :");
        month=scanner.nextInt();
        System.out.println("Doğduğunuz günü giriniz :");
        day=scanner.nextInt();

        if(month==1){
            if (day<=21&&day>=1){
                burc="Oğlak";
            } else if (day>=22&&day<=31){
                burc="Kova";}
            else isTrue=true;

        } else if (month==2) {
            if (day<=19&&day>=1){
                burc="Kova";
            } else if (day>=20&&day<=28){
                burc="Balik";}
            else isTrue=true;

        }else if (month==3) {
            if (day<=20&&day>=1){
                burc="Balık";
            }else if (day>=21&&day<=31){
                burc="Koç";}
            else isTrue=true;

        }else if (month==4) {
            if (day<=20&&day>=1){
                burc="Koç";
            }else if (day>=21&&day<=30){
                burc="Boğa";}
            else isTrue=true;

        }else if (month==5) {
            if (day<=21&&day>=1){
                burc="Boğa";
            }else if (day>=22&&day<=31){
                burc="İkizler";}
            else isTrue=true;

        }else if (month==6) {
            if (day<=22&&day>=1){
                burc="İkizler";
            }else if (day>=23&&day<=30){
                burc="Yengeç";}
            else isTrue=true;

        }else if (month==7) {
            if (day<=22&&day>=1){
                burc="Yengeç";
            } else if (day>=23&&day<=31){
                burc="Aslan";}
            else isTrue=true;

        }else if (month==8) {
            if (day<=22&&day>=1){
                burc="Aslan";
            }else if (day>=23&&day<=31){
                burc="Başak";}
            else isTrue=true;

        }else if (month==9) {
            if (day<=22&&day>=1){
                burc="Başak";
            }else if (day>=23&&day<=30){
                burc="Terazi";}
            else isTrue=true;

        }else if (month==10) {
            if (day<=22&&day>=1){
                burc="Terazi";
            } else if (day>=23&&day<=31){
                burc="Akrep";}
            else isTrue=true;

        }else if (month==11) {
            if (day<=21&&day>=1){
                burc="Akrep";
            }else if (day>=22&&day<=30){
                burc="Yay";}
            else isTrue=true;

        }else if (month==12) {
            if (day<=21&&day>=1){
                burc="Yay";
            } else if (day>=22&&day<=31){
                burc="Oğlak";}
            else isTrue=true;

        }else isTrue=true;
        if (isTrue){
            System.out.println("Hatalı giriş yaptınız!");
        }
       else System.out.println("Burcunuz : "+burc );

    }
}