package JavaBasico.EstruturaRepeticao;

public class ExemploBreakContinue {
    public static void main(String[] args) {
        for(int num = 1; num <=10; num++) {
            if(num == 3)
                break;
            System.out.println(num);
        }
    }
}
/*
O comando break interrompeu o laço,
já o continue interrompeu somente a iteração atual.

*/