package Decorator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import Decorator.Data.DataItem;

public class FileNormal implements FileInterface {

    @Override
    public void save(DataItem data) {
        try {
            FileWriter fileW = new FileWriter("Decorator/filename.txt");
            fileW.write(data.getData());
            fileW.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String load() {
        try {
            File file = new File("Decorator/filename.txt");
            Scanner reader = new Scanner(file);
            ArrayList<String> s = new ArrayList<String>();
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                s.add(data);
            }
            reader.close();
            System.out.println("###READING DONE###");
            return String.join("", s);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
