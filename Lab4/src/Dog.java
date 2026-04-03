public class Dog extends Canine implements Pet {
    public Dog() {
    }

    public String wagTail() {
        return "Wagging tail";
    }

    public void play() {
        System.out.println("Dog fetches a ball");
    }

    public void beFriendly() {
        System.out.println("Dog is nuzzling");
    }

    @Override
    public void eat(Food food) {
        if (food.name.equalsIgnoreCase("Bone")) {
            String wags = wagTail();
            System.out.println(wags);
        }
        System.out.println("The Dog eats the " + food.name + " no questions asked!");
    }
}
