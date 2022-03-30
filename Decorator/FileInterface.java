package Decorator;

import Decorator.Data.DataItem;

public interface FileInterface {
    public void save(DataItem data);

    public String load();
}
