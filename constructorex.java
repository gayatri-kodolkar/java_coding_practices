class first{
    first(int a, int b){
        int sum=a+b;
        System.out.println(sum);
    }
    first(){
        System.out.println("hello");
    }
}
public class constructorex {
    public static void main(String[] args) {
        first obj=new first(10, 20);
    }
}
