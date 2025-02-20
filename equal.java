import java.util.Scanner;   
public class equal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First Number:");
        int n1=sc.nextInt();
        System.out.println("Enter the Second Number:");
        int n2=sc.nextInt();
        System.out.println("Enter the Third Number:");
        int n3=sc.nextInt();
        if(n1==n2)
        {
            if(n2==n3)
            {
                System.out.println("All the Numbers are Equal");
            }
            else
            {
                System.out.println("The Numbers are Not Equal");
            }
        }
        else
        {
            System.out.println("The Numbers are Not Equal");
        }
    }
}