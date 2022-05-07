package Adapter;

public class NewFile extends IFile {
    String name;
    int order;

    public NewFile(String name, int order) {
        this.name = name;
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    @Override
    public int compareTo(IFile o) {
        if (this.name == o.getName() && this.order == o.getOrder()) {
            return 0;
        }
        return this.order - o.getOrder();
    }

    @Override
    public String toString() {
        return this.order + ". " + this.name;
    }
}
