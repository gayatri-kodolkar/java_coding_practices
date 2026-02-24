public class singleInheritance {
    static class A{
        void first(){
            System.out.print("hello");
        }
    }
    static class B extends A{
        void second(){
            System.out.print(" world");
        }
    }

    public static void main(String[] args) {
        B obj = new B();
        obj.first();
        obj.second();
    }
}
