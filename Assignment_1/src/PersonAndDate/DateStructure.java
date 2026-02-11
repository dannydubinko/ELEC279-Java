package PersonAndDate;

public record DateStructure(String value) {
    public DateStructure {
        if (value == null || !value.matches("^(0[1-9]|1[0-2])/(0[1-9]|[12]\\d|3[01])/\\d{4}$")) {
            throw new IllegalArgumentException("Date must follow MM/DD/YY format (e.g., 12/31/2505)");
        }
    }
}
