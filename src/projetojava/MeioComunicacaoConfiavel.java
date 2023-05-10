/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetojava;

/**
 *
 * @author Ruan
 */

//Classe que representa o meio de comunicação confiável e possui o método que colore o meio de comunicação confiável

public class MeioComunicacaoConfiavel { // Classe MeioComunicacaoConfiavel
    private int cor; // Atributo que representa a cor do meio de comunicação confiável

    //Getter e setter do atributo cor
    public int getCor() { // Getter do atributo cor
        return cor; // Retorna o atributo cor
    }

    public void setCor(int cor) { // Setter do atributo cor
        this.cor = cor; // Atribui o valor passado como parâmetro ao atributo cor
    }
    public void CorMCC() { // Método que colore o meio de comunicação confiável
        System.out.print("\033[46m \033[0m"); // Cor do meio de comunicação confiável
    }
}
