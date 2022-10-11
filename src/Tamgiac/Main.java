package Tamgiac;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        canhtamgiac t = new canhtamgiac();
        System.out.println("Nhap canh 1:");
        t.setCanh1(sc.nextInt());
        System.out.println("Nhap canh 2:");
        t.setCanh2(sc.nextInt());
        System.out.println("Nhap canh 3:");
        t.setCanh3(sc.nextInt());
        System.out.println("Chu vi:" +t.tinhchuvi());
        System.out.println("Dien tich:" +t.tinhdientich());
    }
}
