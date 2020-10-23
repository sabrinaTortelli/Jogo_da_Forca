package br.univali.tortelli;

/**
 * Classe que gerencia os chutes dados pelos jogadores
 */
public class KickLetters {

    private int kicks = 6;
    private Output output = new Output();

    /**
     * Mostra forca e pistas da palavra
     * @param rightKicks array de chutes certos
     * @param word palavra sorteada
     * @return retorna o array de chutes certos
     */
    public char[] showClue(char[] rightKicks, String word){
        for (int i = 0; i < rightKicks.length; i++) {
            rightKicks[i] = 0;
        }
        output.showGallow();
        for (int i = 0; i < word.length(); i++) {
            if (rightKicks[i] == 0) {
                System.out.print(" _ ");
            }
        }
        System.out.println();
        System.out.println();
        return rightKicks;
    }

    /**
     * Método que verifica se existe a letra escolhida na palavra sorteada
     * @param lostLife vidas perdidas
     * @param word palavra sorteada
     * @param letters letra escolhida
     * @param rightKicks array de chutes certos
     * @return retorna array de chutes certos
     */
    public char[] existsLetter(boolean lostLife, String word, char letters, char[] rightKicks) {
        for (int i = 0; i < word.length(); i++) {
            if (letters == word.charAt(i)) {
                System.out.println("Tem essa letra na posicao " + i + "!");
                rightKicks[i] = 1;
                lostLife = false;
            }
        }
        if (lostLife) {
            this.kicks--;
            output.drawGallows(kicks);
        }
        return rightKicks;
    }

    /**
     * @return retorna os chutes errados ou vidas do jogador
     */
    public int getKicks() {
        return kicks;
    }

    /**
     * Seta a vida quando finaliza o jogo
     * @param kicks vida do jogador ou chutes errados
     */
    public void setKicks(int kicks) {
        this.kicks = kicks;
    }
}


