/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetojava;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Ruan
 */

//Classe Mundo que representa o mundo do simulador e contém o mapa do mundo e as pessoas que estão nele

public class Mundo { // Classe Mundo
    private int [][] mapa; // Atributo que representa o mapa do mundo

    public Mundo(){ // Construtor da classe que inicializa o mapa do mundo
        refazMapa();
    }
    public void refazMapa(){ // Método que refaz o mapa do mundo
        mapa = new int[][] // Atribui um novo mapa ao atributo mapa
                {
                        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,3,3,3,3,0,0,0,1},
                        {1,0,0,0,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,3,3,3,3,0,0,0,1},
                        {1,0,0,0,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,3,3,3,3,0,0,0,1},
                        {1,0,0,0,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,3,3,3,3,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,4,4,4,4,4,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,4,4,4,4,4,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,4,4,4,4,4,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,4,4,4,4,4,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,4,4,4,4,4,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                };
    }

    public void desenhaMundo(){ // Método que desenha o mundo
        //Instanciando as classes
        IAGeradoraFakeNews IAG = new IAGeradoraFakeNews(); // Instanciando a classe IAGeradoraFakeNews
        IADestruidoraFakeNews IAD = new IADestruidoraFakeNews(); // Instanciando a classe IADestruidoraFakeNews
        MeioComunicacaoConfiavel MCC = new MeioComunicacaoConfiavel(); // Instanciando a classe MeioComunicacaoConfiavel
        for (int i = 0;i< mapa.length;i++){ // Laço que percorre o mapa
            for(int j=0;j<mapa[i].length;j++){ // Laço que percorre o mapa
                switch (mapa[i][j]) { // Switch que verifica o valor da matriz
                    case 0 -> System.out.print(" "); // Caso o valor seja 0, imprime um espaço
                    case 1 ->//cinza
                            System.out.print("\033[47m \033[0m"); // Caso o valor seja 1, imprime um espaço cinza
                    case 2 -> //roxo
                            IAG.CorIAG(); // Caso o valor seja 2, imprime um espaço roxo
                    case 3 ->//azul
                            IAD.CorIAD(); // Caso o valor seja 3, imprime um espaço azul
                    case 4 ->//verde
                            MCC.CorMCC(); // Caso o valor seja 4, imprime um espaço verde
                    case 5 ->//amarelo
                            System.out.print("\033[43m \033[0m"); // Caso o valor seja 5, imprime um espaço amarelo
                    case 6 ->//vermelho
                            System.out.print("\033[41m \033[0m"); // Caso o valor seja 6, imprime um espaço vermelho
                    case 7 ->//laranja
                            System.out.print("\033[42m \033[0m"); // Caso o valor seja 7, imprime um espaço laranja
                    default -> {
                    }
                }
            }
            System.out.println(); // Pula uma linha
        }
        System.out.println(); // Pula uma linha
    }

    public void contatoPessoas(ArrayList<Pessoa> PessoasMundo){ // Método que verifica se as pessoas estão no mesmo espaço
        for (int i = 0;i< PessoasMundo.size();i++){ // Laço que percorre o arraylist de pessoas
            for(int j=0;j<PessoasMundo.size();j++){ // Laço que percorre o arraylist de pessoas
                if(PessoasMundo.get(i).getX() == PessoasMundo.get(j).getX() && PessoasMundo.get(i).getY() == PessoasMundo.get(j).getY() && i!=j){ // verifica se as pessoas estão no mesmo espaço
                    PessoasMundo.get(i).contato(PessoasMundo.get(j)); // chama o método contato da classe pessoa
                }
            }
        }
    }

