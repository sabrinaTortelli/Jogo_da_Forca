package br.univali.tortelli;

import java.util.Scanner;

public class Input {

    private String name;

    /**
     * Pergunta o nome do jogador
     */
    public void getPlayer() {
        Scanner name = new Scanner(System.in).useDelimiter("\r\n");
        System.out.println("Qual seu nome?");
        this.name = name.nextLine().toUpperCase();
    }

    /**
     * Pede uma letra ao jogador
     * @return retorna a letra em maiúsculo
     */
    public Character askKicks() {
        char letter;
        Scanner read = new Scanner(System.in);
        System.out.println("Digite uma letra: ");
        letter = read.next().charAt(0);
        return Character.toUpperCase(letter);
    }

    /**
     * Pergunta se jogador deseja jogar mais uma partida.
     * @return retorna verdadeiro se sim e falso se não
     */
    public boolean askNewSession() {
        String readed;
        Scanner read = new Scanner(System.in);
        do {
            System.out.println("Gostaria de jogar novamente? (s/n)");
            readed = read.nextLine();
            if (readed.equalsIgnoreCase("s")){
                return true;
            } else if(readed.equalsIgnoreCase("n")){
                System.out.println("Fim de jogo");
                return false;
            }
        } while (!readed.equalsIgnoreCase("s") || !readed.equalsIgnoreCase("n"));
        return false;
    }

    /**
     * @return retorna nome do jogador
     */
    public String getName() {
        return name;
    }


}
