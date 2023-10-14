import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double alan, cevre, yaricap, merkezAci,daireDilimi;
        final double pi =3.14;
        System.out.println("Lütfen yarıçap giriniz.");
        Scanner klavye =new Scanner(System.in);
        yaricap=klavye.nextInt();
        alan=pi*yaricap*yaricap;
        cevre=2*pi*yaricap;
        System.out.println("Dairenin alanı :" + alan);
        System.out.println("Dairenin çevresi :" + cevre);
        System.out.println("Lütfen merkez açı ölçüsünü giriniz");
        merkezAci= klavye.nextInt();
        daireDilimi=((yaricap*yaricap)*pi*merkezAci)/360 ;
        System.out.println("Daire dilimi :" + daireDilimi);

    }
}