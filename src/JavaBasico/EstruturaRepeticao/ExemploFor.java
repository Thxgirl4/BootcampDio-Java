package JavaBasico.EstruturaRepeticao;

public class ExemploFor {
    public static void main(String[] args) {
        for(int carneirinho = 0; carneirinho<=20; carneirinho++){
            System.out.println("Contando carneirinhos: " + carneirinho);
        }
        System.out.println("João dormiu");
    }
}

/*estrutura do controle de fluxo for

for (bloco de inicialização; expressão booleana de validação; bloco de atualização)
        {
        // comando que será executado até que a
        // expressão de validação torne-se falsa
        }

*/