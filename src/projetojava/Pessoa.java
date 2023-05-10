/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package projetojava;
import java.util.Random;
import java.util.ArrayList;

/**
 *
 * @author Ruan
 */

public class Pessoa implements IMovable{ // Classe Pessoa que implementa a interface IMovable e representa uma pessoa no mundo
    Random numAleatorio = new Random(); // Objeto para gerar números aleatórios
    private boolean fakenews = new FakeNews().isFakeNews(); // Atributo que representa se a pessoa acredita em fake news ou não
    private int resistente=0; // Atributo que representa a resistência da pessoa
    private int x; // Atributo que representa a posição x da pessoa
    private int y; // Atributo que representa a posição y da pessoa
    private int velocidade =1; // Atributo que representa a velocidade da pessoa
    private int cor; // Atributo que representa a cor da pessoa
    private String whatsappID; // Atributo que representa o ID do whatsapp da pessoa
    private ArrayList<String> AgendaContatos = new ArrayList<>(); // Atributo que representa a agenda de contatos da pessoa

    // Construtor da classe que recebe os atributos necessários
    public Pessoa(int x, int y, int cor, String whatsappID,boolean fakenews,int resistente,ArrayList<String> AgendaContatos) { // Construtor da classe
        this.x = x; // Atribui o valor recebido ao atributo x
        this.y = y; // Atribui o valor recebido ao atributo y
        this.cor = cor; // Atribui o valor recebido ao atributo cor
        this.whatsappID = whatsappID; // Atribui o valor recebido ao atributo whatsappID
        setFakeNews(fakenews); // Atribui o valor recebido ao atributo fakenews
        this.resistente = resistente; // Atribui o valor recebido ao atributo resistente
        this.AgendaContatos = AgendaContatos; // Atribui o valor recebido ao atributo AgendaContatos
    }

    // Getters e Setters dos atributos da classe

    public Random getNumAleatorio() { // Método que retorna o objeto numAleatorio
        return numAleatorio; // Retorna o objeto numAleatorio
    }

    public void setNumAleatorio(Random numAleatorio) { // Método que atribui um objeto numAleatorio
        this.numAleatorio = numAleatorio; // Atribui o objeto numAleatorio
    }

    public int getX() { // Método que retorna o valor do atributo x
        return x; // Retorna o valor do atributo x
    }

    public void setX(int x) { // Método que atribui um valor ao atributo x
        this.x = x; // Atribui o valor recebido ao atributo x
    }

    public int getY() { // Método que retorna o valor do atributo y
        return y; // Retorna o valor do atributo y
    }

    public void setY(int y) { // Método que atribui um valor ao atributo y
        this.y = y; // Atribui o valor recebido ao atributo y
    }

    public void setFakeNews(boolean fakeNews) { // Método que atribui um valor ao atributo fakenews
        this.fakenews = fakeNews; // Atribui o valor recebido ao atributo fakenews
    }

    public boolean getFakeNews() { // Método que retorna o valor do atributo fakenews
        return fakenews; // Retorna o valor do atributo fakenews
    }

    public int getVelocidade() { // Método que retorna o valor do atributo velocidade
        return velocidade; // Retorna o valor do atributo velocidade
    }

    public void setVelocidade(int velocidade) { // Método que atribui um valor ao atributo velocidade
        this.velocidade = velocidade; // Atribui o valor recebido ao atributo velocidade
    }

    public int getCor() { // Método que retorna o valor do atributo cor
        return cor; // Retorna o valor do atributo cor
    }

    public void setCor(int cor) { // Método que atribui um valor ao atributo cor
        this.cor = cor; // Atribui o valor recebido ao atributo cor
    }

    public String getWhatsappID() { // Método que retorna o valor do atributo whatsappID
        return whatsappID; // Retorna o valor do atributo whatsappID
    }

    public void setWhatsappID(String whatsappID) { // Método que atribui um valor ao atributo whatsappID
        this.whatsappID = whatsappID; // Atribui o valor recebido ao atributo whatsappID
    }

    public boolean isFakenews() { // Método que retorna o valor do atributo fakenews
        return fakenews; // Retorna o valor do atributo fakenews
    }

    public void setFakenews(boolean fakenews) { // Método que atribui um valor ao atributo fakenews
        this.fakenews = fakenews; // Atribui o valor recebido ao atributo fakenews
    }

