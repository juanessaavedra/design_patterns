package patrones_estructurales.proxy.proxy_laboratory;

public class RealImage implements Image {
    private String name;

    public RealImage(String name){
        this.name = name;
        loadImage();
    }

    private void loadImage(){
        System.out.println("Loading image " + name);
    }

    @Override
    public void display() {
        System.out.println("Displaying image " + name);
    }
}
