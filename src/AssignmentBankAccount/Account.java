package AssignmentBankAccount;

public class Account {
    String id;
    String name;
    int balance;

    public Account(){}

    public Account(String id,String name,int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int Credit(int amount){
        if(amount > 0){
            this.balance += amount;
        }else {
            System.out.println("Tiền nạp vào tài khoản phải > 0");
        }
        return this.balance;
    }

    public int Debit(int amount){
        if(0 < amount && amount < balance ){
            this.balance -= amount;
        }else{
            System.out.println("Tài khoản của quý khách không đủ tiền để thanh toán");
        }
        return this.balance;
    }

    public int Transfer(Account A2,int amount){
        if(0 < amount && amount < balance){
            this.balance -= amount;
            A2.balance += amount;
            System.out.println("Tài khoản " + this.id + " Chuyển số tiền " + amount + " Cho tài khoản " + A2.id);
        }else {
            System.out.println("Chuyển tiền không thành công");
        }
        return A2.balance;
    }
}
