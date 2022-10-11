package Class;

public class Main {
    public static void main(String[] args){
        Student s;
        s = new Student();
        s.name = "Nam";
        s.age = 18;

        Student s2 = new Student();
        s2.age = 21;

        s.showInfo();
        s2.showInfo();
    }
}
