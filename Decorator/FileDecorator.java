package Decorator;

import Decorator.Data.DataItem;

public abstract class FileDecorator implements FileInterface {
    protected FileInterface decorated;

    public FileDecorator(FileInterface fi) {
        decorated = fi;
    }

    public void save(DataItem data) {
        decorated.save(data);
    }

    public String load() {
        return decorated.load();
    }
}
