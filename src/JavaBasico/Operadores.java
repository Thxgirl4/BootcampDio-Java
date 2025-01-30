package JavaBasico;

public class Operadores {

    //operadores aritméticos
    double soma = 10.0 + 7.1;
    int subtrai = 5 - 2;
    int multiplicacao = 5 * 2;
    int divisao = 5 / 2;
    int resto = 5 % 2;
    double resultado = soma + subtrai * multiplicacao;


    public static void main(String[] args) {
        //operações de incremento
        int numero = 8;
           System.out.println(numero ++); // pós incremento
             System.out.println(numero);

            System.out.println(++ numero); // pré incremento

            System.out.println(numero --); // pós decremento
              System.out.println(numero);

            System.out.println(-- numero); // pré decremento

        boolean resultado1 = numero % 2 == 0;
            System.out.println(!resultado1); // ! é usado para inverter o resultado

        //operador ternário: <Expressão Condicional> ? <Caso condição seja true> : <Caso condição seja false>
        int a, b;
        a = 10;
        b = 15;

        String resultado2 = a==b?"verdadeiro":"falso"; //true or false
        System.out.println(resultado2);
//operador relacional -> verificam a relação entre duas variaveis ou expressões
//        == -> var igual a outra
//        != -> var diferente da outra
//        > -> var maior que a outra
//        >= -> var maior ou igual a outra
//        < -> var menor que outra
//        <= -> var menor ou igual a outra
        if(a > b)
        {
            System.out.println("a é maior que b");
        } else{
            System.out.println("a não é maior que b");
        }

//operadores lógicos
// && -> significa E
// || -> significa OU


    }
}
