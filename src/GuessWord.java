public class GuessWord extends Word {
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String RED = "\033[0;31m";     // RED   // WHITE

    public GuessWord() {
    }

    @Override
    public boolean check(String a) {
        String b = "";
            for (int i = 0; i < 5; i++) {
                if (a.substring(i, i + 1).equals(getCorrectWord().substring(i, i + 1))) {
                    b += GREEN + a.charAt(i);
                } else if (getCorrectWord().contains(a.substring(i, i + 1))) {
                    b += YELLOW + a.charAt(i);
                } else {
                    b += RED + a.charAt(i);
                }
            }
        a = b;
        return false;
    }

    public boolean validGuess(String guess) {
        if (guess.length() > 5) {
            return false;
        } else {
            if (!getWordList().contains(guess)) {
                return false;
            }
        }
        return true;
    }
}
