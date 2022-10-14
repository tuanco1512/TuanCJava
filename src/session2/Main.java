package session2;



public class Main {
    public static void main(String[] args){

        FptStudent ft = new FptStudent();
        ft.run();
        ft.run(10);
        ft.run(10,"Hello");

        FptStudent ft1 = new FptStudent("Xin chao cac ban");

        FptStudent ft2 = new FptStudent("Th123456","Trương Công Tuấn","0123456789");

    }

}
