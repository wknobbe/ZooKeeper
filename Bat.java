public class Bat extends Mammal {
    public Bat(){
        this.setEnergyLevel(200);
    }
    public void fly(){
        System.out.println("Whooosh!!");
        this.setEnergyLevel(-50);
    }
    public void eatHumans(){
        System.out.println("Warning!! Run!!!");
        this.setEnergyLevel(25);
    }
    public void attackTown(){
        System.out.println("The town is under attack!");
        this.setEnergyLevel(-100);
    }
}