package patrones_comportamiento.mediator.mediator_laboratory;

public class TextMessage implements Message {
    private String content;

    public TextMessage(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }
}
