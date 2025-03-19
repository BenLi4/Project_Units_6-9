public class Word extends Wordle {
    private String correctWord;
    public Word () {
        correctWord = getWordList().get((int) (Math.random() * getWordList().size()));
    }

    public String getCorrectWord() {
        return correctWord;
    }

    public boolean check(String a) {
        if (a.equals(correctWord)) {
            return true;
        }
        return false;
    }
}
