/**
 * ass1_2
 */
public class ass1_2 {

    public static void main(String[] args) {
        for (int i=100;i<=1000;i++)
        {
            int y=i;
            int sum=0;
            while(y!=0){
                sum+=Math.pow((y%10),3);
                y=y/10;
            }
            if (sum==i)
                System.out.println(i);
        }
    }
}