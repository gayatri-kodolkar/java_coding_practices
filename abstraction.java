public class abstraction{
    public interface Innerabstraction {
        int add(int a, int b);
        int mul(int a, int b);
        int sub(int a, int b);
        int div(int a, int b);
    }
    static abstract class A{
        int add(int a, int b){
            System.out.println(a+b);
            return a+b;
        }
    }
    static abstract class B extends A{
        int mul(int a, int b){
            System.out.println(a*b);
            return a*b;
        }
    }
    static abstract class C extends B{
        int sub(int a, int b){
            System.out.println(a-b);
            return a-b;
        } 
    }
    static class D extends C implements Innerabstraction{
        // Implement all interface methods
        @Override
        public int add(int a, int b) {
            return super.add(a, b);
        }

        @Override
        public int mul(int a, int b) {
            return super.mul(a, b);
        }

        @Override
        public int sub(int a, int b) {
            return super.sub(a, b);
        }

        @Override
        public int div(int a, int b) { // Return type corrected to int
            System.out.println(a / b);
            return a / b;
        }
    }
    public static void main(String[] args) {
        D obj = new D();
        obj.add(5, 4);
        obj.mul(5, 4);
        obj.sub(5, 4);
        obj.div(5, 4);
    }
}