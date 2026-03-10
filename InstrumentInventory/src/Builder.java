public enum Builder {
    FENDER, MARTIN, GIBSON, OLSON, PRS, ANY;

    @Override
    public String toString() {
        switch (this) {
            case FENDER:
                return "Fender";
            case MARTIN:
                return "Martin";
            case GIBSON:
                return "Gibson";
            case OLSON:
                return "Olson";
            case PRS:
                return "PRS";
            default:
                return "Unspecified";
        }
    }
}
