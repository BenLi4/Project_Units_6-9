public class GuessWord extends Word {

    public GuessWord() {
    }

    public boolean Guess(String word) {
        if (word.equals(getCorrectWord())) {
            return true;
        } else {
            return false;
        }
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
