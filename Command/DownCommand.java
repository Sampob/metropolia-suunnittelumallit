package Command;

public class DownCommand implements Command {

    private Valkokangas kangas;

    public DownCommand(Valkokangas k) {
        kangas = k;
    }

    @Override
    public void execute() {
        kangas.kangasAlas();
    }

}
