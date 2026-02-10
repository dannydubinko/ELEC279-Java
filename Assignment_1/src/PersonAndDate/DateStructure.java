package PersonAndDate;

public record DateStructure(String value) {
    public DateStructure {
        if (value == null || !value.matches("^(0[1-9]|[12]\\d|3[01])/(0[1-9]|1[0-2])/\\d{4}$")) {
            throw new IllegalArgumentException("Date must follow DD/MM/YY format (e.g., 31/12/25)");
        }
    }
}
