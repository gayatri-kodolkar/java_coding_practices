class first {
    first(int a, int b, int c) {
        if(a>b && a>c){
            System.out.println("a is greater:");
        }
        else if(b>a && b>c){
            System.out.println("b is greater");
        }
        else{
            System.out.println("c is greater");
        }
    }
}

public class constructorex2 {

    public static void main(String[] args) {
        first obj = new first(2, 50, 10);
    }
}
