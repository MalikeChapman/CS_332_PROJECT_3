import java.util.Collection;

public abstract class Utility {
    public static <T> void printCollection(Collection<T> c)
    {
        for (T x: c){
            System.out.println(x);
        }
    }

    public static <T> T extract(Collection<T> c){
        T x = null;
        for (T e: c){
            x = e;
        }
        return x;
    }
}
