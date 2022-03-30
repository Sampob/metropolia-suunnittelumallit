package Decorator.Data;

public class SomeData implements DataItem {

    private String data;

    public SomeData(String s) {
        data = s;
    }

    @Override
    public String getData() {
        return data;
    }

    @Override
    public void setData(String s) {
        data = s;
    }

}
