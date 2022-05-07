package Adapter;

public abstract class IFile implements Comparable<IFile> {
    abstract String getName();

    abstract int getOrder();
}
