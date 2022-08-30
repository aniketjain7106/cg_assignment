import java.util.Scanner;
public class ass1_6 {
    public static void main(String[] args) {
        String admin="admin";
        String pass="pass";
        int i=0;
        Scanner sc = new Scanner(System.in);
        String a,b;
        a=sc.next();
        b=sc.next();
        while(i!=2)
        {
            if (a==admin && b==pass)
            {
                System.out.println("Welcome");
                break;
            }
            else
            {
                System.out.println("Try again attemp no "+(i+1));
                i+=1;
                a=sc.next();
                b=sc.next();
            }
        }
        if (i==2)
            System.out.println("Contact admin");
    }
}