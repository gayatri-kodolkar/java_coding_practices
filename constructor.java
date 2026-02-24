public class constructor {
    public static class first {
        first(int a, int b) {
            System.out.println(a + b);
        }
    }

    public static class second {
        second() {
            System.out.println("Hello world");
        }
    }

    public static void main(String[] args) {
        first obj1 = new first(10, 20);
        second obj = new second();

    }

}
