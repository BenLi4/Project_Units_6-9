import java.util.Scanner;
import java.util.ArrayList;
public class WordlePlay {
    Word a = new Word();
    GuessWord b = new GuessWord();
    Wordle c = new Wordle();
    Boolean win = false;
    String difficulty ="";
    Boolean loss = false;

    public WordlePlay() {
        ArrayList<Wordle> l = new ArrayList<>();
        l.add(a);
        l.add(b);
        l.add(c);
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Wordle!");
        System.out.print("What's your name? ");
        String t = scan.nextLine();
        System.out.println("Hello " + t);
        System.out.print("Select difficulty (e/n/h): ");
        difficulty = scan.nextLine().toLowerCase();
        while (!difficulty.equals("e") && !difficulty.equals("n") && !difficulty.equals("h")) {
            System.out.print("Invalid. Enter a difficulty (e/n/h): ");
            difficulty = scan.nextLine().toLowerCase();
        }
        int i = 0;
        String o = "";
        System.out.println(b.getCorrectWord());
        if (difficulty.equals("n")) {
            l.get(2).printBoard(difficulty);
            while (!win && !loss) {
                System.out.print("Enter a word(Should be 5 letters): ");
                o = scan.nextLine();
                if (b.validGuess(o)) {
                    if (b.check(o)) {
                        o = b.checks(o);
                        l.get(2).addToBoard(o, i);
                        l.get(2).printBoard(difficulty);
                        System.out.println("You Got It!");
                        win = true;
                    } else {
                        o = b.checks(o);
                        l.get(2).addToBoard(o, i);
                        l.get(2).printBoard(difficulty);
                    }
                    i++;
                } else {
                    System.out.println("invalid");
                }
                if (i > 5) {
                    System.out.print("You lost. Play again?(y/n)");
                    String rut = scan.nextLine();
                    if (rut.equals("y")) {
                        l.get(2).resetBoard(difficulty);
                        i = 0;
                        b.generateNewCorrectWord();
                        l.get(2).printBoard(difficulty);
                    } else {
                        loss = true;
                    }
                }
                if (win) {
                    System.out.print("Play again?(y/n)");
                    String d = scan.nextLine();
                    if (d.equals("y")) {
                        win = false;
                        l.get(2).resetBoard(difficulty);
                        i = 0;
                        b.generateNewCorrectWord();
                        l.get(2).printBoard(difficulty);
                    } else {
                        win = true;
                    }
                }
            }
            System.out.println("See ya!");
        } else if (difficulty.equals("e")) {
            l.get(2).setBoardSize(7, 5);
            l.get(2).printBoard(difficulty);
            while (!win && !loss) {
                System.out.print("Enter a word(Should be 5 letters): ");
                o = scan.nextLine();
                if (b.validGuess(o)) {
                    if (b.check(o)) {
                        o = b.checks(o);
                        l.get(2).addToBoard(o, i);
                        l.get(2).printBoard(difficulty);
                        System.out.println("You Got It!");
                        win = true;
                    } else {
                        o = b.checks(o);
                        l.get(2).addToBoard(o, i);
                        l.get(2).printBoard(difficulty);
                    }
                    i++;
                } else {
                    System.out.println("invalid");
                }
                if (i > 6 && !win) {
                    System.out.print("You lost. Play again?(y/n)");
                    String rut = scan.nextLine();
                    if (rut.equals("y")) {
                        l.get(2).resetBoard(difficulty);
                        i = 0;
                        b.generateNewCorrectWord();
                        l.get(2).printBoard(difficulty);
                    } else {
                        loss = true;
                    }
                }
                if (win) {
                    System.out.print("Play again?(y/n)");
                    String d = scan.nextLine();
                    if (d.equals("y")) {
                        win = false;
                        l.get(2).resetBoard(difficulty);
                        i = 0;
                        b.generateNewCorrectWord();
                        l.get(2).printBoard(difficulty);
                    } else {
                        win = true;
                    }
                }
            }
            System.out.println("See ya!");
        } else if (difficulty.equals("h")) {
            l.get(2).setBoardSize(5, 5);
            l.get(2).printBoard(difficulty);
            while (!win) {
                System.out.print("Enter a word(Should be 5 letters): ");
                o = scan.nextLine();
                if (b.validGuess(o)) {
                    if (b.check(o)) {
                        o = b.checks(o);
                        l.get(2).addToBoard(o, i);
                        l.get(2).printBoard(difficulty);
                        System.out.println("You Got It!");
                        win = true;
                    } else {
                        o = b.checks(o);
                        l.get(2).addToBoard(o, i);
                        l.get(2).printBoard(difficulty);
                    }
                    i++;
                } else {
                    System.out.println("invalid");
                }
                if (i > 4 && !win) {
                    System.out.print("You lost. Play again?(y/n)");
                    String rut = scan.nextLine();
                    if (rut.equals("y")) {
                        l.get(2).resetBoard(difficulty);
                        i = 0;
                        b.generateNewCorrectWord();
                        l.get(2).printBoard(difficulty);
                    } else {
                        loss = true;
                    }
                }
                if (win) {
                    System.out.print("Play again?(y/n)");
                    String d = scan.nextLine();
                    if (d.equals("y")) {
                        win = false;
                        l.get(2).resetBoard(difficulty);
                        i = 0;
                        b.generateNewCorrectWord();
                        l.get(2).printBoard(difficulty);
                    } else {
                        win = true;
                    }
                }
            }
            System.out.println("See ya!");
        }
    }
}
