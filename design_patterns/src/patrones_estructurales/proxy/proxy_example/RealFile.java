package patrones_estructurales.proxy.proxy_example;

public class RealFile implements FileInterface {
    private String fileName;

    public RealFile(String fileName) {
        this.fileName = fileName;
        loadFile();
    }

    private void loadFile() {
        System.out.println("Loading file: " + fileName);
    }

    @Override
    public void download() {
        System.out.println("Downloading file: " + fileName);
    }
}
