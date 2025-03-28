import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.*;
public class Wordle {
    private ArrayList<String> a;
    private String[][] board;

    public Wordle() {
        board = new String[6][5];
        a = new ArrayList<>();
        try {
            File myFile = new File("src\\Words.txt");
            Scanner fileScanner = new Scanner(myFile);
            while (fileScanner.hasNext()) {
                String data = fileScanner.nextLine();
                a.add(data);
            }
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                board[i][j] = "_";
            }
        }
    }

    public ArrayList<String> getWordList() {
        return a;
    }

    public void addToBoard(String word, int row) {
        int a  = 0;
        for (int i = 0; i < 55; i+= 11) {
            board[row][a] = word.substring(i, i + 11);
            a++;
        }
    }

    public String[][] getBoard() {
        return board;
    }

    public void printBoard(){
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void resetBoard() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                board[i][j] = "_";
            }
        }
    }
}
