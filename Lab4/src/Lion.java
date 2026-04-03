public class Lion extends Feline{
    public Lion(){   
    }
    
    @Override
    public void eat(Food food){
        switch (food.type) {
            case MEAT:
                System.out.println("Roar! Lion devours the " + food.name);
                break;
            case MIXED:
                System.out.println("Growl... Lion picks through the " + food.name);
                break;
            default:
                System.out.println("Roar! Lion refuses the " + food.name);

        }
    }
}
