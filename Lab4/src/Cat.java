import java.util.Random;

public class Cat extends Animal implements Pet {
    public Cat() {
    }

    public void play() {
        System.out.println("Cat chases a laser pointer");
    }

    public void beFriendly() {
        System.out.println("Cat is purring");
    }

    public void eat(Food food) {

        if (food.name.equalsIgnoreCase("Salmon")) {
            System.out.println("Cat eats the Salmon");
        } else {
            Random rand = new Random();
            double randomDouble = rand.nextDouble();

            if (randomDouble >= 0.5) {
                System.out.println("Cat looks at the " + food.name + "... and ignores you");
            } else {
                System.out.println("Cat eats the " + food.name);
            }
        }

    }
}
