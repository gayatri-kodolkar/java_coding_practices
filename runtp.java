class first{
    public void area(int h, int b, int s){
        System.out.println("area of perticular shape");
    }
}
class second extends first{
    public void area(int l, int b){
        System.out.println(l*b);
    }
}
class third extends second{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}
public class runtp {
    public static void main(String[] args) {
        third obj=new third();
        obj.area(4);
        obj.area(2, 3);
        obj.area(2, 3,5);
    }
}
