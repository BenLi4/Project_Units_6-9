import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.io.File;
import java.io.*;
public class Wordle {
    ArrayList<String> a;
    String[][] board;

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
}
