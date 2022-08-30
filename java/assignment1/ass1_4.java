import java.util.Scanner;
public class ass1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double m1,m2,m3;
        System.out.println("Enter no 1");
        m1=sc.nextDouble();
        System.out.println("Enter no 2");
        m2=sc.nextDouble();
        System.out.println("Enter no 3");
        m3=sc.nextDouble();
        if (m1>60 && m2>60 && m3>60)
            System.out.println("Passed");
        else if ((m1>60 && m2>60) || (m2>60 && m3>60) || (m1>60 && m3>60))
            System.out.println("promoted");
        else if ((m1<60 && m2<60) || (m2<60 && m3<60) || (m1<60 && m3<60))
            System.out.println("Failed");
    }
}
