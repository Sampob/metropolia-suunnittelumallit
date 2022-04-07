package Proxy;

public class RealImage implements Image {

    private final String filename;
    private final String imagename;

    public RealImage(String filename, String imagename) {
        this.filename = filename;
        this.imagename = imagename;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.println("Loading     " + filename);
    }

    @Override
    public void displayImage() {
        System.out.println("Displaying  " + filename);
    }

    @Override
    public String showData() {
        return imagename;
    }

}
