public class thirdlargestnumfromarray {
    //find 3rd largest num from array
    public static void main(String[] args) {
        int arr[]={332, 33333, 4222, 53, 71111, 71111, 8};
        int largest=arr[0];//332
        int seclargest=0;//53
        int thirdlargest=0;//33
        for(int i=1; i<arr.length; i++){
            if(arr[i]>largest){
                thirdlargest=seclargest;
                seclargest=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>seclargest){
                thirdlargest=seclargest;
                seclargest=arr[i];
            }else if(arr[i]<largest && arr[i]<seclargest && arr[i]>thirdlargest){
                thirdlargest=arr[i];
            }
        }
        System.out.println(thirdlargest);
    }
}
