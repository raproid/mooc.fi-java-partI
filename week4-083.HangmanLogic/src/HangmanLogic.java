
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }
//check if the guessed letters don't already have the new user letter and if no:
//check if the word to guess contains this new user letter and if no increase the fault counter by 1
//since the first condition is met, add the new user letter to the guessed letters stack

    public void guessLetter(String letter) {
        if (!this.guessedLetters.contains(letter)) {
            if (!this.word.contains(letter)) {
                this.numberOfFaults++;
            }
            this.guessedLetters += letter;
        }
    }

//create an empty buffer string for the word-to-guess, then while not exceeding the word length do this:
//take the character at i position from the word-to-guess, stringify it, check if the guessed letters have it and do this:
//keep filling the buffer with _ if no; add the character to the buffer if yes (if the guessed letters have it)
    public String hiddenWord() {
        String hiddenWord = "";
        for (int i = 0; i < this.word.length(); i++) {
            char character = this.word.charAt(i);
            String stringifiedCharacter = "" + character;
            if (guessedLetters.contains(stringifiedCharacter)) {
                hiddenWord += word.charAt(i);
            } else {
                hiddenWord += '_';
            }
        }

        return hiddenWord;
    }
}
