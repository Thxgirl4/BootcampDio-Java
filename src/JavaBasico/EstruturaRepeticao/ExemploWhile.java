package JavaBasico.EstruturaRepeticao;

import java.util.random.RandomGenerator;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50;

        while(mesada > 0){
            Double valorDoce = valorAleatorio();
            String result = String.format("%.2f", valorDoce);

            System.out.println("Doce de valor: " + result + " Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("João gastou toda a sua mesada");
    }

    private static Double valorAleatorio() {
        return RandomGenerator.getDefault().nextDouble(2, 8);
    }
}

/*
//estrutura do controle de fluxo while

while (expressão booleana de validação)
{
     // comando que será executado até que a
     // expressão de validação torne-se falsa
}

*/