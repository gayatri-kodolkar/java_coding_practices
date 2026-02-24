public class minmaxnumfromarray {
    public static void main(String[] args) {
    int  num[] = new int[8];
    num[0]=8;
    num[1]=2;
    num[2]=11;
    num[3]=5;
    num[4]=1;
    num[5]=9;
    num[6]=1;
    num[7]=44;

    int min=num[0];
    int max=num[0];
    for(int i=1; i<num.length; i++){
        if(num[i]<min){
            min=num[i];
        }
        if(num[i]>max){
            max=num[i];
        }
    }
    System.out.println(min);
    System.out.println(max);
    }
}
