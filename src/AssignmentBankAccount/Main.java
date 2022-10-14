package AssignmentBankAccount;

public class Main {
    public static void main(String[] args){
        Account A1 = new Account("A001","Nguyen Van A", 100000);
        Account A2 = new Account("A002","Nguyen Van B", 50000);
        A1.Credit(100000);
        System.out.println("Số dư tài khoản hiện có là: " +A1.balance);
        A1.Debit(50000);
        System.out.println("Số dư tài khoản sau khi thanh toán hiện có là: " +A1.balance);
        A1.Transfer(A2, 40000);
    }
}
