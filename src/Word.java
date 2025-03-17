public class Word extends Wordle {
    String correctWord;
    public Word () {
        correctWord = getWordList().get((int) (Math.random() * getWordList().size()));
    }

    public String getCorrectWord() {
        return correctWord;
    }
}
