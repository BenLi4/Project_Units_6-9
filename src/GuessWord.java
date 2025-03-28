public class GuessWord extends Word {
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String RED = "\u001B[31m";
    public static final String WHITE = "\u001B[37m";

    public GuessWord() {
    }

    @Override
    public String check(String a) {
        String b = "";
            for (int i = 0; i < 5; i++) {
                if (a.substring(i, i + 1).toLowerCase().equals(getCorrectWord().substring(i, i + 1))) {
                    b += GREEN + a.charAt(i) + WHITE;
                } else if (getCorrectWord().contains(a.substring(i, i + 1).toLowerCase())) {
                    b += YELLOW + a.charAt(i) + WHITE;
                } else {
                    b += RED + a.charAt(i) + WHITE;
                }
            }
        return b;
    }

    public boolean validGuess(String guess) {
        if (guess.length() > 5) {
            return false;
        } else {
            if (!getWordList().contains(guess.toLowerCase())) {
                return false;
            }
        }
        return true;
    }
}
