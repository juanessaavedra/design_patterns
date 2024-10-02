package patrones_creacionales.builder_pattern.builderExample;

public class ComputerDirector {
    private ComputerBuilder builder;

    public ComputerDirector(ComputerBuilder builder) {
        this.builder = builder;
    }

    public Computer buildGamingComputer() {
        return builder.setProcessor("Intel i9")
                .setRam(32)
                .setStorage("1TB SSD")
                .setGraphicsCard("Nvidia RTX 3090")
                .build();
    }

    public Computer buildOfficeComputer() {
        return builder.setProcessor("Intel i5")
                .setRam(16)
                .setStorage("512GB SSD")
                .setGraphicsCard("Integrated")
                .build();
    }
}
