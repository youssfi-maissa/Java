package zoo;

public class Penguin extends Aquatic {
    protected float swimmingDepth;

    public Penguin() {}

    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return super.toString() + ", Profondeur=" + swimmingDepth;
    }
}
