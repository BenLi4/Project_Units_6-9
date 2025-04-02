public class Word extends Wordle {
    private String correctWord;
    public Word () {
        correctWord = getWordList().get((int) (Math.random() * getWordList().size()));
    }

    public String getCorrectWord() {
        return correctWord;
    }

    public Boolean check(String a) {
        if (a.equals(correctWord.toLowerCase())) {
            return true;
        }
        return false;
    }

    public void generateNewCorrectWord() {
        correctWord = getWordList().get((int) (Math.random() * getWordList().size()));
    }
}
