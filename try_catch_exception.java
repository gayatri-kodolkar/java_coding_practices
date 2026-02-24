class first{
    void second(int b, int c){
        try{
            int a=b/c;
            System.out.println(a);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
public class try_catch_exception {
    public static void main(String[] args){
        int b=1;
        int c=0;
        first obj = new first();
        obj.second(b, c);
        
    }
}
