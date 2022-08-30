public class ass1_7 {
    public static void main(String[] args) {
        int[] arr={5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        int p=0;
        for (int i=0;i<15;i++)
        {
            if (arr[i]==19){
                System.out.println("Found at "+(i+1));
                p=1;
            }
        }
        if (p==0)
            System.out.println("Not found");
    }
}
