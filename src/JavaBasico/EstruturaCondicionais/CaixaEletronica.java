package JavaBasico.EstruturaCondicionais;

//condicional simples

public class CaixaEletronica {
    public static void main(String[] args) {
        double saldo = 25.05;
        double valorSolicitado = 17.00;


        if(saldo >= valorSolicitado){
            saldo = saldo - valorSolicitado;

            System.out.println("Saldo atual: " + saldo);
        }
    }
}
//Quando ocorre uma validação de execução de fluxo somente quando a condição for positiva,
// consideramos como uma estrutura Simples