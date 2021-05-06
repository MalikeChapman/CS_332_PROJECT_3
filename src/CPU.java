@javax.jdo.annotations.PersistenceCapable
public class CPU extends Component{
    int numOfCores;
    float clockSpeed;


    CPU(String IDCode, String name, String releaseDate, int numOfCores, float clockSpeed){
        this.IDCode = IDCode;
        this.name = name;
        this.releaseDate = releaseDate;
        this.numOfCores = numOfCores;
        this.clockSpeed = clockSpeed;
    }

}
