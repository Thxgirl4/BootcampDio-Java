package JavaBasico.EstruturaCondicionais;

//condicional encadeada

public class ResultadoAluno {
    public static void main(String[] args) {
        int nota = 6;

        if(nota > 7) // true
        {
            System.out.println("Aluno aprovado");
        }
        else if (nota >= 5 && nota < 7)   // true or false
        {
            System.out.println("Aluno em Recuperação");
        }
        else {
            System.out.println("Aluno reprovado");
        }
    }
}
// aprendendo if, else if e else.
//para testar mais de duas condições