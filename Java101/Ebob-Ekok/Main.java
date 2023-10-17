import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1,n2 ;
        int i=0;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter first number: ");
        n1=scanner.nextInt();
        System.out.println("Enter second number: ");
        n2=scanner.nextInt();

        while (n1>n2){
            for ( i = n2;  i>=1 ; i--) {
                if (n1%i==0 && n2%i==0){
                    System.out.println("Ebob : "+i);
                    break;
                }

            }
                break;
        }
        while (n2>n1){
            for ( i = n1;  i>=1 ; i--) {
                if (n1%i==0 && n2%i==0){
                    System.out.println("Ebob : "+i);
                    break;
                }

            }
            break;
        }
        System.out.println("Ekok : "+(n1*n2)/i);
    }
}