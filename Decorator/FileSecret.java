package Decorator;

import Decorator.Data.DataItem;

public class FileSecret extends FileDecorator {

    public FileSecret(FileInterface fi) {
        super(fi);
    }

    @Override
    public void save(DataItem data) {
        super.save(secret(data));
    }

    @Override
    public String load() {
        return unSecret(super.load());
    }

    private DataItem secret(DataItem data) {
        String secretData = data.getData().replace("a", "q").replace("d", "a").replace("t", "d");
        data.setData(secretData);
        return data;
    }

    private String unSecret(String data) {
        return data.replace("d", "t").replace("a", "d").replace("q", "a");
    }
}
