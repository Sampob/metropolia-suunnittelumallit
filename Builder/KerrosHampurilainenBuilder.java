package Builder;

import java.util.ArrayList;

public class KerrosHampurilainenBuilder implements IBurgerBuilder {

    private KerrosHampurilainen burger;

    @Override
    public void createBurger() {
        burger = new KerrosHampurilainen();
    }

    @Override
    public Object getBurger() {
        return burger;
    }

    @Override
    public void buildSauce() {
        burger.addPart("Hese majoneesi");
    }

    @Override
    public void buildPatties() {
        ArrayList<String> s = new ArrayList<>();
        s.add("Pihvi");
        s.add("Pihvi mausteilla");
        burger.addParts(s);
    }

    @Override
    public void buildBuns() {
        burger.addPart("Hese sämpylä");
    }

    @Override
    public void buildIngredients() {
        burger.addPart("Salaatti");
        burger.addPart("Suolakurkku");
    }

}
