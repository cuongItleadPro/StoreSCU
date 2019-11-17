import org.dcm4che3.tool.storescu.StoreSCU;

public class StoreSCUTest {
    public static void main(String[] args) {
        String[] abc = new String[5];
        abc[0] = "--uid-suffix";
        abc[1] = "123456";
        abc[2] = "-c";
        abc[3] = "STORESCP@localhost:4440";
        abc[4] = "5a7301a1e4b0b4037cf4bfef.dcm";

        StoreSCU.main(abc);
    }

}
