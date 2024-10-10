package patrones_estructurales.composite.composite_laboratory;

public class File implements FileComponent {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void showDetails() {
        System.out.println("File name: " + name + " File size: " + size);
    }
}
