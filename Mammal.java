public class Mammal {
    private int energyLevel = 100;
    public int displayEnergy(){
        System.out.println("The animal has: " + energyLevel + " energy remaining.");
        return energyLevel;
    }
    public void setEnergyLevel(int num){
        energyLevel += num;
    }
}