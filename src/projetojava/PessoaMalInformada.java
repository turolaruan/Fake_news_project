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

//Classe que representa uma pessoa mal informada e que herda de Pessoa os atributos necessários

public class PessoaMalInformada extends Pessoa{ // Classe Pessoa Mal Informada
    //Construtor da classe que recebe os atributos necessários e chama o construtor da SuperClasse Pessoa
    public PessoaMalInformada(int x, int y, String whatsappID,boolean fakenews,int resistente,ArrayList<String> AgendaContatos){ // Construtor da classe
        super(x,y,6,whatsappID,true,0,new ArrayList<>()); // Atribui os valores recebidos aos atributos da SuperClasse Pessoa
    }
}
