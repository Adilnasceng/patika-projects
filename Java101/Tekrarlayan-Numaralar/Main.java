public class Main {
    public static void main(String[] args) {
        int[] dizi ={1,9,2,6,2,0,0,1,3,6,4};


        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                if ((i!=j)&&dizi[i]==dizi[j]){
                    if (dizi[i]%2==0){
                        System.out.print(dizi[i]+", ");
                    }

                }

            }
        }


        }
    }
