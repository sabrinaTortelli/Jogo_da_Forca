package br.univali.tortelli;

import java.io.FileNotFoundException;
import java.io.File;
import java.util.Random;
import java.util.Scanner;

/**
 * Classe que lê o arquivo das palavras que serão sorteadas para o jogador
 */
public class ReadFile {

    private String wordChoosed;

    /**
     * Lê a palavra sorteada no arquivo
     */
    public void readWord(){
        int number = randomNumber();
        try {
            String file = "words.txt";
            Scanner fileManipulation = new Scanner(new File(file));
            for(int i=0; i<=number; i++){
                this.wordChoosed = fileManipulation.nextLine();
            }
            fileManipulation.close();
        } catch (FileNotFoundException e){
            System.out.println("Arquivo não encontrado");
        }
    }

    /**
     * Sorteia um número para ser lido a palavra no arquivo
     * @return retorna número lido
     */
    private int randomNumber(){
        Random number = new Random();
        return number.nextInt(108) +1;
    }

    /**
     * @return retorna palavra sorteada
     */
    public String getWordChoosed() {
        return wordChoosed;
    }

}
