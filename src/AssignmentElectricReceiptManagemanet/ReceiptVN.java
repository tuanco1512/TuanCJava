package AssignmentElectricReceiptManagemanet;

import java.time.LocalDate;

public class ReceiptVN extends Receipt {

    private String custype;

    public ReceiptVN(String cusid, String name, LocalDate date, Integer amount) {
        super(cusid, name, date, amount);
    }

    public String getCustype() {
        return custype;
    }

    public void setCustype(String custype) {
        this.custype = custype;
    }

    @Override
    public double pricing(){
        double price;
        if(getAmount()<=50){
            price = getAmount()*1000;
        }
        else if(50<getAmount()&&getAmount()<=100){
            price = 50*1000 + (getAmount()-50)*1200;
        }
        else if(100<getAmount()&&getAmount()<=200){
            price = 50*1000 + 50*1200 + (getAmount()-100)*1500;
        }
        else {
            price = 50*1000 + 50*1200 + 100*1500 + (getAmount()-200)*2000;
        }
        return price;
    }
}
