class first{
    void second(int age){
        System.out.println(age);
    }
    void second(String name){
        System.out.println(name);
    }
}
public class compiletp {
    public static void main(String[] args) {
        first obj=new first();
        obj.second("gayatri");

    }
}
