package patrones_creacionales.builder_pattern.builderExample;

public interface ComputerBuilder {
    ComputerBuilder setProcessor(String processor);
    ComputerBuilder setRam(int ram);
    ComputerBuilder setStorage(String storage);
    ComputerBuilder setGraphicsCard(String graphicsCard);
    Computer build();
}
