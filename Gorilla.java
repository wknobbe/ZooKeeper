public class Gorilla extends Mammal {
    public void throwSomething(){
        System.out.println("The Gorilla threw something.");
        this.setEnergyLevel(-5);
    }
    public void eatBanana(){
        System.out.println("The Gorilla ate a banana.");
        this.setEnergyLevel(10);
    }
    public void climb(){
        System.out.println("The Gorilla is climbing!");
        this.setEnergyLevel(-10);
    }
}