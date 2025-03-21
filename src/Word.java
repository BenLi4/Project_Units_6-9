public class Word extends Wordle {
    private String correctWord = correctWord = getWordList().get((int) (Math.random() * getWordList().size()));
    public Word () {
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
}
