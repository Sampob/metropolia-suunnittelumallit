package Adapter;

public class FileAdapter extends IFile {

    OldFile oldFile;

    public FileAdapter(OldFile of) {
        oldFile = of;
    }

    String getName() {
        return oldFile.getName();
    }

    int getOrder() {
        try {
            return Integer.parseInt(oldFile.getOrder());
        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    public int compareTo(IFile o) {
        if (getName() == o.getName() && getOrder() == o.getOrder()) {
            return 0;
        }
        return getOrder() - o.getOrder();
    }

    @Override
    public String toString() {
        return oldFile.toString();
    }

}
