public class GuitarSpec {
    private Builder builder;
    private String model;
    private Type type;
    private Wood backWood;
    private Wood topWood;

    public GuitarSpec(Builder builder, String model, Type type, Wood topWood, Wood backWood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.topWood = topWood;
        this.backWood = backWood;
    }

    public Builder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public boolean matches(GuitarSpec other) {
        if (other.builder != null && other.builder != this.builder)
            return false;
        if (other.type != null && other.type != this.type)
            return false;

        if (other.topWood != null && other.topWood != this.topWood)
            return false;
        if (other.backWood != null && other.backWood != this.backWood)
            return false;

        if (other.model != null) {
            if (this.model == null)
                return false;
            if (!this.model.equalsIgnoreCase(other.model))
                return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return builder + " " + model + " " + type + " Top:" + topWood + " Back:" + backWood;
    }
}
