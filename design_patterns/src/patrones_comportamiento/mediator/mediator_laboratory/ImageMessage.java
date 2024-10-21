package patrones_comportamiento.mediator.mediator_laboratory;

public class ImageMessage implements Message {
    private String imageUrl;

    public ImageMessage(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String getContent() {
        return imageUrl;
    }
}
