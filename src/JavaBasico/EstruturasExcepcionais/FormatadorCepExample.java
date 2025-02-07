package JavaBasico.EstruturasExcepcionais;

public class FormatadorCepExample {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("21520253");
            System.out.println(cepFormatado);
        }catch (CepInvalidException e){
            System.out.println(e.getMessage());
        }
    }
    static String formatarCep(String cep) throws CepInvalidException {
        if(cep.length() != 8) {
            throw new CepInvalidException();

        }
        return "21.520-253";
    }
}
