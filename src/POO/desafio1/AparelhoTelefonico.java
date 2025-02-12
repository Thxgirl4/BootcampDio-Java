package POO.desafio1;

public interface AparelhoTelefonico {
    static void ligar(int num){
        System.out.println("Ligar para numero " + num);

    }

    static void atender(){
        System.out.println("Atender chamada");
    }

    static void correioDeVoz(){
        System.out.println("Iniciar correio de voz");
    }

}
