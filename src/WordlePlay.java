import java.util.Scanner;
import java.util.ArrayList;
public class WordlePlay {
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String RED = "\u001B[31m";
    public static final String WHITE = "\u001B[37m";
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
        System.out.println( GREEN + "Welcome " + YELLOW + "to " + RED + "Wordle!" + WHITE);
        System.out.print("What's your name? ");
        String t = scan.nextLine();
        System.out.println("Hello " + t);
        System.out.print("Select difficulty (" + GREEN + "e" + WHITE + "/" + YELLOW + "n" + WHITE + "/" + RED + "h" + WHITE + "): ");
        difficulty = scan.nextLine().toLowerCase();
        while (!difficulty.equals("e") && !difficulty.equals("n") && !difficulty.equals("h")) {
            System.out.print("Invalid. Enter a difficulty (e/n/h): ");
            difficulty = scan.nextLine().toLowerCase();
        }
        int i = 0;
        String o = "";
        if (difficulty.equals("n")) {
            l.get(2).printBoard(difficulty);
            while (!win && !loss) {
                System.out.print("Enter a word(Should be 5 letters): ");
                o = scan.nextLine();
                if (checker(l.get(1), o)) {
                    if (b.check(o)) {
                        o = b.checks(o);
                        l.get(2).addToBoard(o, i);
                        l.get(2).printBoard(difficulty);
                        System.out.println(GREEN + "You Got It!" + WHITE);
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
                    System.out.print("You " + RED + "lost." + WHITE + " Play again?(" + GREEN + "y" + WHITE + "/" + RED + "n" + WHITE + ")");
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
                    System.out.print(" Play again?(" + GREEN + "y" + WHITE + "/" + RED + "n" + WHITE + ")");
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
                if (checker(l.get(1), o)) {
                    if (b.check(o)) {
                        o = b.checks(o);
                        l.get(2).addToBoard(o, i);
                        l.get(2).printBoard(difficulty);
                        System.out.println(GREEN + "You Got It!" + WHITE);
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
                    System.out.print("You " + RED + "lost." + WHITE + " Play again?(" + GREEN + "y" + WHITE + "/" + RED + "n" + WHITE + ")");
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
                    System.out.print(" Play again?(" + GREEN + "y" + WHITE + "/" + RED + "n" + WHITE + ")");
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
        } else {
            l.get(2).setBoardSize(5, 5);
            l.get(2).printBoard(difficulty);
            while (!win) {
                System.out.print("Enter a word(Should be 5 letters): ");
                o = scan.nextLine();
                if (checker(l.get(1), o)) {
                    if (b.check(o)) {
                        o = b.checks(o);
                        l.get(2).addToBoard(o, i);
                        l.get(2).printBoard(difficulty);
                        System.out.println(GREEN + "You Got It!" + WHITE);
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
                    System.out.print("You " + RED + "lost." + WHITE + " Play again?(" + GREEN + "y" + WHITE + "/" + RED + "n" + WHITE + ")");
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
                    System.out.print(" Play again?(" + GREEN + "y" + WHITE + "/" + RED + "n" + WHITE + ")");
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

    public boolean checker (Wordle a, String b) {
        if (a instanceof GuessWord) {
            return ((GuessWord) a).validGuess(b);
        } else if (a instanceof Word) {
            return ((Word) a).check(b);
        } else {
            return false;
        }
    }
}
