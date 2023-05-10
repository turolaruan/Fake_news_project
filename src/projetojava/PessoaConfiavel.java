/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetojava;
import java.util.ArrayList;

/**
 *
 * @author Ruan
 */

//Classe que representa uma pessoa bem informada e que herda de Pessoa os atributos necessários

public class PessoaConfiavel extends Pessoa{ // Classe Pessoa Confiável
    //Construtor da classe que recebe os atributos necessários e chama o construtor da SuperClasse Pessoa
    public PessoaConfiavel(int x, int y, String whatsappID, boolean fakenews, int resistente, ArrayList<String> AgendaContatos){ // Construtor da classe
        super(x,y,7,whatsappID,false,resistente,new ArrayList<>()); // Atribui os valores recebidos aos atributos da SuperClasse Pessoa
    }
}
