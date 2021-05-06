import java.util.TreeSet;

@javax.jdo.annotations.PersistenceCapable
public class PC extends Hardware{
    Memory memory;
    CPU cpu;
    OperatingSystem operatingSystem;
    TreeSet<Memory> memoryTreeSet = new TreeSet<>();


    public PC(String IDCode, String name, String releaseDate, Memory memory, CPU cpu, OperatingSystem operatingSystem) {
        this.memory = memory;
        this.cpu = cpu;
        this.operatingSystem = operatingSystem;
        this.name = name;
        this.IDCode = IDCode;
        this.releaseDate = releaseDate;
    }
}
