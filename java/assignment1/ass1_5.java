import java.util.Scanner;
public class ass1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Enter ctc");
        x=sc.nextInt();
        if (x<=180000)
            System.out.println("No tax");
        else if (x>=180001 && x<=300000){
            int y=x-180000;
            System.out.print("Tax is");
            System.out.println((y/100)*10);
        }
        else if (x>=300001 && x<=500000){
            int y=x-300000;
            System.out.print("Tax is");
            System.out.println(12000+(y/100)*20);
        }
        else if (x>=500001 && x<=1000000){
            int y=x-500000;
            System.out.print("Tax is");
            System.out.println(52000+(y/100)*30);
        }
    }
}
