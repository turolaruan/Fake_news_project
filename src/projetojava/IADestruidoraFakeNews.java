/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetojava;

/**
 *
 * @author Ruan
 */

//Classe que representa IA destruidora de fake news e possui o método que colore a IA destruidora de fake news

public class IADestruidoraFakeNews { // Classe IADestruidoraFakeNews
    private int cor; // Atributo que representa a cor da IA destruidora de fake news

    //Getter e setter do atributo cor
    public int getCor() { // Método que retorna a cor da IA destruidora de fake news
        return cor; // Retorna a cor da IA destruidora de fake news
    }
    public void setCor(int cor) { // Método que altera a cor da IA destruidora de fake news
        this.cor = cor; // Altera a cor da IA destruidora de fake news
    }
    public void CorIAD() { // Método que colore a IA destruidora de fake news
        System.out.print("\033[44m \033[0m"); // Cor da IA destruidora de fake news
    }
}