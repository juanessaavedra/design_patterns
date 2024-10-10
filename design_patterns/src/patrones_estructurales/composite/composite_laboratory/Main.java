package patrones_estructurales.composite.composite_laboratory;

public class Main {
    public static void main(String[] args) {

        Folder folder1 = new Folder("Root");
        File file1 = new File("Document.txt", 100);
        folder1.addFile(file1);
        folder1.showDetails();

        Folder folder2 = new Folder(("Images"));
        File file2 = new File("Image1.png", 50);
        File file3 = new File("Image2.png", 70);
        folder2.addFile(file2);
        folder2.addFile(file3);
        folder2.showDetails();

    }
}
