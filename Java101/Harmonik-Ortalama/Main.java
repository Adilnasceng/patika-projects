
public class Main {
    public static void main(String[] args) {
        double total = 0;
        double ortalama=0;
        double[] liste = {1,2,3,4,5};

        for (int i = 0; i < liste.length; i++) {
            total=1/liste[i];
        }
        ortalama= liste.length/total;
        System.out.println("Dizideki sayıların harmonik ortalaması : "+ ortalama);
    }
}