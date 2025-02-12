package POO.desafio1;

public interface NavegadorInternet {
    static void exibirPagina(String url){
        System.out.println(url);
    }
    static void addNovaAba(){
        System.out.println("Nova aba");
    }
    static void atualizaPagina(){
        System.out.println("Pagina atualizada");
    }
}
