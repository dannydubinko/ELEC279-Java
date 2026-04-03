public enum FoodType {
    MEAT,
    PLANT,
    MIXED;

    @Override
    public String toString() {
        switch (this) {
            case MEAT:
                return "Meat";
            case PLANT:
                return "Plant";
            case MIXED:
                return "Mixed";
            default:
                return "Unspecified";
        }
    }
}
