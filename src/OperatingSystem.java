import java.util.HashSet;

@javax.jdo.annotations.PersistenceCapable
public class OperatingSystem extends Software{
    HashSet<Application> supports = new HashSet<>();

    public OperatingSystem(String name, String IDCode, String releaseDate, String versionNum) {
        this.name = name;
        this.IDCode = IDCode;
        this.releaseDate = releaseDate;
        this.versionNum = versionNum;
    }
}
