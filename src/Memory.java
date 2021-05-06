import java.util.TreeSet;

@javax.jdo.annotations.PersistenceCapable
public class Memory extends Component implements Comparable<Memory>{
int capacity;
int clockSpeed;
TreeSet<Memory> plugInCompatible = new TreeSet<>();

    Memory(String IDCode, String name, String releaseDate, int capacity, int clockSpeed){
        this.IDCode = IDCode;
        this.name = name;
        this.releaseDate = releaseDate;
        this.capacity = capacity;
        this.clockSpeed = clockSpeed;
    }

    @Override
    public int compareTo(Memory that) {
        if (this.capacity > that.capacity)
        {
            return 1;
        } else if (this.capacity < that.capacity)
        {
            return -1;
        } else if (this.clockSpeed > that.clockSpeed)
        {
            return 1;
        } else if (this.clockSpeed < that.clockSpeed)
        {
            return -1;
        } else
        {
            return 0;
        }
    }
}
