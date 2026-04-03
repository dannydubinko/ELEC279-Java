import java.util.ArrayList;

import javax.imageio.plugins.tiff.TIFFImageReadParam;

public class Zookeeper {

    public Zookeeper() {
    }

    public static void main(String[] args) {

        ArrayList<Food> foodBag = new ArrayList<>();
        ArrayList<Animal> zoo = new ArrayList<>();

        // Food initialization
        Food lettuce = new Food("Lettuce", 0, FoodType.PLANT);
        Food steak = new Food("Steak", 0, FoodType.MEAT);
        Food kibble = new Food("Kibble", 0, FoodType.MIXED);
        // Add elements to the ArrayList
        foodBag.add(lettuce);
        foodBag.add(steak);
        foodBag.add(kibble);

        // Animal Initilization
        Hippo hippo = new Hippo();
        Wolf wolf = new Wolf();
        Lion lion = new Lion();
        Cat cat = new Cat();
        Dog dog = new Dog();

        zoo.add(hippo);
        zoo.add(wolf);
        zoo.add(lion);
        zoo.add(cat);
        zoo.add(dog);

        for (Food food : foodBag) {
            System.out.println("--- FEEDING ROUND: " + food.name);
            for (Animal animal : zoo) {
                animal.eat(food);
            }
            System.out.println(" ");
        }

    }
}
