import java.util.Scanner;
public class WordlePlay {
    Word a = new Word();
    GuessWord b = new GuessWord();
    Wordle c = new Wordle();
    Boolean win = false;

    public WordlePlay() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Wordle!");
        System.out.print("What's your name?");
        String t = scan.nextLine();
        System.out.println("Hello " + t);
        int i = 0;
        String o = "";
        while (!win) {
            System.out.println(a.getCorrectWord());
            System.out.print("Enter a word(Should be 5 letters): ");
            o = scan.nextLine();
            if (b.validGuess(o)) {
                if (a.check(o).equals("t")) {
                    o = b.check(o);
                    c.addToBoard(o, i);
                    c.printBoard();
                    System.out.println("You Got It!");
                    win = true;
                } else {
                    o = b.check(o);
                    c.addToBoard(o, i);
                    c.printBoard();
                }
                i++;
            } else {
                System.out.println("invalid");
            }
            if (win) {
                System.out.println("Play again?(y/n)");
                String c = scan.nextLine();
                if (c.equals("y")) {
                    win = false;
                }
            }
        }
    }
}
