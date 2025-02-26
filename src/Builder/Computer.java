package Builder;

public class Computer {
    private String CPU;
    private String RAM;
    private String hardDrive;
    private String graphicsCard;
    private String soundCard;

    // Getters and setters
    public void setCPU(String CPU) { this.CPU = CPU; }
    public void setRAM(String RAM) { this.RAM = RAM; }
    public void setHardDrive(String hardDrive) { this.hardDrive = hardDrive; }
    public void setGraphicsCard(String graphicsCard) { this.graphicsCard = graphicsCard; }
    public void setSoundCard(String soundCard) { this.soundCard = soundCard; }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", hardDrive=" + hardDrive + ", graphicsCard=" + graphicsCard + ", soundCard=" + soundCard + "]";
    }
}
