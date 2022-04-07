package Proxy;

public class ProxyImage implements Image {

    private final String filename;
    private final String imagename;
    private RealImage image;

    public ProxyImage(String filename, String imagename) {
        this.filename = filename;
        this.imagename = imagename;
    }

    @Override
    public void displayImage() {
        if (image == null) {
            image = new RealImage(filename, imagename);
        }
        image.displayImage();
    }

    @Override
    public String showData() {
        if(image == null) {
            return "PROXY " + imagename;
        } else {
            return image.showData();
        }
    }

}