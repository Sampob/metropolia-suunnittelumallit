package Adapter;

public class Main {
    public static void main(String[] args) {
        FileReader reader = new FileReader();

        OldFile of = new OldFile("Old file", "1");
        NewFile nf = new NewFile("New file", 2);

        FileAdapter fa = new FileAdapter(of);

        reader.addFile(nf);
        reader.addFile(fa);

        reader.printFiles();
    }
}
