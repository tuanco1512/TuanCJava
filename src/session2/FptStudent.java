package session2;

public class FptStudent {
    String code;
    String name;
    String tel;

    public FptStudent(){
        System.out.println("FPT Student...");
    }
    public FptStudent(String msg){
        System.out.println("FPT Student" + msg);
    }


    public FptStudent(String code, String name, String tel) {
        this.code = code;
        this.name = name;
        this.tel = tel;
        System.out.println("Hello" + code + name + tel);
    }

    public void run(){
        System.out.println("Run 5km/h");
    }

    public void run(int x){
        System.out.println("Run 10km/h");
    }

    public void run(String x){
        System.out.println("Run 15km/h");
    }

    public void run(int x,String y){
        System.out.println("Run 20km/h");
    }

    public void run(String x, int y){
        System.out.println("Run 20km/h");
    }
}
