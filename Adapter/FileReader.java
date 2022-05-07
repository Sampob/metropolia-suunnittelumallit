package Adapter;

import java.util.ArrayList;
import java.util.Collections;

public class FileReader {
    ArrayList<IFile> files = new ArrayList<IFile>();

    void addFile(IFile file) {
        files.add(file);
        Collections.sort(files);
    }

    public void printFiles() {
        files.forEach((f) -> System.out.println(f));
    }
}
