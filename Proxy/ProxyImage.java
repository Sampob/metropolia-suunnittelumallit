package Proxy;

public class ProxyImage implements Image {

    private final String filename;
    private final String imagedata;
    private RealImage image;

    public ProxyImage(String filename, String imagedata) {
        this.filename = filename;
        this.imagedata = imagedata;
    }

    @Override
    public void displayImage() {
        if (image == null) {
            image = new RealImage(filename, imagedata);
        }
        image.displayImage();
    }

    @Override
    public void showData() {
        if (image == null) {
            image = new RealImage(filename, imagedata);
        }
        image.showData();
    }

}