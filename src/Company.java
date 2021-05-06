import java.util.HashSet;

@javax.jdo.annotations.PersistenceCapable
public class Company {
    String name;
    HashSet<Product> makes = new HashSet<>();

    public Company(String name) {
        this.name = name;
    }
}
