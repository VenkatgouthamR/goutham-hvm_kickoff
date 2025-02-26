package Builder;

public class Client {
    public static void main(String[] args) {
        Computer gamingComputer = new ComputerBuilder()
            .setCPU("High Performance CPU")
            .setRAM("16 GB DDR4")
            .setGraphicsCard("High-end Graphics Card")
            .setSoundCard("7.1 Surround Sound Card")
            .build();

        Computer officeComputer = new ComputerBuilder()
            .setCPU("Standard CPU")
            .setRAM("8 GB DDR4")
            .build();

        System.out.println(gamingComputer);
        System.out.println(officeComputer);
    }
}
