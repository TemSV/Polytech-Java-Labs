public abstract class Chordates {
    String name;
    String habitat;
    public Chordates(String name, String habitat) {
        this.name = name;
        this.habitat = habitat;
    }

    public abstract void voice();

    @Override
    public String toString() {
        return (getClass().getName() + " " + name + " from " + habitat);
    }
}
