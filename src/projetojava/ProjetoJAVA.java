/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetojava;
import java.util.Date;

/**
 *
 * @author Ruan
 */

public class ProjetoJAVA { // Classe principal
    
    public static void main(String[] args) { // Método main que gera o mundo e faz a simulação
        Mundo mundo = new Mundo(); // Cria um mundo
        Date tempo_inicio = new Date(); // Cria uma variável para medir o tempo de simulação
        mundo.geraPessoas(); // Gera as pessoas

        //Loop que faz a simulação

        while(true){ // Loop infinito
            mundo.refazMapa(); // Refaz o mapa
            int contBem = 0; // Contadores de pessoas bem informadas
            int contMal = 0; // Contadores de pessoas mal informadas
            int contResistente = 0; // Contadores de pessoas resistentes

            for(Pessoa p : mundo.PessoasMundo){ // Loop que faz as pessoas se moverem
                p.mover(); // Move a pessoa
                //System.out.println(p);
                if(p instanceof PessoaBemInformada){ // Verifica se a pessoa é bem informada
                    contBem++; // Incrementa o contador de pessoas bem informadas
                }
                else if(p instanceof PessoaMalInformada){ // Verifica se a pessoa é mal informada
                    contMal++; // Incrementa o contador de pessoas mal informadas
                }else{ // Se não for bem informada nem mal informada, é resistente
                    contResistente++; // Incrementa o contador de pessoas resistentes
                }
                //System.out.println("Agenda de contatos: " + pessoabem.get(i).getAgendaContatos().size());
            }
            mundo.colocaMapa(mundo.PessoasMundo); // Coloca as pessoas no mapa

            //Printa o tempo de simulação, o total de pessoas, o total de pessoas bem informadas, mal informadas e resistentes e o mapa

            Date current_time = new Date(); // Cria uma variável para medir o tempo de simulação
            System.out.println("====================================");
            System.out.println("Tempo de simulação: " + (current_time.getTime() - tempo_inicio.getTime())/1000); // Printa o tempo de simulação
            System.out.println(); // Pula uma linha
            System.out.println("Total de pessoas: " + (int)mundo.PessoasMundo.size()); // Printa o total de pessoas no mundo
            System.out.println("\u001b[43m \033[0m Bem informados: " + contBem); // Printa o total de pessoas bem informadas
            System.out.println("\u001b[41m \033[0m Mal informados: " + contMal); // Printa o total de pessoas mal informadas
            System.out.println("\u001b[42m \033[0m Resistentes: " + contResistente); // Printa o total de pessoas resistentes
            mundo.desenhaMundo(); // Printa o mapa


            try{ // Try-catch para esperar um tempo antes de refazer o loop
                Thread.sleep(1000); // Tempo de espera
            }catch(Exception e){ // Caso dê erro
                e.printStackTrace(); // Printa o erro
            }
        }
    }
}
