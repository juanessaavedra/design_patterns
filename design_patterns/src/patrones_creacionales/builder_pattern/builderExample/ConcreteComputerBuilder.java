package patrones_creacionales.builder_pattern.builderExample;

public class ConcreteComputerBuilder implements ComputerBuilder {
    private String processor;
    private int ram;
    private String storage;
    private String graphicsCard;

    @Override
    public ComputerBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    @Override
    public ComputerBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    @Override
    public ComputerBuilder setStorage(String storage) {
        this.storage = storage;
        return this;
    }

    @Override
    public ComputerBuilder setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
        return this;
    }

    @Override
    public Computer build() {
        return new Computer(processor, ram, storage, graphicsCard);
    }
}
