public class GuitarSpec extends InstrumentSpec {
    private int numStrings;

    public GuitarSpec(Builder builder, String model,
            Type type, Wood backWood,
            Wood topWood, int numStrings) {

        super(builder, model, type, backWood, topWood);
        this.numStrings = numStrings;
    }

    public int getNumStrings() {
        return numStrings;
    }

    @Override
    public boolean matches(InstrumentSpec otherSpec) {

        if (!super.matches(otherSpec)) {
            return false;
        }

        if (!(otherSpec instanceof GuitarSpec)) {
            return false;
        }

        GuitarSpec spec = (GuitarSpec) otherSpec;

        if (spec.numStrings != this.numStrings) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return builder + " " + model + " " + type + " Top:" + topWood + " Back:" + backWood + " Strings:" + numStrings;
    }
}
