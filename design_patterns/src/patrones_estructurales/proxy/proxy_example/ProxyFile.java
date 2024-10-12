package patrones_estructurales.proxy.proxy_example;

public class ProxyFile implements FileInterface {
    private RealFile realFile;
    private String fileName;

    public ProxyFile(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void download() {
        //Controlar el acceso
        if (realFile == null) {
            realFile = new RealFile(fileName);
        }
        realFile.download();
    }
}
