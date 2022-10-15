package AssignmentElectricReceiptManagemanet;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ReceiptVN> cusVN = new ArrayList<>();
        cusVN.add(new ReceiptVN("VN001","Nguyen Van A", LocalDate.parse("2000-12-15"),102));
        cusVN.add(new ReceiptVN("VN002","Nguyen Van B", LocalDate.parse("2000-10-15"),67));

        ArrayList<ReceiptNN> cusNN = new ArrayList<>();
        cusNN.add(new ReceiptNN("NN001","John", LocalDate.parse("2000-12-15"),50));
        cusNN.add(new ReceiptNN("NN002","Patrick", LocalDate.parse("2000-10-15"),105));

        for(ReceiptVN cVN: cusVN){
            System.out.println(cVN.pricing());
        }

        for(ReceiptNN cNN: cusNN){
            System.out.println(cNN.pricing());
        }
    }
}
