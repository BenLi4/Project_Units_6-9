public class Word extends Wordle {
    private String correctWord;
    public Word () {
        correctWord = getWordList().get((int) (Math.random() * getWordList().size()));
    }

    public String getCorrectWord() {
        return correctWord;
    }

    public String check(String a) {
        if (a.equals(correctWord.toLowerCase())) {
            return "t";
        }
        return "f";
    }

    public void generateNewCorrectWord() {
        correctWord = getWordList().get((int) (Math.random() * getWordList().size()));
    }
}
