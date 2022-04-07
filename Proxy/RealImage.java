package Proxy;

public class RealImage implements Image {

    private final String filename;
    private final String imagedata;

    public RealImage(String filename, String imagedata) {
        this.filename = filename;
        this.imagedata = imagedata;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.println("Loading   " + filename);
    }

    @Override
    public void displayImage() {
        System.out.println("Displaying   " + filename);
    }

    @Override
    public void showData() {
        System.out.println("Image name: " + imagedata);
    }

}
