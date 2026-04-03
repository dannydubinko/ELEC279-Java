public class Hippo extends Animal {
    public Hippo() {
    }

    @Override
    public void eat(Food food) {
        switch (food.type) {
            case MEAT:
                System.out.println("Hippo says Yuck! I only eat Plant");
                break;
            case MIXED:
                System.out.println("Hippo says Yuck! I only eat Plant");
                break;
            default:
                System.out.println("Hippo eats the " + food.name + ". Crunch crunch!");

        }
    }
}
