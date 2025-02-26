package Builder;

public class ComputerBuilder {
    private String CPU;
    private String RAM;
    private String hardDrive;
    private String graphicsCard;
    private String soundCard;

    public ComputerBuilder setCPU(String CPU) {
        this.CPU = CPU;
        return this;
    }

    public ComputerBuilder setRAM(String RAM) {
        this.RAM = RAM;
        return this;
    }

    public ComputerBuilder setHardDrive(String hardDrive) {
        this.hardDrive = hardDrive;
        return this;
    }

    public ComputerBuilder setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
        return this;
    }

    public ComputerBuilder setSoundCard(String soundCard) {
        this.soundCard = soundCard;
        return this;
    }

    public Computer build() {
        Computer computer = new Computer();
        computer.setCPU(this.CPU);
        computer.setRAM(this.RAM);
        computer.setHardDrive(this.hardDrive);
        computer.setGraphicsCard(this.graphicsCard);
        computer.setSoundCard(this.soundCard);
        return computer;
    }
}