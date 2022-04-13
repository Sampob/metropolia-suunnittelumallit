package Adapter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import Adapter.Interface.Loader;

public class FileAdapter extends FileNameReader implements Loader {

    @Override
    public Collection<String> readFile(String file) {
        List<String> list = new ArrayList<>();
        File f = new File(System.getProperty("user.dir") + "\\Adapter\\" + file);
        try (Scanner s = new Scanner(f)) {
            list.add(super.checkFile(file));
            while (s.hasNextLine()) {
                list.add(s.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }

}
