package POO.desafio1;

public interface ReprodutorMusical {
    static void tocarMusica(){
        System.out.println("Tocando musica agora!");
    }
    static void pausarMusica(){
        System.out.println("Pausando a musica!");
    }

    static void selecionarMusica(String musica){
        System.out.println("Selecionando musica: " + musica);

    }

}
