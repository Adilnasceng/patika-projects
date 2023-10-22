import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [][] dizi = {{2,3,4},{5,6,4},{3,2,1}};
        int [][] temp= new int[3][3] ;
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                temp [i][j]=dizi[j][i];
                System.out.print((temp[i][j]+" "));
            }
            System.out.println();
        }


        }
    }
