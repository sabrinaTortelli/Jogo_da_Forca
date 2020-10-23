package br.univali.tortelli;

/**
 * Classe que roda o jogo
 */
public class Game {

    private ReadFile readFile = new ReadFile();
    private Output output = new Output();
    private Input input = new Input();
    private KickLetters kickLetters = new KickLetters();

    /**
     * Método que roda o jogo
     */
    public void run() {
        boolean read;
        output.showTitle();
        input.getPlayer();
        do {
            readFile.readWord();
            String word = readFile.getWordChoosed();
            char[] rightKicks = new char[word.length()];
            rightKicks = kickLetters.showClue(rightKicks, word);
            String lettersChoosed = "";
            boolean win = false;
            while (!win && kickLetters.getKicks() > 0) {
                output.showLifeAndLetters(kickLetters.getKicks(), lettersChoosed);
                char letters = input.askKicks();
                lettersChoosed = output.sumLetters(letters, lettersChoosed);
                boolean lostLife = true;
                rightKicks = kickLetters.existsLetter(lostLife, word, letters, rightKicks);
                win = true;
                win = output.showAnswer(word, rightKicks, win);
            }
            output.winner(kickLetters.getKicks(), word, input.getName());
            read = input.askNewSession();
            kickLetters.setKicks(6);
        }while (read);
    }


}
