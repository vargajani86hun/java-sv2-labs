package compositionlist.computer;

import java.util.ArrayList;
import java.util.List;

public class PersonalComputer {
    private List<Hardware> hardwares = new ArrayList<>();
    private List<Software> softwares = new ArrayList<>();
    private Cpu cpu;

    public PersonalComputer(Cpu cpu) {
        this.cpu = cpu;
    }

    public void addHardware(Hardware hardware) {
        hardwares.add(hardware);
    }

    public void addSoftware(Software software) {
        softwares.add(software);
    }

    @Override
    public String toString() {
        return "That personal computer has this hardwares:" + hardwares +
                ",\nthis softwares:" + softwares +
                ",\nand this cpu: " + cpu + ".\n";
    }

    public List<Hardware> getHardwares() {
        return hardwares;
    }

    public List<Software> getSoftwares() {
        return softwares;
    }

    public Cpu getCpu() {
        return cpu;
    }
}
