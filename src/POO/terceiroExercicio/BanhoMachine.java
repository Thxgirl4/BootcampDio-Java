package POO.terceiroExercicio;

public class BanhoMachine {
    private boolean clean;

    private int water;

    private int shampo;

    private Pet pet;

    public void darBanhoNoPet(){
        if(this.pet == null){
            System.out.println("coloque o pet na maquina para o banho");
            return;
        }
        this.water -= 10;
        this.shampo -= 2;

        pet.setClean(true);
        System.out.println("o pet " + pet.getNome() + " esta limpo");

    }

    public void addWater(){
        if(water == 30){
            System.out.println("A capacidade de agua esta no maximo");
            return;
        }
        water += 2;
    }

    public void addShampo(){
        if(shampo == 30){
            System.out.println("A capacidade de shampo esta no maximo");
            return;
        }
        shampo += 2;
    }

    public int getWater() {
        return water;
    }
    public int getShampo() {
        return shampo;
    }

    public boolean hasPet(){
        return pet != null;
    }

    public void setPet(Pet pet) {
        if(!this.clean){
            System.out.println("A maquina esta suja, deve ser limpa antes de colocar o pet");
            return;
        }

        if(hasPet()){
            System.out.println("o pet " + this.pet.getNome() + " esta na maquina neste momento");
            return;
        }
        this.pet = pet;
    }

    public void removePet(){
        this.clean = this.pet.isClean();
        System.out.println("O pet " + pet.getNome() + " está limpo");
        this.pet = null;
    }

    public void washMachine(){
        this.water -= 10;
        this.shampo -= 2;
        this.clean = true;
        System.out.println("A maquina esta limpa");
    }

}
