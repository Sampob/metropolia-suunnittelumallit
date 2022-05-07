package Adapter;

import java.io.File;

import Adapter.Interface.NameReader;

public class FileNameReader implements NameReader {

    @Override
    public String checkFile(String file) {
        File f = new File(System.getProperty("user.dir") + "\\Adapter\\" + file);
        if (f.exists()) {
            return f.getName();
        } else {
            System.out.println("No file in directory");
        }
        return null;
    }

}
