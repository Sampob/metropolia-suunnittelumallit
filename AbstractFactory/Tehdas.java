package AbstractFactory;

public class Tehdas implements AbstractFactory {
    @Override
    public AdidasFactory makeAdidas() {
        return new AdidasFactory();
    }

    @Override
    public BossFactory makeBoss() {
        return new BossFactory();
    }

}
