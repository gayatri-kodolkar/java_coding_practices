public class stringex22 {
    public static void main(String[] args) {
        String name= "alpha";
        String name2=name+name;//alphaalpha
        char ch[] = name2.toCharArray();
        int i=0; 
        while(i<name2.length()/2){
            for(int j=i; j<i+5; j++){
                System.out.print(ch[j]);
               
            }
             i++;
            System.out.println("");
        }

    }
}