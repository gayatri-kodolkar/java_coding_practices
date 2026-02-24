//Multiple of 5 no. using parameterized constructor
public class Test4_5 {
    Test4_5(int a, int b, int c, int d, int e){
        int mul = a*b*c*d*e;
        System.out.println(mul);
    
    }


        public static void main(String[] args) {
            Test4_5 obj = new Test4_5(5,10,15,20,25);

        }
}