    public int getResistente() { // Método que retorna o valor do atributo resistente
        return resistente; // Retorna o valor do atributo resistente
    }

    public void setResistente(int resistente) { // Método que atribui um valor ao atributo resistente
        this.resistente = resistente; // Atribui o valor recebido ao atributo resistente
    }

    public ArrayList<String> getAgendaContatos() { // Método que retorna o valor do atributo AgendaContatos
        return AgendaContatos; // Retorna o valor do atributo AgendaContatos
    }

    public void setAgendaContatos(ArrayList<String> agendaContatos) { // Método que atribui um valor ao atributo AgendaContatos
        AgendaContatos = agendaContatos; // Atribui o valor recebido ao atributo AgendaContatos
    }

    // Métodos

    public void mover(){ // Método que faz a pessoa se mover para uma posição aleatória do mundo
        int move = numAleatorio.nextInt(4); // Gera um número aleatório entre 0 e 3
        switch(move){ // Switch que verifica o valor gerado
            case 0: //Cima
                y -= getVelocidade(); // Diminui o valor do atributo y pela velocidade da pessoa
                if(y < 1){ // Se a pessoa chegar no limite superior do mundo, ela aparece no limite inferior
                    y = 58;
                    break;
                }else if(y > 58){ // Se a pessoa chegar no limite inferior do mundo, ela aparece no limite superior
                    y = 1;
                    break;
                }
            case 1: //Baixo
                    y += getVelocidade(); // Aumenta o valor do atributo y pela velocidade da pessoa
                    if(y < 1){ // Se a pessoa chegar no limite superior do mundo, ela aparece no limite inferior
                        y = 58;
                        break;
                    }else if(y > 58){ // Se a pessoa chegar no limite inferior do mundo, ela aparece no limite superior
                        y = 1;
                        break;
                    }
                break;
            case 2: //Direita
                x += getVelocidade(); // Aumenta o valor do atributo x pela velocidade da pessoa
                if(x < 1){ // Se a pessoa chegar no limite esquerdo do mundo, ela aparece no limite direito
                    x = 29;
                    break;
                }else if(x > 29){ // Se a pessoa chegar no limite direito do mundo, ela aparece no limite esquerdo
                    x = 1;
                    break;
                }
                break;
            case 3: //Esquerda
                x -= getVelocidade(); // Diminui o valor do atributo x pela velocidade da pessoa
                if(x < 1){ // Se a pessoa chegar no limite esquerdo do mundo, ela aparece no limite direito
                    x = 29;
                    break;
                }else if(x > 29){ // Se a pessoa chegar no limite direito do mundo, ela aparece no limite esquerdo
                    x = 1;
                    break;
                }
                break;
        }
        //System.out.println("Pessoa se moveu para: " + x + " " + y);
    }

    public void AdicionaContato(Pessoa outro) { // Método que adiciona um contato na agenda de contatos da pessoa
        if (!this.AgendaContatos.contains(outro.getWhatsappID())) { // Se o contato não estiver na agenda, ele é adicionado
            this.AgendaContatos.add(outro.getWhatsappID()); // Adiciona o contato na agenda
        }
        //System.out.println("Contato adicionado: " + outro.getWhatsappID());
    }

    public void contato(Pessoa pessoa) { // Método que faz a pessoa entrar em contato com outra pessoa
        if (this == pessoa) { // Se a pessoa for ela mesma, não há contato
            return;
        }
        if (this.x == pessoa.x && this.y == pessoa.y) { // Se as pessoas estiverem na mesma posição, há contato
            // Mesmo quadrado
            this.AdicionaContato(pessoa); // Adiciona a pessoa na agenda de contatos
            pessoa.AdicionaContato(this); // Adiciona a pessoa na agenda de contatos
        } else if (Math.abs(this.x - pessoa.x) <= 1 && Math.abs(this.y - pessoa.y) <= 1) { // Se as pessoas estiverem em quadrados adjacentes, há contato
            // Quadrado adjacente
            this.AdicionaContato(pessoa); // Adiciona a pessoa na agenda de contatos
            pessoa.AdicionaContato(this); // Adiciona a pessoa na agenda de contatos
        }
        //System.out.println("Contato feito: " + pessoa.getWhatsappID());
    }
}
