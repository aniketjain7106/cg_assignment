/**
 * ass1_3
 */
import java.util.Scanner;
public class ass1_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p,r,t;
        System.out.println("Enter principal");
        p=sc.nextInt();
        System.out.println("Enter rate");
        r=sc.nextInt();
        System.out.println("Enter time");
        t=sc.nextInt();
        double si = (p*r*t)/100.0;
        System.out.println("SI is "+si);
        double ci = (p*((Math.pow((1+r/100),t))))-p;
        System.out.println("CI is "+ci);
    }
}