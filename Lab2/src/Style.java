public enum Style {
    A, B;

    @Override
    public String toString() {
        switch (this) {
            case A:
                return "Type A";
            case B:
                return "Type B";
            default:
                return "Unspecified";
        }
    }
}

