public class MandolinSpec extends InstrumentSpec {
    private Style style;

    public MandolinSpec(Builder builder, String model,
            Type type, Wood backWood,
            Wood topWood, Style style) {

        super(builder, model, type, backWood, topWood);
        this.style = style;
    }

    public Style getStyle() {
        return style;
    }

    @Override
    public boolean matches(InstrumentSpec otherSpec) {

        if (!super.matches(otherSpec)) {
            return false;
        }

        if (!(otherSpec instanceof MandolinSpec)) {
            return false;
        }

        MandolinSpec spec = (MandolinSpec) otherSpec;

        if (spec.style != this.style) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return builder + " " + model + " " + type + " Top:" + topWood + " Back:" + backWood + " Style:" + style;
    }
}
