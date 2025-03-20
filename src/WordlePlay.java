import java.util.Scanner;
public class WordlePlay {
    Word a = new Word();
    GuessWord b = new GuessWord();
    Wordle c = new Wordle();
    Boolean win = false;

    public WordlePlay() {
        //board print
        Wordle l = new Wordle();
        l.printBoard();
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Wordle!");
        System.out.print("What's your name?");
        String t = scan.nextLine();
        System.out.println("Hello " + t);
        int i = 0;
        String o = "";
        while (i < 5 && !o.equals(a.getCorrectWord()) && !win) {
            System.out.print("Enter a word(Should be 5 letters): ");
            o = scan.nextLine();
            if (b.validGuess(o)) {
                c.addToBoard(o, i);
                if (a.check(o)) {
                    System.out.println("You Got It!");
                } else {
                }
                i++;
            } else {
                System.out.println("invalid");
            }

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
