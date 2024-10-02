package patrones_creacionales.builder_pattern.builderExample;

public class Computer {
    private final String processor;
    private final int ram;
    private final String storage;
    private final String graphicsCard;

    public Computer(String processor, int ram, String storage, String graphicsCard) {
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.graphicsCard = graphicsCard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ram=" + ram +
                ", storage='" + storage + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                '}';
    }
}
