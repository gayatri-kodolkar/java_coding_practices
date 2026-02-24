class first{
    void say(){
        System.out.println("hello");
    }
}
class second{
    void talk(){
        System.out.println("hii");
    }
}
class last extends first{
    void argue(){
        System.out.println("thats too much");
    }
}
public class multipleInheritace {
    public static void main(String[] args) {
        last obj = new last();
        obj.argue();
        obj.say();
    }
}
