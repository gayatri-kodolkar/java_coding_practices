public class pass1{
    public static void main(String[] args) {
        int a=10;
        int b=10;
        try{
            System.out.println(a/b);
        }
        catch(Exception e) {
            // TODO: handle exception
            System.out.println(e );
        }finally{
            System.out.println("hiii");
        }
    }
}