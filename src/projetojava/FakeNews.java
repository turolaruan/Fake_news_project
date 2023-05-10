/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetojava;

/**
 *
 * @author Ruan
 */

//Classe FakeNews que possui um atributo booleano iniciado como false e os métodos get e set para esse atributo

public class FakeNews { // Classe FakeNews

    private boolean fakeNews = false; // Atributo fakeNews iniciado como false

    //Getter e setter do atributo fakeNews
    public boolean isFakeNews(){ // Método get para o atributo fakeNews
        return fakeNews; // Retorna o valor do atributo fakeNews
    }
    public void setFakeNews(boolean fakeNews){ // Método set para o atributo fakeNews
        this.fakeNews = fakeNews; // Atribui o valor passado como parâmetro ao atributo fakeNews
    }
}
