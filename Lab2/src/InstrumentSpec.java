public abstract class InstrumentSpec {
    Builder builder;
    String model;
    Type type;
    Wood backWood;
    Wood topWood;

    public InstrumentSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
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

    public boolean matches(InstrumentSpec otherSpec) {
        if (otherSpec.builder != null && otherSpec.builder != this.builder)
            return false;
        if (otherSpec.type != null && otherSpec.type != this.type)
            return false;

        if (otherSpec.topWood != null && otherSpec.topWood != this.topWood)
            return false;
        if (otherSpec.backWood != null && otherSpec.backWood != this.backWood)
            return false;

        if (otherSpec.model != null) {
            if (this.model == null)
                return false;
            if (!this.model.equalsIgnoreCase(otherSpec.model))
                return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return builder + " " + model + " " + type + " Top:" + topWood + " Back:" + backWood;
    }
}
