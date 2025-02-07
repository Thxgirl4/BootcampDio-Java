package JavaBasico.ControleCandidatos;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String[] candidatos = {"Felipe", "Marcia", "Jose", "Paulo"};
        for(String candidato: candidatos){
            entrandoEmContato(candidato);

        }
    }
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasRealizadas++;
            } else {
                System.out.println("Contato realizado com sucesso!");
            }

        } while(continuarTentando && tentativasRealizadas < 3);
            if(atendeu)
                System.out.println("Contato realizado com " + candidato + ", na " + tentativasRealizadas + " tentativas!");
            else
                System.out.println("Não conseguimos contato com " + candidato + ", numero max tentativas " + tentativasRealizadas);
    }
     //metodo aux
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirListaSelecionados(){
        String[] candidatos = {"Felipe", "Marcia", "Jose", "Paulo"};
        System.out.println("Lista de Candidatos com o indidce do elemento: ");

        for(int i = 0; i<candidatos.length; i++){
            System.out.println("Candidato de nº " + (i+1) + " é o " + candidatos[i]);
        }
        System.out.println("Forma abreviada de interação for each");
        for(String candidato: candidatos){
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static void selecaoCandidatos(){
        String[] candidatos = {"Felipe", "Marcia", "Jose", "Paulo", "Julia",
                                 "Julie", "Augusto", "Roger" };

        int candidatosSelecionados = 0;
        int candidatosAtual=0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.printf(" O candidato %s Solicitou este valor de salario %.1f ", candidato, salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.printf("O candidato %s esta aplicado com sucesso!", candidato);
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }

    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;

        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM OUTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }

    }
}
