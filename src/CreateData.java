import com.objectdb.Utilities;
import javax.jdo.*;


public abstract class CreateData {
    public static void main(String argv[]){
        Company c1 = new Company("Apple");
        Company c2 = new Company("Microsoft");
        Company c3 = new Company("Google");
        Company c4 = new Company("Dell");


        OperatingSystem o1 = new OperatingSystem("Windows", "001", "07/29/2015", "10");
        OperatingSystem o2 = new OperatingSystem("MacOS", "002", "09/24/2018", "10.14" );

        CPU cpu1 = new CPU("100", "i5", "02/01/2020", 6, (float) 4.3);
        CPU cpu2 = new CPU("101", "i7","02/01/2020",8,(float) 4.8);
        CPU cpu3 = new CPU("102", "Ryzen Threadripper 3970X","11/25/2019", 32, (float) 3.7);
        CPU cpu4 = new CPU("103", "M1", "03/29/2018", 8, (float) 3.2);

        Memory m1 = new Memory("200", "DDR4","04/01/2014",8,2933);
        Memory m2 = new Memory("201", "DDR4", "04/01/2014", 12, 2666);
        Memory m3 = new Memory("202", "DDR4 SDRAM", "04/01/2014" ,128, 3000);
        Memory m4 = new Memory("203", "LPDDR3", "12/29/2015", 8, 2133);

        PC pc1 = new PC("300", "Inspiron 3000", "03/20/2020", m2, cpu2, o1);
        PC pc2 = new PC("301", "Inspiron 3000", "02/01/2020", m1, cpu1, o1);
        PC pc3 = new PC("302","CLX", "01/01/2021", m3, cpu3, o1);
        PC pc4 = new PC("303", "MacBook Pro", "08/17/2020",m4,cpu4,o2);


        PersistenceManager pm = Utilities.getPersistenceManager("PC.odb");

        pm.currentTransaction().begin();
        pm.makePersistent(c1);
        pm.makePersistent(c2);
        pm.makePersistent(c3);
        pm.makePersistent(c4);

        pm.makePersistent(o1);
        pm.makePersistent(o2);


        pm.makePersistent(cpu1);
        pm.makePersistent(cpu2);
        pm.makePersistent(cpu3);
        pm.makePersistent(cpu4);


        pm.makePersistent(m1);
        pm.makePersistent(m2);
        pm.makePersistent(m3);
        pm.makePersistent(m4);


        pm.makePersistent(pc1);
        pm.makePersistent(pc2);
        pm.makePersistent(pc3);
        pm.makePersistent(pc4);

        pm.currentTransaction().commit();


        Application application1 = new Application("400", "Microsoft Word", "01/01/2019", "2019");
        Application application2 = new Application("401", "Microsoft Office", "01/01/2019", "2019");

        pm.currentTransaction().begin();
        pm.makePersistent(application1);
        pm.makePersistent(application2);

        c2.makes.add(application1);
        c2.makes.add(application2);

        o1.supports.add(application1);
        o1.supports.add(application2);
        pm.currentTransaction().commit();


        pm.currentTransaction().begin();
        pc3.memoryTreeSet.add(m1);
        pc3.memoryTreeSet.add(m2);
        pc3.memoryTreeSet.add(m3);
        pm.currentTransaction().commit();
    }
}
