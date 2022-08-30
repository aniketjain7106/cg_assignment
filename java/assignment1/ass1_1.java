import java.util.Scanner;
public class ass1_1{
    public static void main(String[] args) {
        System.out.println("enter your no");
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y=x;
        int sum=0;
        while(y!=0){
            sum+=Math.pow((y%10),3);
            y=y/10;
        }
        if (sum==x)
            System.out.println("Armstrong no");
        else
            System.out.println("Not armstrong number");
    }
}