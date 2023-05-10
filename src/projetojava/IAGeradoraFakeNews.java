/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetojava;

/**
 *
 * @author Ruan
 */

//Classe que representa IA geradora de fake news e possui o método que colore a IA geradora de fake news

public class IAGeradoraFakeNews { // Classe IAGeradoraFakeNews
    private int cor; // Atributo que representa a cor da IA geradora de fake news

    //Getter e setter do atributo cor
    public int getCor() { // Método que retorna a cor da IA geradora de fake news
        return cor; // Retorna a cor da IA geradora de fake news
    }
    public void setCor(int cor) { // Método que altera a cor da IA geradora de fake news
        this.cor = cor; // Altera a cor da IA geradora de fake news
    }
    public void CorIAG() { // Método que colore a IA geradora de fake news
        System.out.print("\033[45m \033[0m"); // Cor da IA geradora de fake news
    }
}
