public class Main {
    public static void main(String[] args) {
        Fighter marc = new Fighter("Marc" , 100 , 20, 90, 20);
        Fighter alex = new Fighter("Alex" , 140 , 10, 100, 30);
        Ring r = new Ring(marc,alex , 90 , 100);
        r.run();
    }
}