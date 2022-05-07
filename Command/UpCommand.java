package Command;

public class UpCommand implements Command {

    private Valkokangas light;

    public UpCommand(Valkokangas l) {
        light = l;
    }

    @Override
    public void execute() {
        light.kangasYlos();
    }

}
