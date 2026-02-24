class first{
    void demo throws(){
        int a=10, b=20;
        if(a>b){
            System.out.println(a);
        }
        else{
            throw new NumberFormatException("b is smaller than a");
        }
    }
}
class second{
    void third(){
        try{
            demor();
        }catch(Exception e){
            System.out.println(e);
        }finally(){
            System.out.println("nice");
        }
    }
}
public class userdefined_throw {
    public static void main(String[] args) {
        second obj = new second();
        obj.third();
    }
}
