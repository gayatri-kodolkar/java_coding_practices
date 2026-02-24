class addition{
    void ans(int a, int b){
        System.out.println(a+b);
    }
}
class mul extends addition{
    @Override
    void ans(int a, int b){
        System.out.println(a*b);
    }
}
class div extends mul{
    @Override
    void ans(int a, int b){
        System.out.println(a/b);
    }
}
public class overridingex {
    //same name same parameter
    // make 3 class addition, multiplication, division
    public static void main(String[] args) {
    div obj = new div();
    obj.ans(10, 2);
        
    }
}
