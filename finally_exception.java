class first{
    static void second(){
        int a=5, b=0, c;

        try{
            int arr[]={1, 2, 3};
            System.out.println(arr[2]);
            c=a/b;
            System.out.println(c);
        // }catch(ArrayIndexOutOfBoundsException e2){
        //     System.out.println("check your array size");
        // }catch(ArithmeticException e1){
        //     System.out.println("check your divisible value");
        }catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("thats finally exception block");
        }
    }
}

public class finally_exception {
    public static void main(String[] args) {
        first obj = new first();
        obj.second();
    }
}
