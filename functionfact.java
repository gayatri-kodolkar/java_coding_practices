class first{
    void second(int fact, int num){
        for(int i=1; i<=num; i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
public class functionfact {
    public static void main(String[] args) {
        first obj=new first();
        obj.second(1, 5);
    }
}
