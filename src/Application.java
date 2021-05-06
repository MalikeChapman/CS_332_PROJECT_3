import java.util.HashSet;


@javax.jdo.annotations.PersistenceCapable
public class Application extends Software{

    Application application;
    HashSet<Application> plugInComponent = new HashSet<>();

    Application(String IDCode, String name, String releaseDate, String versionNum){
        this.IDCode = IDCode;
        this.name = name;
        this.versionNum = versionNum;
        this.releaseDate = releaseDate;
    }

    public Application getApplication() {
        return application;
    }

    public void setApplication(Application application) {
        this.application = application;
    }
}
