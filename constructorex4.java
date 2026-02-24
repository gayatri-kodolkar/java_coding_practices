class first {
    first(int a) {
        int sum=1;
        for(int i=a; i>=1; i--){
            sum = sum*i;
            
        }
        System.out.print(sum);
    }
}

public class constructorex4 {

    public static void main(String[] args) {
        first obj = new first(5);
    }
}
