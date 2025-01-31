package JavaBasico.ProjetoDesafio1;

import java.util.Scanner;

public class ContaBancaria {
    int numero;
    String agencia;
    String titular;
    double saldo;

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero de Usuario: ");
        conta.numero = sc.nextInt();

        System.out.println("Digite a agencia: ");
        conta.agencia = sc.next();

        System.out.println("Digite o titular: ");
        conta.titular = sc.next();

        System.out.println("Digite o saldo: ");
        conta.saldo = sc.nextDouble();

        System.out.println("Olá " + conta.titular + ", obrigado por criar uma conta em " +
                "nosso banco, sua agência é " + conta.agencia + ", conta " + conta.numero +
                " e seu saldo " + conta.saldo + " já está disponível para saque");

    }
}
