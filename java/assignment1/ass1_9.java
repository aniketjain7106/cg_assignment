import java.util.Scanner;
public class ass1_9 {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++){
            System.out.println("Enter all three marks for student"+(i+1));
            for(int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            int sum=0;
            for(int j=0;j<3;j++){
                sum+=arr[i][j];
            }
            System.out.println("sum is "+sum+" for student"+(i+1));
            System.out.println("avg is "+(sum/3)+" for student"+(i+1));
        }
        int sum=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                sum+=arr[j][i];
            }
            System.out.println("sum is "+sum+" for subject"+(i+1));
            System.out.println("avg is "+(sum/3)+" for subject"+(i+1));
        }
    }
}
