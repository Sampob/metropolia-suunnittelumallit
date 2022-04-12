package Builder;

public class BigMacBuilder implements IBurgerBuilder {

    private BigMac burger;

    @Override
    public void createBurger() {
        burger = new BigMac();
    }

    @Override
    public Object getBurger() {
        return burger;
    }

    @Override
    public void buildSauce() {
        burger.addPart("Secret sauce");
    }

    @Override
    public void buildPatties() {
        burger.addPart("Pihvi");
        burger.addPart("McBun");
        burger.addPart("Pihvi");
    }

    @Override
    public void buildBuns() {
        burger.addPart("McBun");
    }

    @Override
    public void buildIngredients() {
        burger.addPart("Salaatti");
        burger.addPart("Sipuli");
    }

}
