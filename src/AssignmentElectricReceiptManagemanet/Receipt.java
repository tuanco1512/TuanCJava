package AssignmentElectricReceiptManagemanet;

import java.time.LocalDate;
import java.util.Date;

public abstract class Receipt {
    protected String cusid;
    protected String name;
    protected LocalDate date;
    protected Integer amount;

    public String getCusid() {
        return cusid;
    }

    public Receipt(String cusid, String name, LocalDate date, Integer amount) {
        this.cusid = cusid;
        this.name = name;
        this.date = date;
        this.amount = amount;
    }

    public void setCusid(String cusid) {
        this.cusid = cusid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public abstract double pricing();
}
