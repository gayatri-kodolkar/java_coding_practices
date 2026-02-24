public class secLarNum{
    public static void main(String[] args){
        int a=200;
        int b=480;
        int c=19999;
        int d=19999;
        int lar=0;
        int secLar=0;
        if(a>b){
            secLar=b;
            lar=a;
        }else{
            lar=b;
            secLar=a;
        }
        if(c>lar){
            
            secLar=lar;
            lar=c;
        }
        if(c<lar && c>secLar){
            secLar =c;
        }
        if(d>lar){
            lar=d;
        }
        if(d<lar && d>secLar){
            secLar = d;
        }
        System.out.println(secLar);
    }
}