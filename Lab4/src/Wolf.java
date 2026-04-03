public class Wolf extends Canine {
    public Wolf() {
    }

    @Override
    public void eat(Food food) {
        switch (food.type) {
            case PLANT:
                System.out.println("Wolf looks disgusted. Refuses " + food.name);
                break;
            case MIXED:
                System.out.println("Wolf looks annoyed. Wolf picks through the food ");
                break;
            default:
                System.out.println("Wolf tears into the " + food.name);
        }
    }
}
