package JavaBasico.EstruturaCondicionais;
// switch case
public class SistemaTelefonico {
    public static void main(String[] args) {
       String plano = "T";

       switch (plano){
           case "T":{
               System.out.println("5Gb de Youtube");
           }
           case "M":{
               System.out.println("Wpp e Insta grátis");
           }
           case "B":{
               System.out.println("100 minutos de ligação");
           }
       }


    }
}
