package Command;

public class Main {
    public static void main(String[] args) {
        Valkokangas kangas = new Valkokangas();

        Command alas = new DownCommand(kangas);
        Command ylos = new UpCommand(kangas);

        WallButton arrowDown = new WallButton(alas);
        WallButton arrowUp = new WallButton(ylos);

        arrowDown.push();
        arrowUp.push();
    }
}
