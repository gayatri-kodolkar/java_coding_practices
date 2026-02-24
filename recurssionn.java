class a{
void first(int i, int n){
    if(i>n){
        return;
    }
    System.out.println(i);
    first(i+1, n);
}
}
public class recurssionn {
    public static void main(String[] args) {
    int i=1;
    int n=20;
    a obj = new a();
    obj.first(i, n);
    }
}
