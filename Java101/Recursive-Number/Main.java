import java.util.Scanner;

public class Main {

static int aaa(int a,int b) {
    if (a <= 0) {
        return bbbb(a,b);}

        System.out.print(a + " ");
        return aaa(a - 5, b);



}
    static int bbbb(int x,int z){
    if (x==z){
        return x;
    }
        System.out.print(x+" ");
        return bbbb(x+5,z);
    }

    public static void main(String[] args) {
        int a,b;
        Scanner klavye =new Scanner(System.in);
        System.out.println("N sayısı : ");
        b=klavye.nextInt();
        a=b;
        System.out.println(aaa(a,b));
    }


}