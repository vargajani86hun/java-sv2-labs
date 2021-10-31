package compositionlist.computer;

public class PersonalComputerMain {
    public static void main(String[] args) {
        Cpu cpu = new Cpu("Core i7 2600", 3.2);
        Hardware vga = new Hardware("nVidia", "1080Ti");
        Hardware hdd = new Hardware("WesternDigital", "CaviarBlue 1TB");
        Hardware ram = new Hardware("HyperX", "DDR3 8GB");
        Software os = new Software("Ubuntu", 23.1);
        Software browser = new Software("Firefox", 98.2);
        PersonalComputer pc = new PersonalComputer(cpu);
        System.out.println(pc);

        pc.addHardware(vga);
        pc.addHardware(hdd);
        pc.addHardware(ram);
        pc.addSoftware(os);
        pc.addSoftware(browser);
        System.out.println(pc);
    }
}
