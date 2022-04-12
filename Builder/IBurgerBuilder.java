package Builder;

public interface IBurgerBuilder {

    public abstract void createBurger();

    public abstract void buildSauce();

    public abstract void buildPatties();

    public abstract void buildBuns();

    public abstract void buildIngredients();

    public abstract Object getBurger();
}