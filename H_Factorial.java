import java.util.Scanner;

// WAP to find factorial of the nuber in java 
public class H_Factorial {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int no = sc.nextInt();
        sc.close();
        int fact=1;
        for(int i=1;i<=no;i++){
            fact =fact*i;
        }
        System.out.println("factorial of "+no+ " is " +fact);
    }
}
