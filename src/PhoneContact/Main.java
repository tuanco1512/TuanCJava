package PhoneContact;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();
        pb.insertPhone("ABC","0123456789");
        pb.insertPhone("XYZ","0987654321");
        pb.insertPhone("XYZ","0987654312");
        pb.insertPhone("XY","0123546879");
        pb.removePhone("XYZ");
        pb.updatePhone("ABC","0123475689","0234561789");
        for (String pl: pb.PhoneList){
            System.out.println(pl);
        }
    }
}
