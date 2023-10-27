import java.util.Scanner;
import java.util.ResourceBundle.Control;
import java.util.Arrays;
import java.util.Random;

class MineSweeper{
    int row;
    int col;
    String[][] MineMap;
    String[][] GameMap;
    int mine;
    int r;
    int c;
    int count;
    boolean isTrue = true;

    public MineSweeper(int row, int col) {
        this.row = row;
        this.col = col;
        this.GameMap = new String[row][col];
        this.MineMap = new String[row][col];
        this.mine = (row * col) / 4;
    }

    public void MineMap(){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                MineMap[i][j] = "-";
                GameMap[i][j] = "-";

            }
        }

    }

    public void randomNumber() {
        Random r = new Random();
        for (int i = 0; i < this.mine; i++) {
            int rnum = r.nextInt(this.row);
            int rnum2 = r.nextInt(this.col);
            if (!this.MineMap[rnum][rnum2].equals("*")) {
                this.MineMap[rnum][rnum2] = "*";
            }
        }
    }


    public void printMineMap() {
        //  System.out.println("Location of Mines");
        randomNumber();
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                if (!this.MineMap[i][j].equals("*")) {
                    this.MineMap[i][j] = "-";
                }
            }
        }

    }

    public void printGameMap(){
        for(int i=0; i < this.row; i++){
            for(int j=0; j<this.col; j++){
                this.GameMap[i][j]="-";
                System.out.print(this.GameMap[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void control(){
        count=0;
        for(int i=(r-1); i <= (r+1); i++){
            for (int j = (c-1); j <= (c+1); j++) {
                if(i<0 || j<0 || i >= this.row || j >= this.col){
                    continue;
                }
                if(this.MineMap[i][j].equals("*")){
                    count++;
                }
            }
        }
        this.GameMap[r][c] = String.valueOf(count);
        this.MineMap[r][c] = String.valueOf(count);
        for(int i=0; i< this.row; i++){
            for (int j = 0; j < this.col; j++) {
                System.out.print(this.GameMap[i][j]+" ");
            }
            System.out.println();
        }

    }

    public boolean finish() {
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                if (this.MineMap[i][j].equals("-")) {
                    return false;
                }
            }
        }
        return true;
    }

    public void ChooseIndex(){
        Scanner sc = new Scanner(System.in);
        isTrue = false;
        while(!isTrue){
            System.out.print("Enter row: ");
            r = sc.nextInt();
            System.out.print("Enter column: ");
            c = sc.nextInt();

            r-=1;
            c-=1;

            if(r>row || c>col ){
                System.out.println("You entered a value outside the map boundaries. Enter again.");
                continue;
            }
            if(MineMap[r][c].equals("*")){
                System.out.println("Game Over!");
                break;
            }
            control();
            if(finish()){
                System.out.println("Congratulations! You win.");
                break;
            }

        }
    }

    public void run(){
        MineMap();
        printMineMap();
        ChooseIndex();
    }


}

