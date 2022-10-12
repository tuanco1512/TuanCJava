package Assignment2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fraction ps1 = new Fraction();
        Fraction ps2 = new Fraction();
        Fraction psT = new Fraction();
        Fraction psH = new Fraction();
        Fraction psM = new Fraction();
        Fraction psD = new Fraction();

        // Nhập phân số
        System.out.println("Nhập vào phân số thứ 1: ");
        ps1.NhậpPS(sc);
        System.out.println("Nhập vào phân số thứ 2: ");
        ps2.NhậpPS(sc);

        // Tính tổng 2 phân số
        psT = ps1.CộngPS(ps2);

        // Trừ 2 phân số
        psH = ps1.TrừPS(ps2);

        // Nhân 2 phân số
        psM = ps1.NhânPS(ps2);

        // Chia 2 phân số
        psD = ps1.ChiaPS(ps2);


        // Hiển thị phân số
        System.out.println("\nPhân số thứ 1 là: ");
        ps1.HiểnthịPS();
        System.out.println("\nPhân số thứ 2 là: ");
        ps2.HiểnthịPS();
        System.out.println("\nPhân số tổng là: ");
        psT.HiểnthịPS();
        System.out.println("\nPhân số hiệu là: ");
        psH.HiểnthịPS();
        System.out.println("\nPhân số nhân là: ");
        psM.HiểnthịPS();
        System.out.println("\nPhân số chia là: ");
        psD.HiểnthịPS();

        sc.close();
    }
}
