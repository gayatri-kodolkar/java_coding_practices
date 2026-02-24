class first{
    void second() {
        int a=10, b=0, c;
        try{
            int arr[]={1, 2, 3};
            System.out.println(arr[3]);
            c=a/b;
            System.out.println(c);
        }catch(ArrayIndexOutOfBoundsException e1){
            System.out.println("checkout your array size");
        }catch(ArithmeticException e2){
            System.out.println("Check division value");
        }catch(Exception e){
            System.out.println(e);
        }
        
    } 
}
public class multiplecatchException {
    public static void main(String[] args) {
        first obj = new first();
        obj.second();
    }
}
