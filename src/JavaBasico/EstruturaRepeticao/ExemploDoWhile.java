package JavaBasico.EstruturaRepeticao;

import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {

        System.out.println("Discando...");

        do {
            //executando repetidas vezes até alguem atender
            System.out.println("Telefone tocando");
        } while(tocando());
            System.out.println("Alô Emilia Perez !!");
    }

    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);
        return ! atendeu;

    }
}
/*

//estrutura do controle de fluxo do while

do
{
    comando que será executado até que a
    expressão de validação torne-se falsa
}
while (expressão booleana de validação);

*/