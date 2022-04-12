package Builder;

public class Waiter {
    private IBurgerBuilder builder;

    public void setBuilder(IBurgerBuilder b) {
        builder = b;
    }

    public void createBurger() {
        builder.createBurger();
        builder.buildBuns();
        builder.buildSauce();
        builder.buildPatties();
        builder.buildIngredients();
        builder.buildBuns();
    }
}
