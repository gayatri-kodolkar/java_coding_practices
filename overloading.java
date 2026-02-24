public class overloading {
    static class first{
        void add(int a, int b){
            System.out.println(a*b);
        }
    }
    static class second{
        void add(){
            System.out.println("helloworld");
        }
    }
    public static void main(String[] args){
        first obj1 = new first();
        obj1.add(10, 20);
        second obj2 = new second();
        obj2.add();
        
    }
}
