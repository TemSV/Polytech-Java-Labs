public class SimpleHedgehog extends Hedgehogs {
    public SimpleHedgehog(String name, String habitat) {
        super(name,habitat);
    }

    @Override
    public void voice() {
        System.out.println("I am a simple hedgehog");
    }
}
