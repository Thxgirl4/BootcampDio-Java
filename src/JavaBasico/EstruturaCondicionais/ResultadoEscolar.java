package JavaBasico.EstruturaCondicionais;

public class ResultadoEscolar {
    public static void main(String[] args) {

        //condicional ternaria
        int nota = 8;

        String resultado = nota>=7 ? "Aprovado" : nota>=5 && nota<7 ? "Recuperação" : "Reprovado";
         System.out.println(resultado);
    }
}


//condicional composta
/* Algumas vezes o nosso programa deverá seguir mais de uma jornada de execução
condionado a uma regra de negócio,
este cenário é denominado Estrutura Condicional Composta

        int nota1 = 5;

        if(nota1 >= 7)
        System.out.println("Aprovado");
        else
                System.out.println("Reprovado");
*/