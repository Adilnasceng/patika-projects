public class Main {
    public static void main(String[] args) {
        int sayi = 100;
        int sayac=0;
        for (int i = 1; i < sayi; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
               sayac++;


                }
            }
            if (sayac==0){
                System.out.println(i);
            }
            sayac=0;
        }
    }
}