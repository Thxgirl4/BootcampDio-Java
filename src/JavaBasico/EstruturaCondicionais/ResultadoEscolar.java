package JavaBasico.EstruturaCondicionais;

//condicional composta

public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota1 = 5;

        if(nota1 >= 7)
            System.out.println("Aprovado");
        else
            System.out.println("Reprovado");
    }
}
/* Algumas vezes o nosso programa deverá seguir mais de uma jornada de execução
condionado a uma regra de negócio,
este cenário é denominado Estrutura Condicional Composta
*/