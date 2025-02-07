package JavaBasico.EstruturasExcepcionais;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchExample {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite seu nome: ");
            String nome = sc.nextLine();

            System.out.println("Digite seu sobrenome: ");
            String sobrenome = sc.nextLine();

            System.out.println("Digite sua idade: ");
            int idade = sc.nextInt();

            System.out.println("Digite sua altura: ");
            double altura = sc.nextDouble();

            //imprimindo os dados obtidos pelo usuario
            System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é: " + altura + "cm ");
            sc.close();
        }
        catch (InputMismatchException e) {
            System.out.println("Idade e Altura devem ser numéricos!");
        }
    }
}
/*

try {
  //  bloco de código conforme esperado
}
catch(Exception e) {// precisamos saber qual exceção
  // bloco de código que captura as exceções que podem acontecer
  // em caso de um fluxo não previsto
}

 */