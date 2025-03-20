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
    }

    public ArrayList<String> getWordList() {
        return a;
    }

    public void addToBoard(String word, int row) {
        for (int i = 0; i < 5; i++) {
            board[row][i] = word.substring(i, i + 1);
        }
    }

    public String[][] getBoard() {
        return board;
    }

    public void printBoard(){
        int i = 0;
        int b = 0;
        while(board[i][0] != null) {
            System.out.println(board[i][b]);
            if (b >= 5){
                b=0;
                i++;
        }
       else b++;
        }
    }
}
