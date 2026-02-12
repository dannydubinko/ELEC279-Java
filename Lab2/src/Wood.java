public enum Wood {
    MAHOGANY, MAPLE, CANADIAN_MAPLE, BRAZILIAN_ROSEWOOD, ALDER, SITKA, CEDAR;

    @Override
    public String toString() {
        switch (this) {
            case MAHOGANY:
                return "Mahogany";
            case MAPLE:
                return "Maple";
            case CANADIAN_MAPLE:
                return "Canadian Maple";
            case BRAZILIAN_ROSEWOOD:
                return "Brazilian Rosewood";
            case ALDER:
                return "Alder";
            case SITKA:
                return "Sitka";
            case CEDAR:
                return "Cedar";
            default:
                return "Unspecified";
        }
    }
}
