/**
 * ConsoleShip Java Game
 *
 * Direct User (Console) Input version of the Battleship game:
 * http://goo.gl/Lf0NO5
 *
 * v0.1 - testing map generation and display
 */


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int q;
        do{
            System.out.println("Please enter size of map:");
            System.out.println("1 - Small");
            System.out.println("2 - Large");
            System.out.println("0 - Exit");
            System.out.println("Selection: ");
            q = Integer.parseInt(input.nextLine());
        }while(q<0||q>2);
        input.close();
        switch (q) {
            case 0:
                System.out.println("Exiting program...");
                break;
            case 1:
                printMap(7);
                break;
            case 2:
                printMap(10);
                break;
        }
    }

    public static void printMap(int x){
        String alphabet = "abcdefghij";
        String[][] matrix = new String[x+1][x+1];
        matrix[0][0]=" ";
        for(int i=1; i<=x; i++){
            matrix[0][i]=String.valueOf(alphabet.toUpperCase().charAt(i-1));
            matrix[i][0]=String.valueOf(i);
        }
        for(int i=1; i<=x; i++){
            for(int j=1; j<=x; j++){
                matrix[i][j]=" ";
            }
        }
        for(int i=0; i<=x; i++){
            for(int j=0; j<=x; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
