package Assignment2;

import java.util.Scanner;

public class Fraction {
    //Thuộc tính
    int Tửsố;
    int Mẫusố;
    // Phương thức
    // Hàm khởi tạo không có đối số
    public Fraction(){
        Tửsố = 0;
        Mẫusố = 1;
    }
    // Hàm khởi tạo có đối số
    public Fraction(int Tuso, int Mauso){
        this.Tửsố=Tuso;
        this.Mẫusố=Mauso;
    }

    // Hàm nhập phân số
    public void NhậpPS(Scanner cs){
        int a;
        int b;
        do {
            System.out.println("\tNhập vào tử số: ");
            a = cs.nextInt();

            System.out.println("\tNhập vào mẫu số: ");
            b = cs.nextInt();
            //Kiểm tra
            if(b == 0){
                System.out.println("Mẫu số không được = 0. Hãy nhập lại!");
            } else{
                Tửsố = a;
                Mẫusố = b;
            }
        }
        while (b == 0);
    }

    // Hàm hiển thị
    public void HiểnthịPS(){
        if(Tửsố*Mẫusố < 0){
            System.out.println("\t-"+Math.abs(Tửsố)+"/"+Math.abs(Mẫusố));
        } else {
            System.out.println("\t"+Math.abs(Tửsố)+"/"+Math.abs(Mẫusố));
        }
    }

    // Hàm cộng
    public Fraction CộngPS(Fraction PS2){
        int a = Tửsố*PS2.Mẫusố + PS2.Tửsố*Mẫusố;
        int b = Mẫusố*PS2.Mẫusố;

        return new Fraction(a, b);
    }

    // Hàm trừ
    public Fraction TrừPS(Fraction PS2){
        int a = Tửsố*PS2.Mẫusố - PS2.Tửsố*Mẫusố;
        int b = Mẫusố*PS2.Mẫusố;

        return new Fraction(a, b);
    }

    // Hàm nhân
    public Fraction NhânPS(Fraction PS2){
        int a = Tửsố*PS2.Tửsố;
        int b = Mẫusố*PS2.Mẫusố;

        return new Fraction(a, b);
    }

    // Hàm chia
    public Fraction ChiaPS(Fraction PS2){
        int a = Tửsố*PS2.Mẫusố;
        int b = Mẫusố*PS2.Tửsố;

        return new Fraction(a, b);
    }

    // Hàm tìm USCLN
    private int tìmUSCLN(int a, int b){
        int r = a%b;
        while (r!=0){
            a = b;
            b = r;
            r = a%b;
        }

        return b;
    }

    // Hàm kiểm tra phân số tối giản hay chưa
    public Boolean Kiểmtratốigiản(){
        if(tìmUSCLN(Tửsố, Mẫusố)==1) {
            return true;
        }
        return false;
    }

    //Hàm tối giản
    public void TốigiảnPS(){
        int x = tìmUSCLN(Tửsố, Mẫusố);

        Tửsố /= x;
        Mẫusố /= x;
    }
}
