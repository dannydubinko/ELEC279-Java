public abstract class Animal {
    
    private int energy;

    public Animal(){
        this.energy = 0;
    }

    public int getEnergy(){
        return this.energy;
    }

    public abstract void eat(Food food);
}
