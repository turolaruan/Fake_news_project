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

public class PessoaBemInformada extends Pessoa{ // Classe Pessoa Bem Informada
    //Construtor da classe que recebe os atributos necessários e chama o construtor da SuperClasse Pessoa
    public PessoaBemInformada(int x, int y,String whatsappID,boolean fakenews,int resistente,ArrayList<String> AgendaContatos){ // Construtor da classe
        super(x,y,5,whatsappID,false,0,new ArrayList<>()); // Atribui os valores recebidos aos atributos da SuperClasse Pessoa
    }
}