    public void colocaMapa(ArrayList<Pessoa> PessoasMundo) { // Método que coloca as pessoas no mapa
        int xAtual, yAtual; // Variáveis que armazenam a posição atual da pessoa
        for (int i = 0; i < PessoasMundo.size(); i++) { // Laço que percorre o arraylist de pessoas
            xAtual = PessoasMundo.get(i).getX(); // Armazena a posição atual da pessoa
            yAtual = PessoasMundo.get(i).getY(); // Armazena a posição atual da pessoa
            switch (mapa[xAtual][yAtual]) { // Switch que verifica o valor da matriz
                case 0 -> { // Caso o valor seja 0, coloca a pessoa no mapa
                    contatoPessoas(PessoasMundo); // Chama o método contatoPessoas
                    mapa[xAtual][yAtual] = PessoasMundo.get(i).getCor(); // Coloca a pessoa no mapa
                }
                case 2 -> { // IAGeradoraFakeNews - Pessoa bem informada vira pessoa mal informada e gera fake news para os contatos da agenda
                    for (int j = 0;j<PessoasMundo.size();j++){ // Laço que percorre o arraylist de pessoas
                        if (PessoasMundo.get(j) instanceof PessoaBemInformada) { // Verifica se a pessoa é bem informada
                            if (PessoasMundo.get(i).getAgendaContatos().contains(PessoasMundo.get(j).getWhatsappID())) { // Verifica se a pessoa está na agenda de contatos
                                PessoasMundo.set(j, new PessoaMalInformada(PessoasMundo.get(j).getX(), PessoasMundo.get(j).getY(), PessoasMundo.get(j).getWhatsappID(), PessoasMundo.get(j).isFakenews(), PessoasMundo.get(i).getResistente(), PessoasMundo.get(j).getAgendaContatos())); // Transforma a pessoa em mal informada
                                //System.out.println("Pessoa " + PessoasMundo.get(j).getWhatsappID() + " virou mal informada"); // Imprime que a pessoa virou mal informada
                            }
                        }
                    }
                    if(PessoasMundo.get(i) instanceof PessoaBemInformada) { // Verifica se a pessoa é bem informada
                        PessoasMundo.set(i, new PessoaMalInformada(xAtual, yAtual, (PessoasMundo.get(i).getWhatsappID()), PessoasMundo.get(i).isFakenews(), PessoasMundo.get(i).getResistente(), PessoasMundo.get(i).getAgendaContatos())); // Transforma a pessoa em mal informada
                    } //
                    contatoPessoas(PessoasMundo); // Chama o método contatoPessoas
                    mapa[xAtual][yAtual] = PessoasMundo.get(i).getCor(); // Coloca a pessoa no mapa
                }
                case 3 -> { // IADestruidoraFakeNews - Pessoa mal informada vira pessoa bem informada e destrói fake news para os contatos da agenda
                    for (int j = 0;j<PessoasMundo.size();j++){ // Laço que percorre o arraylist de pessoas
                        if (PessoasMundo.get(j) instanceof PessoaMalInformada) { // Verifica se a pessoa é mal informada
                            if (PessoasMundo.get(i).getAgendaContatos().contains(PessoasMundo.get(j).getWhatsappID())) { // Verifica se a pessoa está na agenda de contatos
                                PessoasMundo.set(j, new PessoaBemInformada(PessoasMundo.get(j).getX(), PessoasMundo.get(j).getY(), (PessoasMundo.get(j).getWhatsappID()), PessoasMundo.get(j).isFakenews(), PessoasMundo.get(i).getResistente(), PessoasMundo.get(j).getAgendaContatos())); // Transforma a pessoa em bem informada
                                //System.out.println("Pessoa " + PessoasMundo.get(j).getWhatsappID() + " virou bem informada"); // Imprime que a pessoa virou bem informada
                            }
                        }
                    }
                    if(PessoasMundo.get(i) instanceof PessoaMalInformada){ // Verifica se a pessoa é mal informada
                        PessoasMundo.set(i, new PessoaBemInformada(xAtual, yAtual, (PessoasMundo.get(i).getWhatsappID()), PessoasMundo.get(i).isFakenews(),PessoasMundo.get(i).getResistente(),PessoasMundo.get(i).getAgendaContatos())); // Transforma a pessoa em bem informada
                    }
                    contatoPessoas(PessoasMundo); // Chama o método contatoPessoas
                    mapa[xAtual][yAtual] = PessoasMundo.get(i).getCor(); // Coloca a pessoa no mapa
                }
                case 4 -> { // MeioComunicacaoConfiavel - Pessoa bem informada ou mal informada se tornam Pessoas Confiáveis por 30 segundos e não podem ser infectadas por fake news nesse período de tempo
                    if(PessoasMundo.get(i) instanceof PessoaBemInformada){ // Verifica se a pessoa é bem informada
                        PessoasMundo.set(i, new PessoaConfiavel(xAtual, yAtual, (PessoasMundo.get(i).getWhatsappID()), PessoasMundo.get(i).isFakenews(),30,PessoasMundo.get(i).getAgendaContatos())); // Transforma a pessoa em confiável
                    }
                    if(PessoasMundo.get(i) instanceof PessoaMalInformada){ // Verifica se a pessoa é mal informada
                        PessoasMundo.set(i, new PessoaConfiavel(xAtual, yAtual, (PessoasMundo.get(i).getWhatsappID()), PessoasMundo.get(i).isFakenews(),30,PessoasMundo.get(i).getAgendaContatos())); // Transforma a pessoa em confiável
                    }
                    contatoPessoas(PessoasMundo); // Chama o método contatoPessoas
                    mapa[xAtual][yAtual] = PessoasMundo.get(i).getCor(); // Coloca a pessoa no mapa
                }
                default -> {
                }
            }
            if(PessoasMundo.get(i).getResistente() != 0){ // Verifica se a pessoa é resistente a fake news
                PessoasMundo.get(i).setResistente(PessoasMundo.get(i).getResistente()-1); // Diminui o tempo de resistência da pessoa
                if(PessoasMundo.get(i).getResistente() == 0){ // Verifica se o tempo de resistência da pessoa acabou
                    if(PessoasMundo.get(i) instanceof PessoaConfiavel){ // Verifica se a pessoa é confiável
                        PessoasMundo.set(i, new PessoaBemInformada(xAtual, yAtual, (PessoasMundo.get(i).getWhatsappID()), PessoasMundo.get(i).isFakenews(),0,PessoasMundo.get(i).getAgendaContatos())); // Transforma a pessoa em bem informada
                    }
                }
            }
        }
    }
    ArrayList<Pessoa> PessoasMundo = new ArrayList<>(); // Cria um arraylist de pessoas chamado PessoasMundo
    Random numAleatorio = new Random(); // Cria um objeto da classe Random chamado numAleatorio
    public void geraPessoas(){ // Método que gera as pessoas
        for(int i=0; i<100; i++){ // Laço que coloca 100 pessoas no arraylist de pessoas
            PessoasMundo.add(new PessoaBemInformada(numAleatorio.nextInt(1,28),numAleatorio.nextInt(1,58),String.valueOf(i),false,0,new ArrayList<>())); // Adiciona uma pessoa no mundo(Padrão: PessoaBemInformada),coloca ela no arraylist de pessoas e gera uma posição aleatória para ela
        }
    }
}
