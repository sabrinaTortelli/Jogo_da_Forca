package br.univali.tortelli;

/**
 * Classe que mostra na tela as informações do jogo
 */
public class Output {

    /**
     * Mostra mensagem de vitória ou derrota do jogador
     * @param lifes vidas restantes do jogador
     * @param wordChoosed palavra sorteada
     * @param name nome do jogador
     */
    public void winner(int lifes, String wordChoosed, String name){
        if(lifes!=0){
            System.out.println("-----------------------------------");
            System.out.println("Parabéns, " + name + ", você ganhou");
            System.out.println("A palavra era: " + wordChoosed);
            System.out.println("-----------------------------------");
        } else{
            System.out.println("-----------------------------------");
            System.out.println("_____________GAME OVER_____________");
            System.out.println(name + ", voce perdeu!");
            System.out.println("A palavra era: " + wordChoosed);
            System.out.println("-----------------------------------");
        }
    }

    /**
     * Mostra a forca
     */
    public void showGallow(){
        System.out.println("  _____________");
        System.out.println("  |           |");
        System.out.println("  |");
        System.out.println("  |");
        System.out.println("  |");
        System.out.println("  |");
        System.out.println("  |");
        System.out.println("_____");
        System.out.println();
    }

    /**
     * Mostra o resultado da forca de acordo com chutes dados errados
     * @param kicks chutes dados
     */
    public void drawGallows(int kicks){
        if(kicks==6) {
            System.out.println("  _____________");
            System.out.println("  |           |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("_____");
        }
        if(kicks==5) {
            System.out.println("  _____________");
            System.out.println("  |           |");
            System.out.println("  |           O");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("_____");
        }
        if(kicks == 4) {
            System.out.println("  _____________");
            System.out.println("  |           |");
            System.out.println("  |           O");
            System.out.println("  |           |");
            System.out.println("  |           |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("_____");
        }
        if(kicks == 3){
            System.out.println("  _____________");
            System.out.println("  |           |");
            System.out.println("  |           O");
            System.out.println("  |          /|");
            System.out.println("  |           |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("_____");
        }
        if(kicks == 2) {
            System.out.println("  _____________");
            System.out.println("  |           |");
            System.out.println("  |           O");
            System.out.println("  |          /|/");
            System.out.println("  |           |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("_____");
        }
        if(kicks== 1) {
            System.out.println("  _____________");
            System.out.println("  |           |");
            System.out.println("  |           O");
            System.out.println("  |          /|/");
            System.out.println("  |           |");
            System.out.println("  |          /");
            System.out.println("  |");
            System.out.println("_____");
        }
        if(kicks == 0) {
            System.out.println("  _____________");
            System.out.println("  |           |");
            System.out.println("  |           O");
            System.out.println("  |          /|/");
            System.out.println("  |           |");
            System.out.println("  |          / /");
            System.out.println("  |");
            System.out.println("_____");
        }
    }

    /**
     * Mostra a resposta de acordo com chutes dados
     * @param word palavra sorteada
     * @param rightKicks chutes certos
     * @param win booleano que controla se o jogador ganhou ou não
     * @return retorna falso se right clicks for igual a 0
     */
    public boolean showAnswer(String word, char[] rightKicks, boolean win){
        for (int i = 0; i < word.length(); i++) {
            if (rightKicks[i] == 0) {
                System.out.print(" _ ");
                win = false;
            } else {
                System.out.print(" " + word.charAt(i) + " ");
            }
        }
        System.out.println();
        return win;
    }

    /**P
     * Adiciona as letras chutadas à String lettersChoosed
     * @param letters letras chutadas
     * @param lettersChoosed letras escolhidas
     * @return retorna letras escolhidas
     */
    public String sumLetters(char letters, String lettersChoosed){
        lettersChoosed += " " + letters;
        return lettersChoosed;
    }

    /**
     * Mostra na tela a quantidade de vidas e as letras já utilizadas
     * @param kicks vidas restantes
     * @param lettersChoosed letras chutadas
     */
    public void showLifeAndLetters(int kicks, String lettersChoosed){
        System.out.println("_____________________________");
        System.out.println("Você tem " + kicks + " vidas!");
        System.out.println("Letras utilizadas: " + lettersChoosed);
        System.out.println("_____________________________");
    }

    /**
     * Mostra título do jogo
     */
    public void showTitle(){
        System.out.println("---------------------------------------");
        System.out.println("------------ Jogo da Forca ------------");
        System.out.println("---------------------------------------");
    }
}
