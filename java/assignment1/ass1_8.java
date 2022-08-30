public class ass1_8 {
    public static void main(String[] args) {
        int[] arr={5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        for(int i=0;i<14;i++){
            for(int j=0;j<14;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<14;i++)
            System.out.print(arr[i]+" ");
    }
}
