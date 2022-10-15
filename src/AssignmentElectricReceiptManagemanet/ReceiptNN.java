package AssignmentElectricReceiptManagemanet;

import java.time.LocalDate;

public class ReceiptNN extends Receipt {

    private String cusNa;

    public String getCusNa() {
        return cusNa;
    }

    public void setCusNa(String cusNa) {
        this.cusNa = cusNa;
    }

    public ReceiptNN(String cusid, String name, LocalDate date, Integer amount) {
        super(cusid, name, date, amount);
    }

    @Override
    public double pricing(){
        double price = getAmount()*2000;
        return price;
    }
}
