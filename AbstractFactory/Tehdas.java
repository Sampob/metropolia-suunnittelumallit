package AbstractFactory;

public class Tehdas implements AbstractFactory {

    private Tehdas() {

    }

    private static Tehdas INSTANCE = null;

    public static Tehdas getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Tehdas();
        }
        return INSTANCE;
    }

    @Override
    public AdidasFactory makeAdidas() {
        return new AdidasFactory();
    }

    @Override
    public BossFactory makeBoss() {
        return new BossFactory();
    }

}
