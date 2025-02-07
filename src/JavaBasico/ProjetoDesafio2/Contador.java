package JavaBasico.ProjetoDesafio2;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o 1º parametro: ");
        int param1 = sc.nextInt();

        System.out.println("Digite o 2º parametro: ");
        int param2 = sc.nextInt();

        try{
            contar(param1, param2);

        } catch(Exception e) {
            throw new Exception("O parametro 2 deve ser maior que o parametro 1!");
        }
    }
    static void contar(int param1, int param2) throws ParametrosInvalidosException{

        if(param1 > param2){
            throw new ParametrosInvalidosException("O parametro 1 deve ser maior que o parametro 2");
        } else {

            int contagem = param2 - param1;
            for(int i = 0; i < contagem; i++) {
                System.out.println("Parametro 1 até Parametro 2 deu a seguinte contagem: " + contagem);
            }
        }
    }
}
