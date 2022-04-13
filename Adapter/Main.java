package Adapter;

public class Main {
    public static void main(String[] args) {
        FileNameReader r = new FileNameReader();
        FileLoader l = new FileLoader();

        System.out.println("File name: " + r.checkFile("filename.txt"));

        System.out.print("File content: ");
        for (String s : l.readFile("filename.txt")) {
            System.out.println(s);
        }
    }
}
