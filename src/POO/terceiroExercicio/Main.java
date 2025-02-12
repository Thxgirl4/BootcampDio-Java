package POO.terceiroExercicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        var option = -1;

        do{
            System.out.println("--------- Escolha uma das opções --------");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer a maquina com água");
            System.out.println("3 - Abastecer a água com shampo");
            System.out.println("4 - Verificar água da maquina");
            System.out.println("5 - Verificar shampo da maquina");
            System.out.println("6 - Verificar se tem pet no banho");
            System.out.println("7 - Colocar pet na maquina");
            System.out.println("8 - Retirar pet da maquina");
            System.out.println("9 - Limpar a maquina");
            System.out.println("0 - Sair");
            option = scanner.nextInt();

        } while(option != 0);
    }
    public void setPetToMachine(){
        System.out.println("Digite o nome do pet: ");
    }
}
